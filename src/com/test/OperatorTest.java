package com.test;

import java.util.Scanner;

public class OperatorTest {

	public static void main(String[] args) {
		int a=23,b=43,c=34;
		System.out.println(a+b);// 112
		System.out.println(a-b);// -66
		System.out.println(a*b);//
		System.out.println(b/a);// 3
		System.out.println(b%a);//
		
		System.out.println(b>a && b>c);
		System.out.println(b<a || b<c);
		System.out.println(b!=a); //true
		System.out.println(b==a); //false
		boolean h=(b==a);
		Scanner ob=new Scanner(System.in);
		
		a+=5;
		System.out.println(a);
		
		
		System.out.println(++c);//pre increment
		System.out.println(c);
		
		System.out.println(--c);//pre increment
		System.out.println(c);
		
		System.out.println(c++);//post increment
		System.out.println(c);
		
		System.out.println(c--);//post increment
		System.out.println(c);
		
		System.out.println(a-- - --a + a++ - --a);
		
		int x=12, y=23;
		System.out.println( 12 & 23);
		System.out.println( ob instanceof Scanner);
		
		}

}
