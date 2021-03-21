package com.tanuj.generics.pojo;

import java.util.ArrayList;
import java.util.List;

public class Computer implements ElectronicDevices {

	String deviceName;
	
	public Computer() {

	}

	public Computer(String deviceName) {
		super();
		this.deviceName = deviceName;
	}


	List<String> str = new ArrayList<>();

	@Override
	public String toString() {
		return "Computer [deviceName=" + deviceName + "]";
	}



	@Override
	public void showDeviceName() {
		
		System.out.println("I am Computer");
	
	}
	
	public List show (ElectronicDevice<? super Computer> tan) {
		
		return null;
	}
	
	public <T> void deviceName(T data) {
		
	}
	
	
}
