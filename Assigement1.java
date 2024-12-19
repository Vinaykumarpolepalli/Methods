package com.Method;

import java.util.Scanner;

public class Assigement1 {
 static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
      System.out.println("main method started");
      addition();
      subtraction();
      multiplication();
      modulus();
	}
	
	static int addition() {
		System.out.println("Enter a number  addition");
		int a = sc.nextInt();
		System.out.println("Enter a other number");
		int b = sc.nextInt()+a;
		System.out.println("sum of both number:"+b);
		return b;
		
	}
	static int subtraction() {
		System.out.println("Enter a number subtraction ");
		int a = sc.nextInt();
		System.out.println("Enter a other number");
		int b = sc.nextInt()-a;
		System.out.println("sum of both numbers:"+b);
		return b;
		
	}
	
	static float multiplication() {
		System.out.println("Enter a number multiplication");
		float a = sc.nextFloat();
		System.out.println("Enter a other number");
		float b = sc.nextFloat()*a;
		System.out.println("sum of two numbers:"+b);
		return b;
		
	}
	
	static double division() {
		System.out.println("Enter a number division");
		double a = sc.nextDouble();
		System.out.println("Enter a other number");
		double b = sc.nextDouble()/a;
		System.out.println("sum of both number:"+b);
		return b;
		
	}
	static double modulus() {
		System.out.println("Enter a number modulus");
		double a = sc.nextDouble();
		System.out.println("enter a other number");
		double b = sc.nextDouble()%a;
		System.out.println("sum of two numbers:"+b);
		return b;
		
		
		
		
	}

}
