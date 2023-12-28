package com.javaex.helloworld;

public class Practice02_5 {

	public static void main(String[] args) {
		int[] num = new int[6];

		for (int i = 0; i < 6; i++) {
			num[i] = (int) (Math.random() * 45) + 1;
			System.out.print(num[i] + "\t");
		}
		System.out.print("\n");
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < i; j++) {
				while (num[i] == num[j]) {
					num[i] = (int) (Math.random() * 45) + 1;
					j = 0;
				}
			}
		}
		for (int i = 0; i < 6; i++) {

			System.out.print(num[i] + "\t");
		}

	}
}
