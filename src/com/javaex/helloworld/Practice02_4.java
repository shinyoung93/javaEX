package com.javaex.helloworld;

import java.util.Scanner;

public class Practice02_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int money = 0;
		int[] cnt = { 50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1 };
		int[] num = new int[10];

		System.out.print("금액 : ");
		money = sc.nextInt();

		for (int i = 0; i < 10; i++) {
			num[i] = money / cnt[i];
			money -= cnt[i] * num[i];
			System.out.println(cnt[i] + "원 : " + num[i] + "개");
		}

		sc.close();
	}

}
