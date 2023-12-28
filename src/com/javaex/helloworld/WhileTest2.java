package com.javaex.helloworld;

import java.util.Scanner;

public class WhileTest2 {

	public static void main(String[] args) {
		Scanner wor = new Scanner(System.in);

		while (true) {
			System.out.println("숫자를 입력해주세요.");
			System.out.print("숫자 : ");
			int dan = wor.nextInt();
			if (dan == 0) {
				System.out.println("시스템을 종료합니다.");
				break;
			} else if (dan % 3 == 0 && dan != 0) {
				System.out.println("3의 배수 입니다.");

			} else {
				System.out.println("3의 배수가 아닙니다.");

			}

		}
		wor.close();
	}

}
