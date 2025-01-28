package com.wiproNga;

public class UsingStatic {

	    public static int add(int x, int y) {
	        return x + y;
		    }

     public static int sub(int a, int b) {
		        return a - b;
		    }

		    public static int multiply(int m, int n) {
		        return m * n;
		    }

		    public static int division(int c, int d) {
		        return c / d;
		    }
 public static void main(String[] args) {
		        System.out.println(UsingStatic.add(10, 20));    
		        System.out.println(UsingStatic.sub(10, 2));  
		        System.out.println(UsingStatic.multiply(10, 2));  

	}

}
