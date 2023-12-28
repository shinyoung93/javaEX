package com.javaex.helloworld;

import java.util.Scanner;

public class Practice02_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] numAry = new int[5];
		int sum = 0;
		float ave = 0;

		for (int i = 0; i < 5; i++) {
			numAry[i] = sc.nextInt();
			sum += numAry[i];
		}

		ave = sum / 5;

		System.out.println("평균은 " + ave + " 입니다.");

		sc.close();
	}

}
