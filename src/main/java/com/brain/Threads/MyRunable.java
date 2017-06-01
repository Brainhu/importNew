package com.brain.Threads;

/**
 * Created by Brainhu on 15/5/23.
 */
public class MyRunable{

    private  int j;

    public static  void main(String args[]){
        MyRunable tt = new MyRunable();
        Thread t1 = new Thread(tt.new Dec());
        t1.start();
        Thread d1 = new Thread(tt.new Inc());
        d1.start();
    }
    private synchronized void inc(){
        j++;
        System.out.println(Thread.currentThread().getName()+"-inc:"+j);
    }
    private synchronized void dec(){
        j--;
        System.out.println(Thread.currentThread().getName()+"-dec:"+j);
    }

    class Inc implements Runnable{
        public void run(){
         for(int i=0;i<100;i++){ inc();
        }
     }
    }
    class Dec implements Runnable {
        public void run() {
            for (int i = 0; i < 100; i++) {
                dec();
            }
        }
    }

}
