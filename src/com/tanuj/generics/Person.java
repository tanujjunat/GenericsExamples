package com.tanuj.generics;

public class Person {

	private String id;
	private String name;
	private OtherPerson otherPerson;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public OtherPerson getOtherPerson() {
		return otherPerson;
	}
	public void setOtherPerson(OtherPerson otherPerson) {
		this.otherPerson = otherPerson;
	}
	
	@Override
	public String toString() {
		return "Person [id=" + id + ", otherPerson=" + otherPerson + "]";
	}
	
	
	
	
	
}
