package com.Method;

import java.util.Scanner;

public class AllMethods2 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		AllMethods2  a  = new AllMethods2();
		System.out.println("main method  started ");
         a.show();
        // a.display(5,10);
//        System.out.println("Enter a number");
//        float i = sc.nextFloat();
//        System.out.println("Enter b number");
//        float j = sc.nextFloat();
         a.display(10, 500);
     
        
        
        a.addition();
       System.out.println( "divisions two number:"+a.division(10,20));
        
	}

	//No Return type and the No Argument type
	void show () {
		System.out.println("no return and  no argument ");
	}
	
	//No Return type and the with Argument type
	
	void display(float a, float b) {
//		System.out.println("Enter a number");
//		float i = sc.nextInt();
//		System.out.println("Enter b number");
//		float j = sc.nextInt()+i;
//		System.out.println("sum of two number:"+j);
        float value  = a+b;
        System.out.println("sum of two numbers :"+value);	
	}

	//with Return type and no Argument type
	 int addition () {
//		 int a = 10;
//		 int b = 20+a;
//		 System.out.println("sum of two numbers:"+b);
//		 return b;
		 
		 System.out.println("Enter a number:");
		 int a = sc.nextInt();
		 System.out.println("Enter b number");
		 int b = sc.nextInt()+a;
		 System.out.println("Enter sum number: "+b);
		 return b;
		 
	 }
	 //with Return type and the with Argument type
	 int division(int  i , int j) {
//		 System.out.println("Enter a number");
//		 double a =  sc.nextDouble();
//		 System.out.println("Enter b number");
//		 double b = sc.nextDouble()/a;
//		 System.out.println("sum of two numbers:"+b);
//		 return (int)b;
//		 
		 int sum = i/j;
		 return sum;
	 }
}
