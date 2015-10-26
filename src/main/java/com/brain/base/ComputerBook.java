package com.brain.base;

/**
 * Created by Brainhu on 15/5/22.
 */

class Book{
    protected int getPrice(){
        return 30;
    }
}
public class ComputerBook extends Book{

    public int getPrice(){
        return 0;
    }
}