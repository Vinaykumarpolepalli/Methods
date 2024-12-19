package com.Method;

import java.util.Scanner;

public class Method4 {
	 static Scanner sc = new Scanner(System.in);
  
	public static void main(String[] args) {
		Method4 m = new Method4();
		
		subtraction();
		multiplication();
		division();
		m.modulus();
	}

	static void subtraction() {
		System.out.println("sub numbers");
		int i = sc.nextInt();
		int j = 60 - i;


		System.out.println("sub both numbers :" + j);
		
	}

	static void multiplication() {
		
		System.out.println("multiplication the number");
		float i = sc.nextFloat();
		float j = 10 * i;
		System.out.println("mutipula :" + j);
		
		
		
	}

	static void division() {
	
		System.out.println("division the number ");
		double p = sc.nextDouble();
		double v = 40 / p;
		System.out.println("division both:" + v);


	}

	void modulus() {
		System.out.println("modulus vaule give user ");
		long p = sc.nextLong();
		long s = 40 % p;
		System.out.println("modulus :" + s);
	}
}
