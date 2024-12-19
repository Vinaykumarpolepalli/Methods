package com.Method;

public class method11 {

	public static void main(String[] args) {
		method11 m = new method11();
	
      System.out.println("char value is :"+m.a('f'));
      System.out.println("convert int value to char value by using the explict type casting :"+m.c(98));
	}
        int a (char c){
        	int a = c;
        	return a;
        	
        	
        }
        
        char c  (int a) {
        
        	return (char)a;
        }
}
