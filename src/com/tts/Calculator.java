package com.tts;

public class Calculator {
	public int add(int a, int b) {
		return a + b;
	}
	
	public int subtract(int a, int b) {
		return a - b;
	}
	
	public int multiply(int a, int b) {
		return a * b;
	}
	
	public int division(int a, int b) {
		return a / b;
	}
	
	public int square(int a) {
		int res = 1;
		
		for(int i = 0; i< 2; i++) {
			res*= a;
		}
		
		return res;
	}
	
	
}
