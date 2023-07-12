package 재귀호출;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력 ");
		int n = sc.nextInt();
		int ans = fac(n);
		System.out.println(ans);
	}

	private static int fac(int n) {
		if (n > 0)
			return n * fac(n-1);
		return 1;
	}
}
