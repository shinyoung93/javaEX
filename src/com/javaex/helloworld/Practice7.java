package com.javaex.helloworld;

import java.util.Scanner;

public class Practice7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int acount = 0;
		int choice = 0;
		int money = 0;

		while (true) {
			System.out.println("-----------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("-----------------------------");
			System.out.print("선택> ");
			choice = sc.nextInt();

			if (choice == 1) {
				System.out.print("예금액> ");
				money = sc.nextInt();
				acount += money;
			} else if (choice == 2) {
				System.out.print("출금액> ");
				money = sc.nextInt();
				acount -= money;
				if(acount <0 ) {
					System.out.println("잔고액을 초과하였습니다.");
					acount += money; 
				}
			} else if (choice == 3) {
				System.out.print("잔고액> ");
				System.out.println(acount);
			} else if (choice == 4) {
				System.out.println("프로그램 종료");
				break;
			} else {
				System.out.println("다시 입력해주세요");
			}

		}
		sc.close();
	}
}
