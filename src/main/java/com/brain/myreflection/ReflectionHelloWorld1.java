package com.brain.myreflection;

/**
 * Created by Brainhu on 15/5/24.
 */
public class ReflectionHelloWorld1 {
    public static void main(String[] args){
        // 创建Class实例
        Class<?> c = null;
        try{
            c=Class.forName("com.brain.myreflection.Foo");
        }catch(Exception e){
            e.printStackTrace();
        }

        // 创建Foo实例
        Foo f = null;

        try {
            f = (Foo) c.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }

        f.print();
    }
}
