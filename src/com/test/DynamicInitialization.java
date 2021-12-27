package com.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class DynamicInitialization {

	public static void main(String[] args) throws NumberFormatException,IOException {
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader ob=new BufferedReader(isr);
		
		
		//BufferedReader ob1=new BufferedReader(new InputStreamReader(System.in);
		
		long a,b;
		String name;
		char x;
		
		System.out.println("Enter the name:");
		name=ob.readLine();
		
		System.out.println("Enter the value of a:");
		a =Long.parseLong(ob.readLine());
		
		System.out.println("Enter the value of b:");
		b=Long.parseLong(ob.readLine());
		
		System.out.println("Sum=" + (a+b));//Concatenation Operator 
		
		System.out.println("Enter any character value:");
		x=(char) ob.read();//type casting
		
		System.out.println(x);
		System.out.println(name);
		

	}

}
