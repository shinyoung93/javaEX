package com.javaex.helloworld;

public class Practice02_3 {

	public static void main(String[] args) {
		char[] c = { 'T', 'h', 'i', 's', ' ', 'i', 's', ' ', 'a', ' ', 'p', 'e', 'n', 'c', 'i', 'l' };
		//char[] a = {};
		System.out.println(c);
		for (int i = 0; i < c.length; i++) {
			//a[i] = c[i];
			if (c[i] == ' ') {
				c[i] = ',';
			}

		}
		System.out.println(c);

	}

}
