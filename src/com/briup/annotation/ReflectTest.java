package com.briup.annotation;

import java.lang.reflect.Method;

public class ReflectTest {
	public static void main(String[] args) {
		
//	Class clazz;
	try {
		Class clazz = Class.forName("com.briup.annotation.AnnotationTest");
	Method print=
			clazz.getDeclaredMethod("print", null);
	if (print.isAnnotationPresent(MyAnnotation.class)) {
		MyAnnotation ma=
				print.getAnnotation(MyAnnotation.class);
		System.out.println(ma.value());
		System.out.println(ma.value1());
	}else{
		System.out.println("没有注解");
	}
	
	} catch (Exception e) {
		// TODO: handle exception
	}
	}
}
