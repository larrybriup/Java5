package com.briup.varargs;

public class VarargsTest {

	//int...相当于int[]
	public int sum(int... array) {
		int sum=0;
		for(int i:array){
			sum+=i;
		}
		
		
		return sum;
	}
	public static void main(String[] args) {
		VarargsTest vt = new VarargsTest();
		System.out.println(vt.sum(1,2));
		System.out.println(vt.sum(1,2,3));
		System.out.println(vt.sum(1,3,4,4));
		System.out.println(vt.sum(1,4,5,6,6));
	}
}
