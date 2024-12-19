package com.Method;

import java.util.Scanner;

public class Method1 {
	
   static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		Method1 m = new Method1();
	      System.out.println("main method started ");
	      m.show();
	     // m.show1();

	}

	   void show() {
		  System.out.println("namastha  main method ");
	
		  System.out.println("Enter you name boss");
		  String name = sc.nextLine();
		  System.out.println("enter you name boss:"+ name);
//		  System.out.println("Enter you name1 boss:");
//		  String name1 = sc.nextLine();
//		  System.out.println("enter you name boss:"+ name1);
		  
		  
	  
	  
//	   void show1() {
//		  Scanner sc = new Scanner(System.in);
		  System.out.println("enter you age");
		  byte age = sc.nextByte();
		  System.out.println("Enter your age:"+age);
		  
		  
		  System.out.println("Enter your bike EMI per month");
		  short  month  = sc.nextShort();
		  System.out.println("Enter your Bike EMI per month :"+ month);
		  
		  System.out.println("Enter your salary per month number");
		  int  number =  sc.nextInt();
		  System.out.println("Enter your salary  per month number:"+ number);
		  
		  System.out.println("Enter your  phone number  ");
		  long phone  = sc.nextLong();
		  System.out.println(" your phone is here  :"+ phone);
		  
		  
		  System.out.println("Enter your float points in your own  ");
		  float own =sc.nextFloat();
		  System.out.println("you entered float is here :"+ own);
		  
		  System.out.println("Enter your double points in your own");
		  double your  = sc.nextDouble() ;
		  System.out.println("your entered double values are here:"+ your );
		  
			
			  System.out.println("please enter only single letter "); 
			 char letter = sc.next().charAt(0); 
			  System.out.println("character is only in single one :"+letter);
			 		  
		  
		 System.out.println("enter you boolean num,enter if you male-true ,female-false vinay");
		 boolean num = sc.nextBoolean();
		 System.out.println("enter if you male-true ,female-false :"+num);
		  
			  

				  
	  }
}
