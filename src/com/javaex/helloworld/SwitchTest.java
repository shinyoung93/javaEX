package com.javaex.helloworld;

import java.util.Scanner;

public class SwitchTest {

	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);

		System.out.println("\"과목을 선택하세요\"");
		System.out.println("(1.Java 2.C 3.C++ 4.Python)");
		System.out.print("과목번호 : ");
		int scr = sca.nextInt();

		if (scr == 1) {
			System.out.println("R101호 입니다!");
		} else if (scr == 2) {
			System.out.println("R202호 입니다!");
		} else if (scr == 3) {
			System.out.println("R303호 입니다!");
		} else if (scr == 4) {
			System.out.println("R404호 입니다!");
		} else {
			System.out.println("상담원에게 문의하세요.");
		}

		sca.close();

	}

}
