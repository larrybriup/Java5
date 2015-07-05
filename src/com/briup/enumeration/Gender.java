package com.briup.enumeration;

public class Gender {
private String gender;
private static final Gender MALE=new Gender("male");
private static final Gender FEMALE=new Gender("female");
private Gender(String gender){
	this.gender = gender;
}
public static Gender getInstance(String gender){
	if(gender.equals("MALE")){
		return MALE;
	}
	if(gender.equals("FEMALE")){
		return FEMALE;
	}
	return null;
}

@Override
public String toString() {
	return gender;
}
public static void main(String[] args) {
//	Gender male= new Gender("male");
//	Gender female= new Gender("female");
//	Gender other= new Gender("other");
	Gender male=Gender.getInstance("MALE");
	System.out.println(male);
	Gender female=Gender.FEMALE;
	System.out.println(female);
}
}
