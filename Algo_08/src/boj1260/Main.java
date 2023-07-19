package boj1260;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static ArrayList<Integer>[] graph;
	static boolean[] visited;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int start = Integer.parseInt(st.nextToken());
		
		graph = new ArrayList[N+1];
		visited = new boolean[N+1];
		
		for (int i = 1; i <= N; i++) {
			graph[i] = new ArrayList<Integer>();
		}
		
		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			graph[a].add(b);
			graph[b].add(a);
		}
		
		for (int i = 1; i <= N; i++) {
			Collections.sort(graph[i]);
		}
		
		DFS(start);
		System.out.println();
		visited = new boolean[N+1];
		BFS(start);
		
		
	}
	private static void DFS(int node) {
		if (visited[node])
			return;
		System.out.print(node+" ");
		visited[node] = true;
		
		for (int idx : graph[node]) {
			DFS(idx);
		}
	}

	private static void BFS(int node) {
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(node);
		visited[node] = true;
		System.out.print(node+ " ");
		
		while (!q.isEmpty()) {
			int n_node = q.poll();
			for (int idx : graph[n_node]) {
				if (!visited[idx]) {
					visited[idx] = true;
					System.out.print(idx + " ");
					q.add(idx);
				}
			}
		}
	}
}
