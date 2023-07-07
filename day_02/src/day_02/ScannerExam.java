package day_02;

import java.util.Scanner;

public class ScannerExam {
	public static void main(String[] args) {
		System.out.println("이름을 입력 하세요 >> ");
		Scanner sc = new Scanner(System.in);
//		sc.next();		//글자 한개 단어씩 추출 , 공백기준분리
//		sc.nextInt();	//숫자 한개씩 추출
//		sc.nextLine();	//한줄씩 추출
		String name = sc.next();
//		만약에 엔터안치고 있으면 무한히 대기하는데 이를 BlockingMethod이라고 한다.
		System.out.println("이름은 "+ name + "입니다.");
		System.out.println("태어난 해를 4자리로 입력하세요 >> ");
		int year = sc.nextInt();
		System.out.println("태어난 해는 " + year + "년 입니다.");
		int age = 2023 - year;
		System.out.println("나이는 " + age + "입니다");
		
	}
}
