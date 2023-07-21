package kb1반_고동현;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class kb1반_알고리즘2번_고동현 {
	static int N;
	static int M;
	static int[][] graph;
	static int[][] visited;
	static int[] dx;
	static int[] dy;
	static int day;
	static int person;
	static int start_x, start_y;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		M = Integer.parseInt(st.nextToken());
		N = Integer.parseInt(st.nextToken());
		
		graph = new int[N][M];
		visited = new int[N][M];
		dx = new int[] {-1,0,1,0};
		dy = new int[] {0,-1,0,1};
		
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			String line = st.nextToken();
			for (int j = 0; j < M; j++) {
				graph[i][j] = Integer.parseInt(line.substring(j, j+1));
			}
		}
		st = new StringTokenizer(br.readLine());
		start_y = Integer.parseInt(st.nextToken());
		start_x = Integer.parseInt(st.nextToken());
		
		BFS(start_x,start_y);
		person = 0;
		day = 0;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				if (graph[i][j] == 1 && visited[i][j] == 0) {
					person += 1;
				} else if (visited[i][j] != 0) {
					day = Math.max(day, visited[i][j]);
				}
			}
		}
		System.out.println(day);
		System.out.println(person);
	}

	private static void BFS(int x, int y) {
		Queue<int[]> q = new LinkedList<int[]>();
		q.add(new int[] {x,y});
		visited[x][y] = 3;
		day = 3;
		
		while (!q.isEmpty()) {
			int n[] = q.poll();
			for (int i = 0; i < 4; i++) {
				int nx = n[0] + dx[i];
				int ny = n[1] + dy[i];
				if (in_range(nx,ny) && visited[nx][ny] == 0 && graph[nx][ny] == 1) {
					visited[nx][ny] = visited[n[0]][n[1]] + 1;
					q.add(new int[] {nx,ny});
				}
			}
		}
	}

	private static boolean in_range(int nx, int ny) {
		return 0 <= nx && nx < N && 0 <= ny && ny < M;
	}
}

