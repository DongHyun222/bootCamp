package s5521;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Solution {
	static ArrayList<Integer>[] graph;
	static int visited[];
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int T = Integer.parseInt(st.nextToken());
		
		for (int i = 1; i <= T; i++) {
			st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken()); 
			int M = Integer.parseInt(st.nextToken());
			graph = new ArrayList[N+1];
			visited = new int[N+1];
			
			for (int j = 1; j <=N ; j++) {
				graph[j] = new ArrayList<Integer>();
				visited[j] = 0;
			}
			
			for (int j = 0; j < M; j++) {
				st = new StringTokenizer(br.readLine());
				int a = Integer.parseInt(st.nextToken());
				int b = Integer.parseInt(st.nextToken());
				graph[a].add(b);
				graph[b].add(a);
			}
			
			int cnt = BFS(1);
			System.out.println("#"+i+ " "+cnt);
		}
	}

	private static int BFS(int node) {
		int sub_cnt = 0;
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(node);
		visited[node] = 1;
		
		while (!q.isEmpty()) {
			int n_node = q.poll();
			for (int idx : graph[n_node]) {
				if (visited[n_node] < 3 && visited[idx] == 0) {
					visited[idx] = visited[n_node] + 1;
					sub_cnt += 1;
					q.add(idx);
				}
			}
		}
		
		return sub_cnt;
	}
}



