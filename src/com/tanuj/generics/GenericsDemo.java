package com.tanuj.generics;

import com.tanuj.generics.pojo.Computer;
import com.tanuj.generics.pojo.ElectronicDevice;
import com.tanuj.generics.pojo.ElectronicDevices;

public class GenericsDemo {

	public static void main(String[] args) {
		
		ElectronicDevice<Computer> device = new ElectronicDevice<>();
		Computer t = device.showDeviceName(new Computer());
		t.showDeviceName();
		t.show(device);
		ElectronicDevice<ElectronicDevices> deices = new ElectronicDevice<>();
		t.show(deices);
	}

}
