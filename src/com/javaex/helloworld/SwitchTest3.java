package com.javaex.helloworld;

import java.util.Scanner;

public class SwitchTest3 {

	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);

		System.out.println("\"점수를 입력하세요\"");
		System.out.print("점수 : ");
		int scr = sca.nextInt();
		
		if (scr % 3 == 0 && scr != 0 ) {
			System.out.println(scr + "은 3의 배수 입니다.");
		} else if (scr == 0){
			System.out.println(scr + "은 0 입니다.");
		} else {
			System.out.println(scr + "은 3의 배수가아닙니다.");
		}
		
		/*
		int num = scr % 3;

		switch (num) {
		case 0:
			System.out.println(scr + "은 3의 배수 입니다.");
			break;
		default:
			System.out.println(scr + "은 3의 배수가아닙니다.");
			break;
			*/
		sca.close();

	}

}
