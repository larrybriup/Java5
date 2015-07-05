package com.briup.annotation;

public class AnnotationTest {

	@Override
	public String toString() {
		return "AnnotationTest";
	}
	@MyAnnotation("briup")
	@Deprecated
	public void print(){
		System.out.println("deprecated test");
	}
	@MyAnnotation("briup")
//	@MyAnnotation({"briup","vfvd"})
	public static void main(String[] args) {
		Thread.currentThread().stop();
	}
}
