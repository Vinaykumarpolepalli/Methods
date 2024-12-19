package com.Method;

import java.util.Scanner;

public class AllMethod1 {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		AllMethod1 m = new AllMethod1();
		System.out.println("main method is started here :");
	    m.show();
	    
	    System.out.println("Enter a number");
	    int i = sc.nextInt();
	    System.out.println("Enter a another number");
		int j = sc.nextInt();
	   display(i,j);
	   
	   m.customer();
	}

//	 no return type and the no argument type
	void show () {
		System.out.println("no return type  and the no argement type ");
	}
	//  no return type and the argument type
	 static void display (int i,int j) {
		int  k  = i + j;
		System.out.println("sum of two numbers :"+k);
	} 
	//return type ad no argument 
	int customer () {
		System.out.println("Enter customer products : ");
	     int a = sc.nextInt();
	     int b = sc.nextInt()+a;
	    System.out.println("customer total cost here:"+b);
		return b;
	}
	
	
	
}
