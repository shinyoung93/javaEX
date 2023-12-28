package com.javaex.helloworld;

import java.util.Scanner;

public class Practice8 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("숫자맞추기게임 시작");

		while (true) {
			int ans = (int) (Math.random() * 100) + 1;
			//System.out.println(ans);
			while (true) {
				
				
				System.out.print(">> ");
				int num = sc.nextInt();

				if (ans == num) {
					System.out.println("정답입니다.");
					break;
				} else if (ans > num) {
					System.out.println("더 높게");
				} else if (ans < num) {
					System.out.println("더 낮게");
				}

			}
			System.out.println("게임을 종료하시겠습니까? (y/n) >> ");
			String go = sc.next();
			if ("y".equals(go) == true) {
				continue;
			} else if ("n".equals(go) == true) {
				System.out.println("게임을 종료하겠습니다.");
				break;
			}
			sc.close();
		}
	}
}
