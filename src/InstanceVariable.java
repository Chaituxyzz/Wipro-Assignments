package com.wiproNga;

public class InstanceVariable {
	
	int a=100;
	public void Instance() {
		System.out.println(a);
	}

	public static void main(String[] args) {
		
		InstanceVariable Iv = new InstanceVariable();
		Iv.Instance();
		
		
	}

}
