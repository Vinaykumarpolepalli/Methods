package com.Method;

import java.util.Scanner;

public class MethodReturn {
 static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
	  System.out.println("main method");
//	  System.out.println(chartacter());
//	  System.out.println(asiccvalue());
	  chartacter();
	  asiccvalue();

	}
  static char chartacter () {
	 
	   
	   return 45;
  }
	   
	   static int asiccvalue() {
		   System.out.println("Enter asicc value");
		  char  c = sc.next().charAt(0);
		  //int b = sc.nextInt()+a;
		   System.out.println("asicc value:"+c);
		   return c;
	   }
   }

