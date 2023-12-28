package com.javaex.helloworld;

public class VariableTest {

	public static void main(String[] args) {
		boolean isFun = true;
		System.out.println("isFun=["+isFun+"]");
		char c = 'f';
		System.out.println("c=["+c+"]");
		byte b = 5;
		System.out.println("b=["+b+"]");
		long lon = 9223372036854775807L+20;
		System.out.println("lon=["+lon+"]");
		
		int num1= 10;
		float num2 = 1.0F;
		float result = num1 + num2;
		System.out.println("num1 + num2=["+num1+num2+"]");
		System.out.println("result=["+result+"]");
		
		int d = num1++;
		System.out.println("d=["+d+"]");
		System.out.println("num1=["+num1+"]");
		
		int e = num1++;
		System.out.println("e=["+e+"]");
		System.out.println("num1=["+num1+"]");
		
	}

}
