import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BFS_b7562 {
	static int[][] visited;
	static int[] dx;
	static int[] dy;
	static int cnt;
	static int N;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		dx = new int[] {-2,-1,1,2,2,1,-1,-2};
		dy = new int[] {1,2,2,1,-1,-2,-2,-1};
		
		for (int i = 0; i < T; i++) {
			N = sc.nextInt();	//한변의 길이
			visited = new int[N][N];
			
			int start_x = sc.nextInt();
			int start_y = sc.nextInt();
			int end_x = sc.nextInt();
			int end_y = sc.nextInt();
			
			BFS(start_x,start_y);
			System.out.println(visited[end_x][end_y]-1);
		}
		
	}

	private static void BFS(int x, int y) {
		Queue<int[]> q = new LinkedList<int[]>();
		q.add(new int[] {x,y});
		visited[x][y] = 1;
		
		while (!q.isEmpty()) {
			int n[] = q.poll();
			for (int i = 0; i < 8; i++) {
				int nx = n[0]+dx[i];
				int ny = n[1]+dy[i];
				if (in_range(nx,ny) && visited[nx][ny] == 0) {
					visited[nx][ny] = visited[n[0]][n[1]] + 1;
					q.add(new int[] {nx,ny});
				}
			}
		}
	}

	private static boolean in_range(int nx, int ny) {
		return 0 <= nx && nx < N && 0 <= ny && ny < N;
	}
}
