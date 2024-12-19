package com.Method;

import java.util.Scanner;

public class Method7 {
  static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		Method7 m = new Method7();
	 System.out.println("main method started :");
	 
	 System.out.println("Enter a number:");
	 int a = sc.nextInt();
	 System.out.println("Enter b number:");
	 int b = sc.nextInt();
	 System.out.println("total two numbers:"+addition(a,b));
	 
	 System.out.println("Enter a number:");
	 int i = sc.nextInt();
	 System.out.println("Enter b number:");
	 int j = sc.nextInt();
	 System.out.println("total two numbers:"+subtraction(i,j));
	 
	 
	 System.out.println("total two numbers:"+ divisioin(10,20));
	 
	 System.out.println("total value :"+ m.modulus(50,10));

	}
   
	static int addition(int a, int b) {
		int sum = 0;
		   sum = a+b;
		   return sum;
		
	}
	
	static double subtraction(double i, double j) {
		double diff = i+j;
		return diff;
	}
	
	static float divisioin(long x, long y) {
		float  point =x/y;
		return point;
		
	}
	  
	int modulus(double e,double f) {
		double  value  = e % f;
		return (int)value;
	}
}
