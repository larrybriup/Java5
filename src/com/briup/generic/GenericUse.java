package com.briup.generic;

import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

public class GenericUse {
	public static void main(String[] args) {
//		List<String> list = new ArrayList<String>();
//		list.add("fuck");
//		list.add("jj");
		List<Number> list = new ArrayList<Number>(); 
		list.add(1);
		list.add(2);
		
		Iterator<Number> iter=list.iterator();
		while(iter.hasNext()){
			Number content= iter.next();
			System.out.println(content);
		}
		System.out.println("================================");
		for(Number s:list){
			System.out.println(s);
		}
	}
}
