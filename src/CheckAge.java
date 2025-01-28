package com.wiproNga;

public class CheckAge {
 
	 private int age;
	 
	 
	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
		if(age>=18) {
			System.out.println("Eligible for vote");
		} else {
			System.out.println("Not eligible for vote");
		}
	}


	public static void main(String[] args) {
		CheckAge Ca = new CheckAge();
		
		Ca.setAge(25);

	}

}
