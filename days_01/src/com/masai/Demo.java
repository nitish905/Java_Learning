package com.masai;

/*
 Q1) Write the difference between JRE, JDK and JVM?
Q2) Write the difference between JSE, JEE and JME?
Q3) How does java achieve platform independency?
Q4) What are features of Java and explain them?
Q5) Write a Java Application which prints your details?
	Example OutputName : XYZ
	Father’s Name : XYZ
	Mother‘s Name : XYZ
	Age : XYZ
	Gender : XYZ
	Address : XYZ
	Mobile No. : XYZ
 */

//Question_05: 
public class Demo {
	
	String nameString;
	String fatherNameString;
	String motherNameString;
	int age;
	String genderString;
	String Address;
	String mobileNoString;
	
	void printDetails() {
		System.out.println(nameString);
	}
	
	public static void main(String[] args) {
		Demo d1=new Demo();
		
		d1.nameString="Nitish";
		d1.age=23;
		d1.Address="Street: Bihar";
		d1.mobileNoString="659325416";
		
		d1.printDetails();
	}

}
