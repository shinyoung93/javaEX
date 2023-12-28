package com.javaex.helloworld;

public class ArrayTest {

	public static void main(String[] args) {
		int[] leftArr = new int[] { 1, 2, 2 };
		int[] rightArr = new int[] { 1, 2, 3 };
		int con = 0;
		if (leftArr.length == rightArr.length) {
			for (int i = 0; i < leftArr.length; i++) {
				if (leftArr[i] != rightArr[i]) {
					System.out.println(i + 1 + " 번째 값이 다릅니다.");
					con =1;
				}
				
			}
			//ifSystem.out.println("두 배열은 값이 같습니다.");
		} else {
			System.out.println("두 배열은 길이가 다릅니다.");
		}

	}

}
