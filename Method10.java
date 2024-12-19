package com.Method;

public class Method10 {

	public static void main(String[] args) {
		
		System.out.println("main method is statred");
//		addition();
		add(10,50);

	}

	
	
	//with return type and  no argument type
//	static int addition() {
//		int a = 10;
//		int b =50+a;
//		System.out.println("sum of two numbers:"+b);
//		return b;
//	}
	
	static void add (int a,int b) {
//		int i = 40;
//		int j = 50+i;
//		System.out.println("sum of two numbers here:"+j);
		int add = a+b;
		System.out.println("sum of two numbers here:"+add);
	}
}
