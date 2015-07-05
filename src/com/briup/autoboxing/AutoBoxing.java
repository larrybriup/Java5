package com.briup.autoboxing;

import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

public class AutoBoxing {
	public static void main(String[] args) {

		// java5之前
		int i = 10;
		// 装箱
		Integer integer1 = new Integer(i);
		Integer integer2 = Integer.valueOf(i);
		// 拆箱
		int i2 = integer1.intValue();

		// java5之后
		// 自动装箱
		Integer integer3 = i;
		// 自动拆箱
		int i3 = integer3;
		List ages = new ArrayList();
		ages.add(i);
		ages.add(20);
		ages.add(50);
		Iterator iterator = ages.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println("===================================");
		//缓存大小-128~127
		Integer int1 = -129;
		Integer int2 = -129;
System.out.println(Math.pow(2, 7));
		if (int1 == int2) {
			System.out.println("int1==int2");
		} else {
			System.out.println("int1!=int2");
		}
	}

}
