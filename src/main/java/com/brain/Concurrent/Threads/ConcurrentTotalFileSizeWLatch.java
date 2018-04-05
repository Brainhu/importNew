package com.brain.Concurrent.Threads;

import java.io.File;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/**
 * 第四版
 * 每个线程都去更新一个共享变量。
 * 我们必须保证主线程要等待所有了目录遍历完成之后才能结束。
 * 我们在这里使用 CountDownLatch 作为等待结束的标记,Latch的作用是作为一个
 * 或多个线程等待其他线程到达其完成位置的同步点，这里我们简单地将其作为一个开关使用
 *
 * 我们递归地将扫描子目录的任务委托给不同的线程.当扫描到一个文件时,线程不再返回一个计算结果,而是去更新一个AtomicLong类型的
 * 共享变量totalSize，AtomicLong提供了更改并取回一个简单long型变量的线程安全的方法.此外,我们还会用到另一个叫做pendingFileVisists的AtomicLong
 * 型变量,其作用是保存当前待访问文件的数量。当变量为0时,我们就调用countDown()来释放线程闩.
 *
 * CountDownLatch最重要的方法是countDown()和await()，前者主要是倒数一次，后者是等待倒数到0，如果没有到达0，就只有阻塞等待了。
 * @author zeuskingzb
 *
 */
public class ConcurrentTotalFileSizeWLatch {
    private ExecutorService executorService;
    //保存当前待访问文件的数量
    final private AtomicLong pendingFileVisits = new AtomicLong();
    final private AtomicLong totalSize = new AtomicLong();
    final private CountDownLatch latch = new CountDownLatch(1);
    private void updateTotalSizeOfFilesInDir(final File file){
        long fileSize = 0;
        if (file.isFile()) {
            fileSize = file.length();
        }else{
            final File[] children = file.listFiles();
            if (children != null) {
                for (final File child : children) {
                    if (child.isFile()) {
                        fileSize +=child.length();
                    }else{
                        pendingFileVisits.incrementAndGet();
                        System.out.println("pendingFileVisits.incrementAndGet()"+pendingFileVisits+"thread:"+Thread.currentThread().getName());
                        executorService.execute(new Runnable() {
                            @Override
                            public void run() {
                                // TODO Auto-generated method stub
                                updateTotalSizeOfFilesInDir(child);
                            }
                        });
                    }


                }
            }

        }
        totalSize.addAndGet(fileSize);
        System.out.println("pendingFileVisits.decrementAndGet()"+pendingFileVisits+"thread:"+Thread.currentThread().getName());
        if (pendingFileVisits.decrementAndGet() == 0) {
            //可以执行下一个动作
            latch.countDown();
        }
    }
    private long getTotalSizeOfFile(final String fileName) throws InterruptedException{
        executorService = Executors.newFixedThreadPool(100);
        pendingFileVisits.incrementAndGet();
        try{
            updateTotalSizeOfFilesInDir(new File(fileName));
            latch.await(100,TimeUnit.SECONDS);
            return totalSize.longValue();
        }finally{
            executorService.shutdown();
        }

    }
    public static void main(String[] args) throws InterruptedException {
        final long start = System.nanoTime();
        final long total = new ConcurrentTotalFileSizeWLatch().getTotalSizeOfFile("/usr");
        final long end = System.nanoTime();
        System.out.println("Total size :"+total);
        System.out.println("Time taken:"+ (end-start)/1.0e9);
    }
}
