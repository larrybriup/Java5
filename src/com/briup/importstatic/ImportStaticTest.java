package com.briup.importstatic;
//import com.briup.common.Common;
import static com.briup.common.Common.str;
import static com.briup.common.Common.add;
public class ImportStaticTest {
	public static void main(String[] args) {
		//jdk5之前
//		System.out.println(Common.str);
//		System.out.println(Common.add(1, 9));
		//jdk5之后
		System.out.println(str);
//		System.out.println(Common.add(1, 9));
	}
}
