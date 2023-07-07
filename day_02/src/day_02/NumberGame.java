package day_02;

import java.util.Scanner;

public class NumberGame {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1~100사이 숫자를 입력하세요");
		int random = (int)(Math.random()*100)+1;
		
//		System.out.println(random);
		while (true) {
			int num = sc.nextInt();
			if (num==random) {
				System.out.println("정답");
				break;
			} else if(num < random) {
				System.out.println("올려주세요");
			} else if (random > num) {
				System.out.println("내려주세요");
			}
		}

	}

}
