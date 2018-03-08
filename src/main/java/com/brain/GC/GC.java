package com.brain.GC;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Brainhu on 15/6/1.
 * 这段代码会引起内存泄露
 */
public class GC {
    public static void main(String[] main) {
        List l = new LinkedList();
        // Enter infinite loop which will add a String to the list: l on each
        // iteration.
        do {
            l.add(new String("Hello, World"));
        } while (true);
    }

}
