package s1210;

import java.util.Scanner;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
   사용하는 클래스명이 Solution 이어야 하므로, 가급적 Solution.java 를 사용할 것을 권장합니다.
   이러한 상황에서도 동일하게 java Solution 명령으로 프로그램을 수행해볼 수 있습니다.
 */
public class Solution
{
	static int[] dx = {0,0,-1};
	static int[] dy = {-1,1,0};
	static int[][] arr;
	public static void main(String args[]) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		for(int test_case = 1; test_case <= 10; test_case++) {
			int targetX = 0;
			int targetY = 0;
			int T = Integer.parseInt(br.readLine());
			arr = new int[100][100];
			for (int i = 0; i < 100; i++) {
				st = new StringTokenizer(br.readLine());
				for (int j = 0; j < 100; j++) {
					arr[i][j] = Integer.parseInt(st.nextToken());
					if (arr[i][j] == 2) {
						targetX = i;
						targetY = j;
					}
				}
			}
			int result = sadari(targetX,targetY);
			System.out.println("#" + T + " " + result);
		}
	}
	

	public static int sadari(int x, int y ) {
		int ans = 0;
		while (true) {
			if (x == 0) {
				ans = y;
				break;
			}
			for (int i = 0; i < 3; i++) {
				int nx = x + dx[i];
				int ny = y + dy[i];
				if (inRange(nx,ny) && arr[nx][ny] == 1) {
					arr[x][y] = 4;
					x = nx;
					y = ny;
				}
			}
		}	
		return ans;
	}
	
	public static boolean inRange(int x,int y) {
		return x >= 0 && y >= 0 && x < 100 && y < 100;
	}
}
/*
 * System.setIn(new FileInputStream("src/s1210/input.txt"));

		Scanner sc = new Scanner(System.in);
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for(int test_case = 1; test_case <= 10; test_case++)
		{
			int t = sc.nextInt();
			int graph[][] = new int[100][100];
			int x = 0;
			
			for (int i = 0; i < 100; i++) {
				for (int j = 0; j < 100; j++) {
//					st = new StringTokenizer(br.readLine());
//					graph[i][j] = Integer.parseInt(st.nextToken());
					graph[i][j] = sc.nextInt();
				}
			}
			for (int i = 0; i < 100; i++) {
				if (graph[99][i] == 2) {
					x = i;
					break;
				}
			}
//			System.out.println(x+ " " + graph[99][0]);
			for (int j = 98; j >= 0; j--) {
				if ((x-1) >= 0 && graph[j][x-1] == 1) {
					while (true) {
						x -= 1;
						if (graph[j][x-1] == 0  || (x-1) < 0)
							break;
					}
				} else if ((x+1) < 100 && graph[j][x+1] == 1) {
					while (true) {
						x += 1;
						if (graph[j][x+1] == 0 || (x+1) == 100)
							break;
					}
				} else{
					continue;
				}
			}
		System.out.println("#"+ t +" "+ x);
		}
 * 
 */