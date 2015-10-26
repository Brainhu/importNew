package com.brain.base;

/**
 * Created by Brainhu on 15/5/30.
 */
public class Inc {

    public static void main(String[] args) {
        Inc inc = new Inc();
        int i = 0;
        inc.fermin(i);
        i= i ++;
        System.out.println(i);
    }

    void fermin(int i){
        i++;
    }
}
