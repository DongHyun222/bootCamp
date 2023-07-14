package b1722;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int Q = sc.nextInt();
		int S[] = new int[21];
		boolean visited[] = new boolean[21];
		
		long[] fac = new long[21];
		fac[0] = 1;
		
		for (int i = 1; i < fac.length; i++) {
			fac[i] *= fac[i-1] * i;
		}
		
		if (Q == 1) {
			long K = sc.nextLong();
			for (int i = 1; i <= N; i++) {
				for (int j = 1, cnt = 1; j <= N; j++) {
					if (visited[j])
						continue;
					if (K <= cnt * fac[N-i]) {
						K -= ((cnt-1) * fac[N-i]);
						S[i] = j;
						visited[j] = true;
						break;
					}
					cnt++;
				}
			}
			for (int i = 1; i <= N; i++) {
				System.out.print(S[i] + " ");
			}
		} else {
			
		}
	}
}
