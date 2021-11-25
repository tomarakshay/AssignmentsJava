package com.exception;

import java.util.Scanner;

public class Employee {
	
	public static void main(String[] args) {
		
	
	UserInput a = new UserInput();
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter Yor Name ");
	String s=scanner.nextLine();
	System.out.println("Enter Yor Age ");
	int b = scanner.nextInt();
	
	try {
		a.setAge(b);
		a.setName(s);
		System.out.println("Entered age : "+a.getAge() + " and entered name is "+ a.getName());
		
	}
	catch (CustomException  e) {
		System.out.println("Person is not eligible");
	}
	
	}	
	

}
