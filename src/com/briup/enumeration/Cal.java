package com.briup.enumeration;

public enum Cal {
	//枚举类可以实现抽象方法
ADD {
	@Override
	int calculator(int i, int j) {
		
		return i+j;
	}
},SUB {
	@Override
	int calculator(int i, int j) {
		return i-j;
	}
},MUL {
	@Override
	int calculator(int i, int j) {
		return i*j;
	}
},DIV {
	@Override
	int calculator(int i, int j) {
		return i/j;
	}
};
abstract int calculator(int i,int j);
public static void main(String[] args) {
	Cal add=Cal.ADD;
	System.out.println(add.calculator(4, 9));
	Cal sum=Cal.SUB;
	System.out.println(sum.calculator(4, 9));
	Cal mul=Cal.MUL;
	System.out.println(mul.calculator(4, 9));
	Cal div=Cal.DIV;
	System.out.println(div.calculator(4, 9));
}
}













