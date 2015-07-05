package com.briup.foreach;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class ForEachMap {
	public static void main(String[] args) {
		Map map = new HashMap();
		map.put("a", "小明");
		map.put("b", "大明");
		map.put("c", "二明");
System.out.println(map.values());
System.out.println(map.toString());
System.out.println(map.keySet());
System.out.println("//////////////////////////////");
		// java5之前
		Set keys = map.keySet();
		Iterator itr = keys.iterator();
		while (itr.hasNext()) {
			System.out.println(map.get(itr.next()));
		}
		System.out.println("------------------");
		/*
		 * for (int i = 1; i <= map.size(); i++) {
		 * System.out.println(map.get(i)); }
		 * System.out.println("--------------------");
		 */

		Set entrys = map.entrySet();
		Iterator iter = entrys.iterator();

		while (iter.hasNext()) {
			Entry entry = (Entry) iter.next();
			System.out.println("key=" + entry.getKey());
			System.out.println("value=" + entry.getValue());
		}

		/**
		 * 输出 b=大明 c=二明 a=小明
		 */
		/*
		 * while (iter.hasNext()) { System.out.println(iter.next()); }
		 */
		System.out.println("=========================");

		// java5之后
		Collection values = map.values();
		Iterator iter3 = values.iterator();
		while (iter3.hasNext()) {
			System.out.println(iter3.next());
		}

	}
}
