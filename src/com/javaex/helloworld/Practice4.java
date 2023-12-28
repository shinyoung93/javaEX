package com.javaex.helloworld;

import java.util.Scanner;

public class Practice4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		int k = 0;
		System.out.println("숫자를 입력하세요");
		for (int i = 0; i < 5; i++) {
			System.out.print("숫자 : ");
			num = sc.nextInt();
			if (k < num) {
				k = num;
			}
		}
		System.out.println("최대값은 " + k + "입니다.");

		sc.close();
	}

}
