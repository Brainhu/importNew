package com.brain.Concurrent.Threads;

import java.io.File;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/**
 * 第五版
 * 这个版本的程序在性能 方面与前一版本相仿，但在代码简化方面又提升了一个档次，这主要归功于阻塞队列帮我们完成了线程间的数据
 * 交换和同步操作。
 * @author zeuskingzb
 *
 */
public class ConcurrentTotalFileSizeWQueue {
    private ExecutorService service;
    final private BlockingQueue<Long> fileSizes = new ArrayBlockingQueue<Long>(500);
    final AtomicLong pendingFileVisits = new AtomicLong();
    /**
     * 多线程浏览文件
     * @param file
     */
    private void startExploreDir(final File file) {
        pendingFileVisits.incrementAndGet();
        //System.out.println("pendingFileVisits.incrementAndGet()"+pendingFileVisits);
        service.execute(new Runnable() {

            @Override
            public void run() {
                // TODO Auto-generated method stub
                exploreDir(file);
            }
        });
    }
    /**
     * 浏览文件,文件的运行过程
     * @param file
     */
    private void exploreDir(File file) {
        long fileSize = 0;
        if (file.isFile()) {
            fileSize = file.length();
        } else {
            File[] children = file.listFiles();
            if (children != null) {
                for (final File child : children) {
                    if (child.isFile()) {
                        fileSize += child.length();
                    } else {
                        startExploreDir(child);
                    }
                }
            }
            try {
                // 把fileSize加到BlockingQueue里,如果BlockQueue没有空间,则调用此方法的线程被阻断直到BlockingQueue里面有空间再继续
                fileSizes.put(fileSize);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            pendingFileVisits.decrementAndGet();
            //System.out.println("pendingFileVisits.decrementAndGet()"+pendingFileVisits);
        }
    }
    private long getTotalSizeOfFile(String fileName) throws InterruptedException{
        service = Executors.newFixedThreadPool(100);
        try {
            startExploreDir(new File(fileName));
            long totalSize = 0;
            while (pendingFileVisits.get() >0 || fileSizes.size()>0) {
                // 从BlockingQueue取出一个队首的对象,如果在指定时间内,队列一旦有数据可取,则立即返回队列中的数据
                //否则知道时间超时还没有数据可取,返回失败。
                final long size = fileSizes.poll(10, TimeUnit.SECONDS);
                //System.out.println(size);
                totalSize += size;
            }
            return totalSize;
        }finally{
            service.shutdown();
        }
    }
    public static void main(String[] args) throws InterruptedException {
        final long start = System.nanoTime();
        final long total = new ConcurrentTotalFileSizeWQueue().getTotalSizeOfFile("/usr");
        final long end = System.nanoTime();
        System.out.println("Total size :"+total);
        System.out.println("Time taken:"+ (end-start)/1.0e9);
    }
}
