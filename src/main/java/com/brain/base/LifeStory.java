package com.brain.base;

import java.util.Random;

/**
 * Created by Brainhu on 2017/4/17.
 *
 */
public class LifeStory {

    long crossTime = System.currentTimeMillis() + Math.abs(new Random().nextInt());

    public Person waitMyLove(){
        if(System.currentTimeMillis() >= crossTime){
            return new Person(MyInfo.realName);
        }else{
            return null;
        }
    }
}
