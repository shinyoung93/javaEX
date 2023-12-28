package com.javaex.helloworld;

import java.util.Scanner;

public class WhileTest6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int num = 0;
		System.out.println("숫자를 입력하세요. [0이면 종료]");
		do {
			num = sc.nextInt();
			if (num == 0) {
				break;
			}
			sum += num;
			System.out.println("합계 : " + sum);
		} while (true);
		System.out.println("종료하였습니다.");
		sc.close();
	}
}
