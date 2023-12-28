package com.javaex.helloworld;

public class Practice5 {

	public static void main(String[] args) {
//		int r = 0;
//		for (int i = 1; i < 11; i++) {
//			for (int k = 1; k < 11; k++) {
//				System.out.print(k + r + "\t");
//
//			}
//			r++;
//			System.out.print("\n");
//
//		}
		for (int i = 0; i < 10; i++) {
			for (int k = 1+i; k < 11+i; k++) {
				System.out.print(k + "\t");

			}
			System.out.print("\n");

		}

	}
}
