package com.javaex.helloworld;

import java.util.Scanner;

public class SwitchTest2 {

	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);

		System.out.println("\"월을 입력하세요\"");
		System.out.print("월 : ");
		int scr = sca.nextInt();

		switch (scr) {
		case 1, 3, 5, 7, 8, 10, 12:
			System.out.println("31일 입니다.");
			break;
		case 2:
			System.out.println("28일 입니다.");
			break;
		case 4, 6, 9, 11:
			System.out.println("30일 입니다.");
			break;	
		default :
			System.out.println("1과 12사이의 숫자를 입력해주세요");
			break;
		}
		sca.close();

	}

}
