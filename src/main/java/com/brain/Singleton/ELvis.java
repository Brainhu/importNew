package com.brain.Singleton;

/**
 * Created by Brainhu on 15/10/31.
 */
public class ELvis {
    private ELvis(){}

    public static final ELvis getInstance(){
        return ELvisHolder.INSTANCE;
    }

    private static class ELvisHolder{
        private static final ELvis INSTANCE = new ELvis();
    }

    public void leaveTheBuilding(){
        System.out.println("you must leave the building right now!");

    }
}
