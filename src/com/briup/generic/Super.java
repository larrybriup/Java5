package com.briup.generic;

import java.util.ArrayList;

import javax.xml.crypto.AlgorithmMethod;

public class Super<T1, T2> {
	private T1 t1;
	private T2 t2;

	public T1 getT1() {
		return t1;
	}

	public void setT1(T1 t1) {
		this.t1 = t1;
	}

	public T2 getT2() {
		return t2;
	}

	public void setT2(T2 t2) {
		this.t2 = t2;
	}

}

class Sub<T1,T3> extends Super<T1, Boolean> {
	private T3 t3;
	public T3 getT3() {
		return t3;
	}
	
	
	public void setT3(T3 t3) {
		this.t3 = t3;
	}
//	
//	
//	public T2 getT2() {
//		return t2;
//	}
//
//
//	public void setT2(T2 t2) {
//		this.t2 = t2;
//	}


	public static void main(String[] args) {
//		Sub<String,String> sub = new Sub<String,String>();
//		sub.setT1("df");
//		sub.setT2(true);
//		System.out.println(sub.getT1()+" "+sub.getT2());
		ArrayList list = new ArrayList<String>();
		list.add("t");
		list.add(1);
		for(Object o:list){
			System.out.println(o);
		}
		
		ArrayList<String> list1= new ArrayList();
		
		
		
		
	}


}









