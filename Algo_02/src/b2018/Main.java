package b2018;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int cnt = 1;
		
		int start = 1, end = 1, sum = 1;
		
		while (true) {
			if (end == N) 
				break;
			if (sum == N) {
				cnt += 1;
				end += 1;
				sum += end;
			} else if (sum > N) {
				sum -= start;
				start += 1;
			} else {
				end += 1;
				sum += end;
			}
		}
		System.out.println(cnt);
		
	}
}
