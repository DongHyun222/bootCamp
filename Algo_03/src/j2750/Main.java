package j2750;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int K = sc.nextInt();	//한개 가격
		int N = sc.nextInt();	//개수
		int M = sc.nextInt();	//가진 돈의 액수
		
		int ans = ((K*N) - M);
		if (ans < 0)
			System.out.println(0);
		else {
			System.out.println(ans);
		}
		
	}
}
