package com.brain.base;

/**
 * Created by Brainhu on 15/5/30.
 */
public class Change {

    String str = "good";
    char[] ch = {'a','b','c'};

    public static void main(String[] args){
        Change change = new Change();
        change.change(change.str,change.ch);
        System.out.println(change.str+"\n"+change.ch.toString());

    }


    public void change(String str, char ch[]){
        str = "testok";
        ch[0]='g';
    }
}
