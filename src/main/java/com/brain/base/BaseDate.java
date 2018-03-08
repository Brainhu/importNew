package com.brain.base;

import org.joda.time.DateTime;

import java.util.Random;

/**
 * Created by Brainhu on 2017/7/9.
 */
public class BaseDate {


    public static void main(String[] args) {
        float d1 = 423432423f;
        float d2 = d1+1;
        if(d1==d2 ){
            System.out.println("d1==d2");
        }else{
            System.out.println("d1!=d2");
        }

        long l1= 98999L;
        int i1 = (int)l1;

        /*do{
            System.out.println(a); a++;
        } while (a<0);*/


        /*for(int i=0;i<=10;i++){ System.out.println(i); //循环体
        } System.out.println("(((((("+i);*/

        //随机数
        double mr = Math.random();
        System.out.println(mr);

        Random r = new Random();
        System.out.println(r.nextInt(12));//生成1-12 之间的随机数

        //打印空心正方形
        int line = 5; // 正方形的总行数(5行5列)
        for (int i = 1; i <= line; i++) { // 控制行
            for (int j = 1; j <= line; j++) { // 控制列
                if (i == 1 || i == line) { // 如果是第一行或者是最后一行则打印星号
                    System.out.print("*");
                } else if (j == 1 || j == line) { // 如果是第一列或者是最后一列则打印星号
                    System.out.print("*");
                } else {
                    System.out.print(" "); // 如果不是第一行、最后一行、第一列、最后一列则打印空格
                }
            }
            System.out.print("\n"); // 换行
        }

        //日期操作
        DateTime dt = new DateTime();
        System.out.println(dt);
    }
}
