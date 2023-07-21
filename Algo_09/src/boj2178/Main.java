package boj2178;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int[][] visited;
	static int[][] graph;
	static int[] dx;
	static int[] dy;
	static Integer N;
	static Integer M;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());

		graph = new int[N][M];
		visited = new int[N][M];
		dx = new int[] { 0, -1, 0, 1 };
		dy = new int[] { -1, 0, 1, 0 };

		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			String line = st.nextToken();
			for (int j = 0; j < M; j++) {
				graph[i][j] = Integer.parseInt(line.substring(j, j + 1));
			}
		}
		BFS(0, 0);
		System.out.println(visited[N - 1][M - 1]);
	}

	private static void BFS(int x, int y) {
		Queue<int[]> q = new LinkedList<>();
		q.add(new int[] { x, y });
		visited[x][y] = 1;

		while (!q.isEmpty()) {
			int n[] = q.poll();
			for (int i = 0; i < 4; i++) {
				int nx = n[0] + dx[i];
				int ny = n[1] + dy[i];
				if (in_range(nx, ny) && visited[nx][ny] == 0 && graph[nx][ny] == 1) {
					visited[nx][ny] = visited[n[0]][n[1]] + 1;
					q.add(new int[] { nx, ny });
				}
			}
		}
	}

	private static boolean in_range(int nx, int ny) {
		return 0 <= nx && nx < N && 0 <= ny && ny < M;
	}
}
