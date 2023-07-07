package j9074;

import java.util.Scanner;
import java.util.StringTokenizer;

/**문제
1부터 10까지의 정수를 입력받다가 입력된 정수가 범위를 벗어나면 그 때까지 1번 이상 입력된 각 숫자의 개수를 작은 수부터 출력하는 프로그램을 작성하시오.

 : 줄바꿈,  : 공백
예제
5 6 10 9 3 5 3 5 0
3 : 2개
5 : 3개
6 : 1개
9 : 1개
10 : 1개*/
/*
 * int[] arr = new int[11]; Scanner sc = new Scanner(System.in); while (true) {
 * int x = sc.nextInt(); if (x > 10) break; else if (x <= 0) break; arr[x] += 1;
 * } for (int i = 0; i < arr.length; i++) { if (arr[i] == 0) { continue; } else
 * { System.out.println(i + " : " + arr[i] + "개"); } }
 */
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		StringTokenizer st = new StringTokenizer(line);
		int[] arr = new int[11];
		
		while (st.hasMoreTokens()) {
			String s = st.nextToken();
//			String -> int로 변환
			int i = Integer.parseInt(s);
			if (i <= 0 || i > 10)
				break;
			arr[i] += 1;
		}
		for (int i = 1; i < 11; i++) {
			if (arr[i] == 0)
				continue;
			System.out.println(i + " : " + arr[i] + "개");
		}
		
	}
}

