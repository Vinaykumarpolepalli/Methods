package com.Method;

public class Methos2 {
	
	void method1() {
		
		System.out.println("This is method1");
		method2();
	}
	
	void method2() {
		
		System.out.println("This is method2");
		method3();
	}
	
	
	void method3() {
		//method1();
		System.out.println("This is method3");
		
	}
	

	public static void main(String[] args) {
		Methos2 demo = new Methos2();
		System.out.println("method is started !");
		
	 demo.method1();
//		 demo.method2();
//		 demo.method3();
//	       
	       
	        
	        System.out.println("End of main method");
	        
		 }
		


}
