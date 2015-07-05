package com.briup.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.annotation.Resource;
import javax.lang.model.element.Element;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Documented
public @interface MyAnnotation {
//	String name(); //default "briup";// 属性
	String value();//只能是value 的时后才能给他同时赋值, 
	int value1() default 1;
	
	
//	Class value1() default SubAnnotation.class ;
//	Color value2() default Color.BLUE;
//	Override value3();
//	Object value4();
//	
}
enum Color{
	BLUE,RED,YELLOW
}