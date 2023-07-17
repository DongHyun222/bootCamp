package kb1반_고동현;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class kb1반_알고리즘2번_고동현 {
	static int[] arr;
	static int N;
	static int max;
	static boolean[] visited;
	static int cnt;
	static int sub_cnt;
	static int ans;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		max = Integer.parseInt(st.nextToken());
		arr = new int[N];
		visited = new boolean[N];
		cnt = 0;
		sub_cnt = 0;
		
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		recur(0,sub_cnt);
		System.out.println(cnt);
		
	}
	
	private static void recur(int depth,int sub_cnt) {
		if (depth == 3) {
			if (sub_cnt > cnt && sub_cnt < max) {
				cnt = sub_cnt; 
				return;
			}
		}
		for (int i = 0; i < N; i++) {
			if (visited[i] == false) {
				visited[i] = true;
				recur(depth+1, sub_cnt+arr[i]);
				visited[i] = false;
			}
		}
	}
}
