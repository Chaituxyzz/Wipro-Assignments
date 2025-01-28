package com.wiproNga;

public class Methods {
	
	public void sum() {
		int a = 100;
		int b= 200;
		int result = a+b;
		System.out.println("a+b = "+result);
	}
	public void sub() {
		int x= 50;
		int y=20;
		int result = x-y;
		System.out.println("x-y = "+ result);
	}
    public void multiply() {
    	int m= 15;
    	int n= 2;
    	int result = m*n;
    	System.out.println("m*n = "+ result);
    	
    }
    public void division() {
    	int c= 15;
    	int d = 5;
    	int result = c/d;
    	System.out.println("c/d = "+ result);
    	
    }
	public static void main(String[] args) {
		
   Methods M1 = new Methods();
   M1.sum();
   M1.sub();
   M1.multiply();
   M1.division();
	}

}
