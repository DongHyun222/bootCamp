package b11399;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] lst = new int[N];
		
		for (int i = 0; i < N; i++) {
			lst[i] = sc.nextInt();
		}
		
		Arrays.sort(lst);
		
		int cnt = 0;
		int ans = 0;
		for (int i = 0; i < N; i++) {
			cnt += lst[i];
			ans += cnt;
		}
		System.out.println(ans);
	}
}
