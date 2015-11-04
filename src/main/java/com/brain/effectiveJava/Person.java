package com.brain.effectiveJava;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

/**
 * Created by Brainhu on 15/11/1.
 */
public class Person {
    private final Date birthDate;

    private static final Date BOOM_START;
    private static final Date BOOM_END;

    //初始化的时候创建一次calendar、timezone、date 而不是每次调用 isBabyBoomer去创建
    static {
        Calendar gmtCal =
                Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        gmtCal.set(1946,Calendar.JANUARY,1,0,0,0);
        BOOM_START = gmtCal.getTime();
        gmtCal.set(1965,Calendar.JANUARY,1,0,0,0);
        BOOM_END = gmtCal.getTime();
    }

    public Person(Date birthDate) {
        this.birthDate = birthDate;
    }

    public boolean isBabyBoomer(){
        return birthDate.compareTo(BOOM_START)>=0 &&
                birthDate.compareTo(BOOM_END)<0;
    }

}
