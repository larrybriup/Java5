package com.briup.enumeration;

import java.util.EnumMap;
import java.util.EnumSet;

public class EnumMapSet {

	public static void main(String[] args) {
		System.out.println("==========EnumMap==========");
		EnumMap em = new EnumMap(Number.class);
		em.put(Number.ONE, "one");
		System.out.println(em.get(Number.ONE));
		em.put(Number.ONE, "onesdg");
		System.out.println(em.get(Number.ONE));
		EnumMap em2 = new EnumMap(em);
		System.out.println(em2.get(Number.ONE));
		System.out.println("==========EnumSet==========");
//		EnumSet es = EnumSet.of(Number.ONE,Number.TWO);
		EnumSet es = EnumSet.range(Number.TWO, Number.FIVE);
//				.allOf(Number.class);
//		es.add(Number.TWO);traffick
		for(Object o:es){
			System.out.println(o);
		}
		
	}
}

enum Number {
	ONE, TWO, THREE, FOUR,FIVE
}