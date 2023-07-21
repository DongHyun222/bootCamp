package boj1976;

import java.util.Scanner;

public class Main {
	static int[] parent;
	static int[][] graph;
	static int[] plan;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		graph = new int[N][N];
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				graph[i][j] = sc.nextInt();
			}
		}
		
		plan = new int[M];
		for (int i = 0; i < M; i++) {
			plan[i] = sc.nextInt()-1;
		}
		parent = new int[N];
		for (int i = 0; i < N; i++) {
			parent[i] = i;
		}
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (graph[i][j] == 1) {
					union(i,j);
				}
			}
		}
		
		int idx = find(plan[0]);
		for (int i = 1; i < M; i++) {
			if (idx != find(plan[i])) {
				System.out.println("NO");
				return;
			}
		}
		System.out.println("YES");
	}

	private static void union(int a, int b) {
		a = find(a);
		b = find(b);
		if (a != b) {
			parent[b] = a;
		}
	}

	private static int find(int a) {
		if (a == parent[a])
			return a;
		return parent[a] = find(parent[a]);
	}
}
