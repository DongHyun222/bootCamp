package kb1반_고동현;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class kb1반_알고리즘3번_고동현 {
	static int[] dx;
	static int[] dy;
	static int[][] arr;
	static boolean[][] visited;
	static int N;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		dx = new int[]{-1,-1,0,1,1,1,0,-1};
		dy = new int[]{0,1,1,1,0,-1,-1,-1};
		arr = new int[19][19];
		visited = new boolean[19][19];
		N = 19;
		
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < N; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (arr[i][j] == 1) {
					for (int k = 0; k < 8; k++) {
						int nx = i + dx[k];
						int ny = j + dy[k];
						int sub_cnt = 1;
						if (arr[nx][ny] == 1) {
							sub_cnt += 1;
							while (true) {
								nx += dx[k];
								ny += dy[k];
								if (arr[nx][ny] == 1) {
									sub_cnt += 1;
								} else
									break;
							}
							if (sub_cnt == 5) {
								System.out.println(1);
								System.out.println((i+1) + " " + (j+1));
								return;
							}
						}
					}
					
				} else if(arr[i][j] == 2) {
					if (arr[i][j] == 2) {
						for (int k = 0; k < 8; k++) {
							int nx = i + dx[k];
							int ny = j + dy[k];
							int sub_cnt = 1;
							if (arr[nx][ny] == 2) {
								sub_cnt += 1;
								while (true) {
									nx += dx[k];
									ny += dy[k];
									if (arr[nx][ny] == 2) {
										sub_cnt += 1;
									} else
										break;
								}
								if (sub_cnt == 5) {
									System.out.println(1);
									System.out.println((i+1) + " " + (j+1));
									return;
								}
							}
						}
					}
				}
			}
		}
	System.out.println(0);
	}
}
