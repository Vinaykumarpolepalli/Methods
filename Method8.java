package com.Method;

import java.util.Scanner;

public class Method8 {

	public static void main(String[] args) {
		Method8 m = new Method8();
    System.out.println("Main method is started here ");
	
	
     System.out.println("sum of total :"+m.sum(10,20));
	 m.division();

	}
     static int sum (int a,int b) {
    	 Scanner sc = new Scanner(System.in);
    		System.out.println("Enter a numuber:");
    		int i= sc.nextInt();
    		System.out.println("Enter b number");
    		int j = sc.nextInt()+i;
    		return j;
     }
     // We can access one method functionlitys to other method 
   void division() {
	   System.out.println("division of two :"+sum(500,300));
   }
    
    
}
