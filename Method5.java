package com.Method;

import java.util.Scanner;

public class Method5 {
	 public Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Method5 m = new Method5();
		m.show();
		m.display(20,10);
		m.getempage();
		m.getempsalary();
	

	}
	
	void show() {
		System.out.println("no retutn and no args");
	}
	
	void display(int a,int  b) {
		
		int c = a+b;
		System.out.println("add numbers :"+c);
		
		
		
	}
	 
	  int getempage(){
		  System.out.println("Enter employe age :");
		  int a = sc.nextInt();
		  System.out.println("your age:"+ a);
		  return a;
	}
	
	  float getempsalary() {
		  System.out.println("enter emp salary");
		  float a = sc.nextFloat();
		  System.out.println("emp salary;"+a);
		  return a;
	  }

}
