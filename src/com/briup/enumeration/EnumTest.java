package com.briup.enumeration;

import javax.print.attribute.standard.MediaSize.Other;

public class EnumTest {
	public static void main(String[] args) {
		GenderEnum MALE = GenderEnum.MALE;
		System.out.println(MALE);
		GenderEnum FEMALE = GenderEnum.FEMALE;
		System.out.println(FEMALE);
		System.out.println("============================");
		GenderEnum[] genders=GenderEnum.values();
		for(GenderEnum g:genders){
			System.out.println(g);
		}
		System.out.println("================valueof=============");
		GenderEnum female=GenderEnum.valueOf("FEMALE");
		System.out.println(female);
		System.out.println("================ordinal===================");
		System.out.println("male:"+MALE.ordinal());
		System.out.println("female:"+FEMALE.ordinal());
//		System.out.println("female:"+OTHER.ordinal());
		System.out.println("================compareto===================");
		System.out.println(MALE.compareTo(MALE));
		System.out.println(MALE.compareTo(female));
		System.out.println(MALE.compareTo(GenderEnum.OTHER));
	}
}
