package com.Method;

public class AllMethod3 {

	public static void main(String[] args) {
		AllMethod3 a = new  AllMethod3();
		System.out.println("Main Method is started  here: ");
        a.add();
        a.add(10,60);
        a.sum();
        a.sub(50, 10);
	}
    void add() {
    	System.out.println("no return type and no argument type_____");
    }
    
    void add(int a,int b) {
    	int add=a+b;
        System.out.println("no return type and with argument type :"+add);
    }
    
    int sum() {
    	int a = 10;
    	int b =20+a;
    	System.out.println("with return type and no argument type:"+b);
    	return b;
    	
    	
    }
    
    int sub (int a,int b) {
    	int sub = a-b;
    	System.out.println("with return type and with argument type :"+sub);
    	return sub;
    }
}