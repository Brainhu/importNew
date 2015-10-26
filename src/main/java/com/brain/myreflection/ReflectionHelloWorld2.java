package com.brain.myreflection;

import java.lang.reflect.Constructor;

/**
 * Created by Brainhu on 15/5/24.
 */
public class ReflectionHelloWorld2 {
    public static void main(String[] args){
        // 创建Class实例
        Class<?> c = null;
        try{
            c=Class.forName("com.brain.myreflection.Foo2");
        }catch(Exception e){
            e.printStackTrace();
        }

        // 创建Foo实例
        Foo2 f1 = null;
        Foo2 f2 = null;

        // 获取所有的构造函数
        Constructor<?> cons[] = c.getConstructors();

        try {
            f1 = (Foo2) cons[0].newInstance();
            f2 = (Foo2) cons[1].newInstance("abcd");
        } catch (Exception e) {
            e.printStackTrace();
        }

        f1.print();
        f2.print();
    }
}

