package com.wiproNga;

public class MethodWithReturn {

	   public int add(int x, int y) {
		 return x+y;  
	   }
	   public int sub(int a, int b) {
		   return a-b;
	   }
	   public int multiply(int m, int n) {
		   return m*n;
	   }
	   
	   public int division(int c, int d) {
		   return c/d;
	   }
	public static void main(String[] args) {
		MethodWithReturn M2 = new MethodWithReturn();
		System.out.println(M2.add(10,20));
		System.out.println(M2.sub(10, 2));
		System.out.println(M2.multiply(5, 6));
		System.out.println(M2.division(30, 3));
	}

}
