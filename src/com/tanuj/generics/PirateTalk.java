package com.tanuj.generics;

import java.util.Properties;

public class PirateTalk {

	public static void main(String[] args) {
		Properties p = System.getProperties();
		p.setProperty("pirate", "scurvey");
		String s = p.getProperty("argProp") + " ";
		s += p.getProperty("pirate");
		System.out.println(s);
	}

}
