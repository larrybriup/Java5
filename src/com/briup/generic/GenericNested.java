package com.briup.generic;

public class GenericNested<T> {
private Generic<T> g;

public Generic<T> getG() {
	return g;
}

public void setG(Generic<T> g) {
	this.g = g;
}
public static void main(String[] args) {
	GenericNested<String> gn = new GenericNested<String>();
	
	Generic<String> g = new Generic<String>();
	gn.setG(g);
	
	Generic<String> g1 = new Generic<String>();
	gn.setG(g1);
}

}
class Generic<T>{
	private T i;

	public T getI() {
		return i;
	}

	public void setI(T i) {
		this.i = i;
	}
	
}