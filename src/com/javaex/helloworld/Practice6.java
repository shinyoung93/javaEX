package com.javaex.helloworld;

import java.util.Scanner;

public class Practice6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int numHol = 0;

		System.out.println("숫자를 입력하세요");
		int num = sc.nextInt();

		if (num % 2 == 1) {
			for (int i = 0; i < num / 2 + 1; i++) {
				numHol = 1 + i * 2;
				sum += numHol;
			}
			System.out.print("결과값 : " + sum);
		} else if (num % 2 == 0) {
			for (int i = 0; i < num / 2 + 1; i++) {
				numHol = i * 2;
				sum += numHol;
			}
			System.out.print("결과값 : " + sum);

		}
		sc.close();
	}

}
