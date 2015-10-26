package com.brain.base;

/**
 * Created by Brainhu on 15/5/30.
 */
public class HelloB extends HelloA{
    {
        System.out.println("I’m B class");
    }
    static {
        System.out.println("static B");
    }

    public static  void main(String[] args){
        new HelloB();
    }
}

class HelloA{
    {
        System.out.println("I’m A class");
    }
    static {
        System.out.println("static A");
    }
}