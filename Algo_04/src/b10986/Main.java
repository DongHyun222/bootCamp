package b10986;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		long dp[] = new long[N+1];
		int cnt = 0;
		
		st = new StringTokenizer(br.readLine());
		
		for (int i = 1; i < N+1; i++) {
			int A = Integer.parseInt(st.nextToken());
			dp[i] = (A + dp[i-1])%M;
			if (dp[i] == 0)
				cnt +=1;
		}
		
		long[] ans = new long[M];
		
		for (int i = 1; i < dp.length; i++) {
			ans[(int) dp[i]] += 1;
		}
		
		for (int i = 0; i < M; i++) {
			if (ans[i] > 1) {
				cnt += (ans[i] * (ans[i]-1) / 2);
			}
		}
		
		System.out.println(cnt);
	}
}
