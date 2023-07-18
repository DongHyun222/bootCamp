package boj11047;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int arr[] = new int[N];
		
		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}
		
		int cnt = 0;
		for (int i = N-1; i >= 0; i--) {
			while (true) {
				if (K >= arr[i]) {
					cnt += 1;
					K -= arr[i];
				} else
					break;
			}
		}
		System.out.println(cnt);
	}
}
