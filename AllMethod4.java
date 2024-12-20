package com.Method;

import java.util.Scanner;

public class AllMethod4 {
 static Scanner sc = new  Scanner (System.in);
	public static void main(String[] args) {
	   AllMethod4   a = new AllMethod4();
	   System.out.println("Main method is started here :");
       a.sum();
       
       System.out.println("Enter a number :");
       int i = sc.nextInt();
       System.out.println("Enter b number is:");
       int j = sc.nextInt();
   	  a.add(i, j);
   	  
   	
   	  
   	  
      a.sub(); 
      
      
      
  
      a. multipule(50,10); 
	}
	
	
	void sum () {
		System.out.println("no return type and no argument type _________");
	}
	
	void add(int a,int b) {
		int add = a+b;
		System.out.println("no return type and with  argument type ");
		 System.out.println("sum of two numbers is :"+add);   
	}
	
        int sub  () {
	    int     sub  = 0;
	             sub   = 50-20;
	     System.out.println("with return type and with  no  argument type ");
		 System.out.println("sum of two numbers is :"+sub);    
	     return sub;
	  
   }
        
        int multipule (int a ,int b) {
        	int     muli= a*b;
        	 System.out.println("with return type and with   argument type ");
    		 System.out.println("sum of two numbers is :"+muli);    
    	     return muli;   
        }

}
