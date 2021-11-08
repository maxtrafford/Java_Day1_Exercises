package com.qa.exercises;

public class Runner {
	public static void main(String[] args) {
		System.out.println(Calculator.add(10, 5));
		System.out.println(Calculator.mul(10, 5));
		System.out.println(Calculator.sub(10, 5));
		System.out.println(Calculator.div(10, 5));
		
		
//		Results.result(103, 102, 104);
		Results.percentage(Results.result(103, 102, 104));
	}
	
}
