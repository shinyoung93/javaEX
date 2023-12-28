package com.javaex.helloworld;

import java.util.Scanner;

public class ScannerTest2 {

	public static void main(String[] args) {
		
		System.out.println("이름을 입력하세요");
		
		Scanner sca = new Scanner(System.in);
		String str = sca.nextLine();
		System.out.println(str);
		sca.close();


	}

}
