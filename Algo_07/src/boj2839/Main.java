package boj2839;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		int cnt = 0;
		boolean flag = false;
		
		while (N >= 0) {
			if (N%5 == 0) {
				cnt += N/5;
				System.out.println(cnt);
				flag = true;
				break;
			}
			N -= 3;
			cnt += 1;
		} 
		if (flag == false) {
			System.out.println(-1);
		}
	}
}
