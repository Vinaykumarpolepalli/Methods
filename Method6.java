package com.Method;

import java.util.Scanner;

public class Method6 {
   static  Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		Method6 m = new Method6();
		 System.out.println("main method");
		 
		 System.out.println("enter a number");
		 int a = sc.nextInt();
		 System.out.println("enter other number");
		 int b = sc.nextInt();
		m.addition(a,b);
		
		show(500);
	}
 void addition(int a ,int b) {
	 int c = a+b;
	 System.out.println("sum of numbers:"+c);
 }
	 static void show(int a) {
		int b = 30;
		int c = a+b;
		System.out.println("sum of two numbers:"+c);
	 }
}
