package com.qa.exercises;

public class Results {
//	int physics = 104;
//	int chemistry = 103;
//	int biology = 102;
//	int total = physics + chemistry + biology;
	
	
	public static int result(int a, int b, int c) {
		
		int physics = a;
		int chemistry =  b;
		int biology =  c;
		int total = a+b+c;
		System.out.println("You scored " + physics + " marks in physics. You scored " + total +" overall." );
		System.out.println("You got " + chemistry + " points in chemistry. You scored " + total +" overall." );
		System.out.println("You achieved " + biology + " out of 150 in biology. You scored " + total +" overall." );
		return total; // returns total to run percentage calculation 
	}
	
	public static void percentage(int total) {
		int step1 = total*100;
		double step2 = step1/450;
		System.out.println("Well done on " +step2+ " Percent");
	}
}
