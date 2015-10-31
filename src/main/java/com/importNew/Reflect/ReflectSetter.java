package com.importNew.Reflect;

import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * 
 * @author Brainhu
 *
 */
public class ReflectSetter{
	
	//ʹ�÷������ö��������ֵ
	public static void invokeSetter(Object obj , String field ,Object value) 
			throws NoSuchMethodException,InvocationTargetException,IllegalAccessException{
		
		String methodName = "set" +field.substring(0,1).toUpperCase() + field.substring(1);
		Class<?> clazz = obj.getClass();
		Method method = clazz.getMethod(methodName ,value.getClass());
		method.invoke(obj, value);
	}
	//ʹ�÷���api��������
	public void useArray(){
		String[] names =(String[])Array.newInstance(String.class, 10);
		names[0] = "Hello";
		Array.set(names, 1, "World");
		String str = (String )Array.get(names, 0);
		int[][][] matrix1 = (int [][][])Array.newInstance(int.class, 3,3,3);
		matrix1[0][0][0]=1;
		int[][][] matrix2 = (int [][][])Array.newInstance(int[].class, 3,4);
		matrix2[0][0]= new int[10];
		matrix2[0][1]= new int[3];
		matrix2[0][0][1]= 1;
		System.out.println(str);
	}
}
