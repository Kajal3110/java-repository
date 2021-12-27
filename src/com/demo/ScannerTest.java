package com.demo;

import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		Scanner ob=new Scanner(System.in); //creating object of scanner class
		float a,b;
		boolean s;
		String name;
		
		System.out.println("Enter your name:");
		name=ob.next();
		
		System.out.println("please enter boolean value:");
		s=ob.nextBoolean();
		
		System.out.println("Enter the value of a:");
		a=ob.nextFloat();
		
		System.out.println("Enter the value of b:");
		b=ob.nextFloat();
		
		System.out.println("Addition="+(a+b));
		System.out.println(name);
		System.out.println(s);
		ob.close();
		
		}

}
