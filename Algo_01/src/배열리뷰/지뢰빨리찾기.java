package 배열리뷰;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class 지뢰빨리찾기 {
	public static void main(String[] args) throws IOException {
		/*
		 * 10x10좌표에 10개 임의의 위치에 지뢰를매설
		 * 사용자는 행,열 좌표를 입력 (1~10)좌표
		 * 해당 좌표가 지뢰이면 X, 아니면 주위8칸내지뢰 갯수 표시
		 * 열지 않은 좌표는 "+" 표시
		 * 지뢰는 9로 표시
		 * 
		 * 작성순서
		 * 1. 12x12 정수배열생성
		 * 2. 중복되지 않은 10개 좌표 생성
		 * 3. 각 좌표에 9저장. 주위8개에 1씩 증가
		 * 4. 반복
		 * 5. 사용자로부터 좌표입력
		 * 6. 해당좌표의 값이 9이상이면 해당좌표는 지뢰임
		 * 7. 해당좌표가 9 미만이면 지뢰아님
		 * 8. 전체배열 출력(+:오픈안한좌표, 숫자:지뢰아닌곳, X:지뢰
		 * 9. 지뢰 10개 다찾으면 종료, 아니면 5번부터 반복
		 */
		
		int graph[][] = new int[12][12];
		boolean open[][] = new boolean[12][12];	// 오픈여부
		ArrayList<Integer> nums = new ArrayList<Integer>();
		for (int i = 0; i < 100; i++) {
			nums.add(i);
		}
		
		int[] dx = {-1,-1,0,1,1,1,0,-1};
		int[] dy = {0,1,1,1,0,-1,-1,-1};
		
		for (int i = 0; i < 10; i++) {
			int r = (int)(Math.random()*nums.size());
			int num_r = nums.remove(r);
//			System.out.println(num_r);
			int row = num_r / 10 + 1;
			int col = num_r % 10 + 1;
			
			graph[row][col] += 9;
			for (int j = 0; j < 8; j++) {
				int nx = row + dx[j];
				int ny = col + dy[j];
//				System.out.println(nx + " " + ny);
				graph[nx][ny] += 1;
			}
		}
		
		for (int i = 1; i < 11; i++) {
			for (int j = 1; j < 11; j++) {
				System.out.print(graph[i][j]+ " ");
			}
			System.out.println("");
		}
		
		Scanner sc = new Scanner(System.in);
		int cnt = 0;
		while (true) {
			if (cnt == 10) {
				break;
			}
			
			int x = sc.nextInt();
			int y = sc.nextInt();
			open[x][y] = true;
			
			if (graph[x][y] >= 8) {
				cnt += 1;
				System.out.println("찾은지뢰갯수 : " + cnt);
			}
			
			for (int i = 1; i < 11; i++) {
				for (int j = 1; j < 11; j++) {
					
					if (open[i][j] == false) {
						System.out.print('+' + " ");
					}
					else {
						if (graph[x][y] >= 8) {
							System.out.print("X" + " ");
						} else {
							System.out.print(graph[x][y] + " ");
						}
					}
				}System.out.println("");
			}
		}
		
	}
}
