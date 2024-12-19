package com.Method;

public class Method12 {

	public static void main(String[] args) {
System.out.println("main method is started");
    name();
    add(10,30);
    subtraction();
    division(50,10);
	}

	
	static void name() {
		System.out.println("no return and no argument type");
	}
	static void add (int a,int b) {
	int 	add = a+b;
	System.out.println("sum of two numbers is :"+add);
		}
	
	static int subtraction() {
	         int a=10;
	         int b  =5-a ;
		System.out.println("sub of two numbers is here :"+b);
		return b;
	}
	static int division(int a , int b) {
		int division= a/b;
		System.out.println("sum of two division :"+division);
		return division;
		
	}
	
}
