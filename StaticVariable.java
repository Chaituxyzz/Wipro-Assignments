package com.wiproNga;

public class StaticVariable {
	
	 static int x = 100; 

	    public void display() {
	        System.out.println(x);
	    }

	    public static void main(String[] args) {
	    	StaticVariable example1 = new StaticVariable();
	        StaticVariable example2 = new StaticVariable();

	        example1.display();
	        example2.x = 200; 
	        example1.display();
	    }
	}
