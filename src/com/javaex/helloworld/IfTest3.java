package com.javaex.helloworld;

import java.util.Scanner;

public class IfTest3 {

	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);

		System.out.println("\"숫자를 입력하세요\"");
		int scr = sca.nextInt();

		if (scr > 0) {
			if (scr % 2 == 0) {
				System.out.print("\"짝수입니다.\"");
			} else {
				System.out.print("\"홀수입니다.\"");
			}

		} else if (scr < 0) {
			System.out.print("\"음수입니다.\"");

		} else {
			System.out.print("\"0입니다.\"");

		}
		sca.close();

	}

}
