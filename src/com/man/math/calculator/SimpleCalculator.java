package com.man.math.calculator;

public class SimpleCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Integer dob= 99;
	String name = "mwzxdcggvhbjnkmltr";
	
	Integer dob2= 99;
	String name2 = "aadad";
	
	Character test = 'x';
	Boolean online = true;
	float y = 1.2f;
	double mm = 1.2223456;
	
	Student student1 = new Student("manasa", 123456789);
	Student student2 = new Student("edavalli", 234568765);
	
//	float, double	
	System.out.println(dob);
	System.out.println(name);
	System.out.println(online);
	
	student1.printStudentInfo();
	student2.printStudentInfo();
	
	}

}
