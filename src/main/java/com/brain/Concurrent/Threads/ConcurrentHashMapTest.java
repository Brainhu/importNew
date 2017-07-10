package com.brain.Concurrent.Threads;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by Brainhu on 2017/6/16.
 */
public class ConcurrentHashMapTest {


    public static void main(String args[]){

        final Map<String,String> map = new ConcurrentHashMap<String, String>();
        map.put("key","value");

        Thread thread1 = new Thread(new Runnable(){

            public void run() {
                System.out.println(map.get("key"));
            }
        });
        Thread thread2 = new Thread(new Runnable(){

            public void run() {
                System.out.println(map.get("key"));
            }
        });
        Thread thread3 = new Thread(new Runnable(){

            public void run() {
                System.out.println(map.get("key"));
            }
        });

        thread1.run();
        thread2.run();
        thread3.run();
    }

}
