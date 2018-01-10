package com.methods.tyler;

public class doubleMe {
	// --- main method starts here ---
	public static void main(String[] args) {
		int num1 = 4;
		int num2 = 2;
	
		
		// invoke the "doubleMe2" method 
		doubleMe2(num1);
		// Output
		System.out.println(num1);
		System.out.println(doubleMe2(num1));
		
		// invoke the "quadrupleMe" method
		quadrupleMe(num1);
		// Output
		System.out.println(doubleMe2(num1));
		System.out.println(quadrupleMe(num1));
		
		// invoke the "doubleMe3" method
		doubleMe3(num1, num2);
		// Output
		System.out.println(num1);
		System.out.println(doubleMe3(num1, num2));
		
		
	}
	// --- doubleMe2 method starts here ---
	private static int doubleMe2(int num1) {
		// Return the value to the main method
		return (num1 * 2);
	}
	// --- quadrupleMe method starts here ---
	private static int quadrupleMe(int num1) {
		// Return the value to the main method
		return (doubleMe2(num1) * 2);
	}
	// --- doubleMe3 method starts here ---
	private static int doubleMe3(int num1, int num2) {
		return ((num1 * num2)*(num2)*(num2));
	}

}
