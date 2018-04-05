package com.brain.Concurrent.Threads;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveTask;

/**
 * 第六版 用Fork-join api jdk 1.7
 *
 *这里我们假定要遍历一个文件目录,因为文件的目录可以包含嵌套若干层的目录或者文件,从某种角度来说
 *构成了一个树形结构。我们再遍历到每个文件的时候,可以将目录作为一个子task来处理,这里就可以形成一个完整的
 *fork/join pool应用
 *
 * 这个版本的的性能要比本章前面其他并发版本好很多。同时我们也注意要,对于大型的分层目录,程序也没有重蹈navie版本的覆辙
 *
 * 在本例中,我们递归地将归扫描任务进行分解,直至任务无法再拆分,但一般来说,拆分粒度过细会显著增加线程调度的开销,所以我们并不希望将问题拆分得过小。
 * java.util.concurrent包中定义了很多线程安全的集合类,这些集合类即保证了并发编程环境下的数据安全性,同时也可以被当成同步点来使用。虽然线程安全是很重要的,
 * 但我们也不想为此牺牲太多性能。
 * @author zeuskingzb
 *
 */
public class FileSize {
    private final static ForkJoinPool forkjoinPool = new ForkJoinPool();
    private static class FileSizeFinder extends RecursiveTask<Long>{
        final File file;
        public FileSizeFinder(final File theFile) {
            // TODO Auto-generated constructor stub
            file = theFile;
        }

        @Override
        protected Long compute() {
            // TODO Auto-generated method stub
            long size = 0;
            if (file.isFile()) {
                size = file.length();
            }else{
                File[] children = file.listFiles();
                if (children != null) {
                    List<ForkJoinTask<Long>> tasks = new ArrayList<ForkJoinTask<Long>>();
                    for (File child : children) {
                        if (child.isFile()) {
                            size += child.length();
                        }else{
                            tasks.add(new FileSizeFinder(child));
                        }
                    }
                    for (ForkJoinTask<Long> forkJoinTask : invokeAll(tasks)) {
                        size +=  forkJoinTask.join();
                    }
                }
            }
            return size;
        }

    }

    public static void main(String[] args) throws InterruptedException {
        final long start = System.nanoTime();
        final long total = forkjoinPool.invoke(new FileSizeFinder(new File("/usr")));
        final long end = System.nanoTime();
        System.out.println("Total size :"+total);
        System.out.println("Time taken:"+ (end-start)/1.0e9);
    }
}