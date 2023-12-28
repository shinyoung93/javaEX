package com.javaex.helloworld;

import java.util.Scanner;

public class SwitchTest4 {

	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);

		System.out.println("\"점수를 입력하세요\"");
		System.out.print("점수 : ");
		int scr = sca.nextInt();
		
		if(scr >= 90) {
			System.out.println("A등급입니다.");
		}else if(scr >= 80) {
			System.out.println("B등급입니다.");
		}else if(scr >= 70) {
			System.out.println("C등급입니다.");
		}else if(scr >= 60) {
			System.out.println("D등급입니다.");
		}else {
			System.out.println("F등급입니다.");
		}
		
		sca.close();

	}

}
