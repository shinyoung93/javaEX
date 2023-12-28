package com.javaex.helloworld;

import java.util.Scanner;

public class IfTest {

	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		
		System.out.println("\"점수를 입력하세요\"");
		int scr = sca.nextInt();
		
		if(scr>=60) {
			System.out.print("\"합격입니다.\"");
			
		}else {
			System.out.print("\"불합격입니다.\"");
			
		}
		sca.close();

	}

}
