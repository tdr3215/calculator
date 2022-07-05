package com.tts;

public class Main {
	public static void main(String[] args) {
		System.out.println("Hello World");
		MagicCalculator test = new MagicCalculator();

		System.out.println(test.add(3, 5));
		System.out.println(test.subtract(6, 2));
		System.out.println(test.multiply(3, 5));
		System.out.println(test.division(6, 2));
		System.out.println(test.square(3));
		
		System.out.println(test.squareRoot(81));
		System.out.println(test.sin(0));
		System.out.println(test.cosine(0));
		System.out.println(test.tangent(0));
		System.out.println(test.factorial(4));
	}
}
