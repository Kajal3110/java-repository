package com.datatypes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class simpledata {

	public static void main(String[] args) throws NumberFormatException, IOException {
		double f,c;
		InputStreamReader in=new InputStreamReader(System.in);
		BufferedReader ob=new BufferedReader(in);
		
		System.out.println("Enter the centigrade number:");
		c=Double.parseDouble(ob.readLine());
		f=(9*c/5)+32;
		
		System.out.println("fahrenhent:"+f);
		
		

	}

}
