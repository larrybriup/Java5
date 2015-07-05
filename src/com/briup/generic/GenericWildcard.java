package com.briup.generic;

import java.util.ArrayList;

public class GenericWildcard<T> {
	private T test;

	public T getTest() {
		return test;
	}

	public void setTest(T test) {
		this.test = test;
	}
	
	public static void main(String[] args) {
		GenericWildcard<?> gw = new GenericWildcard<String>();
		gw.getTest();
		GenericWildcard<? extends Number> gw1 =
//				new GenericWildcard<Integer>();
				new GenericWildcard<Float>();
		
		GenericWildcard<? extends Iterable> gw2 =
				new GenericWildcard<ArrayList>();
		
		//? super Integer ? is Integer's father class 
		GenericWildcard<? super Integer> gw3 =
				new GenericWildcard<Number>();
		
		//可以是null但是不可以设置
		GenericWildcard<? extends Object> gw4 = new GenericWildcard<String>();
		gw4.setTest(null);
//				"test");
		gw4.getTest();
		//bug
		ArrayList list = new ArrayList();
		list.add(1);
		list.add(3.5);
		list.add("test");
		list.add("String");
		
		ArrayList<? extends Number> testlist = null;
		testlist=list;
		
		for(Object o:list){
			System.out.println(o);
		}
				
	}
}

















