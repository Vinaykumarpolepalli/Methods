package com.Method;

import java.util.Scanner;

public class Method3 {
	

	
	public static void main (String []args) {
		Method3 m = new Method3();
		m.add();
		m.sub();
		m.multiple();
		m.divide();
		m.module();
	}
		
		void add(){
		Scanner sc = new Scanner(System.in);
		System.out.println("add numbers");
		int a = sc.nextInt();
		int b= 20+a;
		System.out.println("adding a and b both :"+b);	
	
	}
    
	void sub (){
		Scanner sc = new Scanner(System.in);
		System.out.println("sub  numbers");
		int i = sc.nextInt();
		int j = 30-i;
		System.out.println("sub of i and j both:"+j);
		
	}
	
	void multiple() {
		Scanner sc = new Scanner(System.in);
		System.out.println("multiple numbers");
		int k = sc.nextInt();
		int h = 30*k;
		System.out.println("multipule of k and h both:"+h);
		
	}
	void divide() {
		Scanner sc = new Scanner(System.in);
		System.out.println("divide numbers");
		int k = sc.nextInt();
		int h = 30/k;
		System.out.println("divide of k and h both:"+h);
		
		
	}
	void module() {
		Scanner sc = new Scanner(System.in);
		System.out.println("module numbers");
		int k = sc.nextInt();
		int h = 10%k;
		System.out.println("module of k and h both:"+h);
		
		
	}
}
