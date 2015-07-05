package com.briup.foreach;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class ForEach {
	public static void main(String[] args) {
		String[] strs = { "星期一", "星期二", "星期三", "星期四", "星期五", "星期六", "星期日" };
		String week = "1+2+3-4*8/=6";
		// String[] str0=week.split("\\+",9);
		String[] str0 = week.split("[+*/=-]");
		String[] str1 = week.split("[0-9=]");
		for (int i = 0; i < str0.length; i++) {

			System.out.println(str0[i]);
		}
		for (int i = 0; i < str1.length; i++) {

			System.out.println(str1[i]);
		}
		System.out.println("--------------------------------");
		// java5之前
		for (int i = 0; i < strs.length; i++) {
			System.out.println(strs[i]);
		}
		System.out.println("==================");

		// java5之后
		for (String s : strs) {
			System.out.println(s);
		}
		System.out.println("==========List========");
		List list = new LinkedList();
		list.add("zhagnsan");
		list.add("lisi");
		list.add("wangwu");

		// java5之前
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("=======================");
		// java5之后
		for (Object l : list) {
			System.out.println(l);
		}

		System.out.println("===========Set==========");
		Set set = new HashSet();
		set.add("lili");
		set.add("jack");
		set.add("jj");

		// java5之前
		Iterator itr = set.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("java5之后");
		// java5之后
		for (Object s : set) {
			System.out.println(s);
		}

	}
}
