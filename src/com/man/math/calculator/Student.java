package com.man.math.calculator;

public class Student {
	String name;
	Integer mobileNo;

	Student(String name, Integer mobileNo) {
		this.name = name;
		this.mobileNo = mobileNo;
	}

	public void printStudentInfo() {
		System.out.println("Name: " + this.name);
		System.out.println("Mobile No: " + this.mobileNo);
	}

}
