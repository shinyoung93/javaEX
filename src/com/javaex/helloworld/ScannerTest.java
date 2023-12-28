package com.javaex.helloworld;

import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		
		System.out.println("\"이름을 입력하세요\"");
		String str = sca.nextLine();
		//System.out.println(str);

		System.out.println("\"나이를 입력하세요\"");
		//Scanner sc = new Scanner(System.in);
		String num = sca.nextLine();
		System.out.print("당신의 이름은 " + str);
		System.out.print(" 나이는 " + num + "살 입니다.");
		//sc.close();
		sca.close();

	}

}
