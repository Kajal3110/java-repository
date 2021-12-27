package com.test;

import java.util.Scanner;

public class SwitchcaseTest {

	public static void main(String[] args) {
		Scanner ob=new Scanner(System.in);
		int a;
		System.out.println("Enter any number between 1 to 7");
		a=ob.nextInt();
		
		switch(a)//control variable 
		{
			case 1: System.out.println("It's Sunday");
			        break;
			case 2: System.out.println("It's Monday");
			        break;
			case 3: System.out.println("It's Tuesday");
			        break;
			case 4: System.out.println("It's Wednesday");
			        break;
			case 5: System.out.println("It's Thursday");
			        break;
			case 6: System.out.println("It's Friday");
			        break;
			case 7: System.out.println("It's Saturday");
			        break;
			default: System.out.println("Wrong input !! ");
		
			
		}
		

	}

}
