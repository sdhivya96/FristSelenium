package com.automations.firstselenium;

public class TestClass {

	public static void main(String[] args) {
//		String path = "user.dir";
		String path = System.getProperty("user.dir");
		System.out.println(path);
		 String separator = System.getProperty("file.separator");
	        System.out.println(separator);

	}

}
