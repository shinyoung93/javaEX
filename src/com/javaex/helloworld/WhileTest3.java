package com.javaex.helloworld;

public class WhileTest3 {

	public static void main(String[] args) {
		int j = 0;
		for (int i = 1;; i++) {
			if (i % 6 == 0 && i % 14 == 0) {
				System.out.println(i);
				j++;
			}
			if(j == 10) {
				break;
			}
		}
	}

}
