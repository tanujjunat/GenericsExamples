package com.tanuj.generics;

import com.google.gson.Gson;

public class PersonDemo {
	
	public static void main(String[] args) {
		Person p1 = new Person();
		p1.setId("1");
		p1.setName("Tanuj");
		OtherPerson op1 = new OtherPerson();
		op1.setId("22");
		op1.setName("MyData");
		p1.setOtherPerson(op1);
		System.out.println(p1.toString());
		Gson gson = new Gson();
		System.out.println(gson.toJson(p1));
		
	}

}
