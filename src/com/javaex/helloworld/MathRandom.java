package com.javaex.helloworld;

public class MathRandom {

	public static void main(String[] args) {
		int[] intArray = new int[6];

//		do {
//			
//		}
		for (int i = 0; i < intArray.length; i++) {
			int num = (int) (Math.random() * 45) + 1;
			intArray[i] = num;
			System.out.print(intArray[i] + " ");

		}

	}
}
