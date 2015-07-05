package com.briup.printf;

import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class PrintfTest {
	public static void main(String[] args) {
	int num=1;
	String str ="Hello";
	//输出格式,%d,d是十进制数字
	System.out.printf("num is %d, str is %s", num,str);
//	System.out.println();
	System.out.println("***********************************");
	
//	System.out.println("I'm Tom,Tom's Tom");
	int age=18;
	String name="Tom";
	//1$指向参数列表的第一个参数
	System.out.printf("I'm %1$s,%1$s's %1$s,I'm %2$d%n",name,age);
	System.out.printf("%%");
	System.out.println();

	Date date = new Date();
	System.out.println(date);
	System.out.println("=====================1=================");
	System.out.printf("%tc",date);
	System.out.println();
	System.out.println("======================2================");
	System.out.printf(Locale.ENGLISH,"%tc",date);
	System.out.println();
	System.out.println("======================3================");
	System.out.printf("%1$tF %1$tT",date);
//	System.out.printf(" %tT",date);
	System.out.println();
	System.out.println("=======================4===============");
	System.out.printf("%1$tY年 %1$tm月 %1$td日,%1$tH时 %1$tM分 %1$tS秒",date);
System.out.println("---------------------------");

//System.out.printf();
Calendar cal= Calendar.getInstance(Locale.CHINESE);
//cal.DATE
	System.out.printf("%tc",cal);
	System.out.println(cal.DAY_OF_WEEK);
	Date d = new Date();
	System.out.println(d.toGMTString());
	System.out.println(d.toLocaleString());
	}
}
