package kb1반_고동현;

import java.util.Scanner;

public class kb1반_알고리즘3번_고동현 {
	static int N;
	static int M;
	static int[] lst;
	static boolean[] visited;
	static int max_cnt;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		lst = new int[N+1];
		visited = new boolean[N+1];
		
		for (int i = 1; i <= N; i++) {
			lst[i] = sc.nextInt();
		}
		max_cnt = 0;
		DFS(0,0,1);
		System.out.println(max_cnt);
	}

	private static void DFS(int idx, int level, int cnt) {
		if (level == M) {
			max_cnt = Math.max(max_cnt, cnt);
			return;
		}
		if ((idx+1) <= N) {
			//밀기 할때
//			visited[idx] = true;
			DFS(idx+1, level+1, cnt + lst[idx+1]);
//			visited[idx] = false;
		}
		if ((idx + 2) <= N) {
//			visited[idx] = true;
			DFS(idx+2, level+1, (cnt/2)+lst[idx+2]);
//			visited[idx] = false;
		}
	}
}
