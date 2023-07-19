package boj1325;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int N;
	static int M;
	static List<Integer>[] graph;
	static boolean[] visited;
	static int[] ans;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		ans = new int[N+1];
		graph = new ArrayList[N+1];
		for (int i = 1; i <= N; i++) {
			graph[i] = new ArrayList<>();
		}
		
		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			graph[b].add(a);
		}
		
		int mmax = -1;
		for (int i = 1; i <= N; i++) {
			visited = new boolean[N+1];
			int cnt = BFS(i);
			if (cnt >= mmax) {
				mmax = cnt;
				ans[i] = cnt;
			}
		}
		
		for (int i = 1; i <= N; i++) {
			if (ans[i] == mmax) {
				System.out.print(i + " ");
			}
		}
		
	}
	private static int BFS(int node) {
		Queue<Integer> q = new LinkedList<Integer>();
		int sub_cnt = 1;
		q.add(node);
		visited[node] = true;
		
		while (!q.isEmpty()) {
			int n_node = q.poll();
			for (int i : graph[n_node]) {
				if (!visited[i]) {
					visited[i] = true;
					sub_cnt += 1;
					q.add(i);
				}
			}
		}
		return sub_cnt;
	}
}
