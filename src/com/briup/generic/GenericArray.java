package com.briup.generic;

public class GenericArray<T> {
private T[] arrays;

public GenericArray(){
arrays=(T[]) new Object[10];
}
//public GenericArray(T[] arrays){
//	
//	this.arrays=arrays;
//}
public T[] getArrays() {
	return arrays;
}

public void setArrays(T[] arrays) {
	this.arrays = arrays;
}

public static void main(String[] args) {
//	GenericArray<String> ga = new GenericArray<String>(args);
//	ga.setArrays("dd");
}
}
