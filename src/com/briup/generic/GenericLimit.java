package com.briup.generic;

import java.util.ArrayList;

public class GenericLimit<T extends Iterable<String>>{
//Number> {
private T var;

public T getVar() {
	return var;
}

public void setVar(T var) {
	this.var = var;
}


public static void main(String[] args) {
//	GenericLimit<Integer> gl = new GenericLimit<Integer>();
//	gl.setVar(1);
//	System.out.println(gl.getVar());
//	
//	GenericLimit<Double> gld = new GenericLimit<Double>();
//	gld.setVar(1.3);
//	System.out.println(gld.getVar());
	
//	GenericLimit<String> gls = new GenericLimit<String>();
//	gld.setVar(1.3);
	
	GenericLimit<ArrayList<String>> gl = new GenericLimit<ArrayList<String>>();
//	gl.setVar(1);
//	System.out.println(gl.getVar());
}
}
