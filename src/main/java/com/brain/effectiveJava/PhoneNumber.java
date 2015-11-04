package com.brain.effectiveJava;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Brainhu on 15/11/4.
 */
public final class PhoneNumber {
    private final short areaCode;
    private final short prefix;
    private final short lineNumber;

    public PhoneNumber(int areaCode,int prefix,
                       int lineNumber){
        reangeCheck(areaCode,   999,"area code");
        reangeCheck(prefix,   999,"prefix");
        reangeCheck(lineNumber,   9999,"lineNumber");

        this.areaCode = (short) areaCode;
        this.prefix = (short) prefix;
        this.lineNumber = (short) lineNumber;

    }

    private static void reangeCheck(int arg, int max,
                                    String name){
        if(arg < 0 || arg > max){
            throw new IllegalArgumentException(name + ":"+ arg);
        }
    }
    @Override public boolean equals(Object o){
        if(o == this)
            return true;
        if(!(o instanceof  PhoneNumber))
            return false;
        PhoneNumber pn = (PhoneNumber)o;
        return pn.lineNumber == lineNumber
                && pn.prefix == prefix
                && pn.areaCode == areaCode;
    }

    /**
     * 覆盖hashcode方法后才能使保证相同对象具有相同的散列码
     * @return
     */
    /*@Override public int hashCode(){
        int result = 17;
        result = 31 * result + areaCode;
        result = 31 * result + prefix;
        result = 31 * result + lineNumber;
        return  result;
    }*/

    public static void main(String args[]){
        Map<PhoneNumber ,String> m
                = new HashMap<PhoneNumber, String>();
        m.put(new PhoneNumber(707, 867, 5390), "Brainhu");

        System.out.println(m.get(new PhoneNumber(707, 867, 5390)));
    }
}
