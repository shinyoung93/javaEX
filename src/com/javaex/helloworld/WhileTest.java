package com.javaex.helloworld;

import java.util.Scanner;

public class WhileTest {

	public static void main(String[] args) {
		Scanner word = new Scanner(System.in);

		System.out.println("단을 입력해주세요.");
		System.out.print("단 : ");
		int dan = word.nextInt();

		/*
		int i = 1;
		while (i < 10) {
			System.out.println(dan + " * " + i + " = " + dan * i);
			i++;
			
		}
*/
		
		for(int j = 1 ; j <10 ; j++) {
			System.out.println(dan + " * " + j + " = " + dan * j);
			
		}
		word.close();
	}

}
