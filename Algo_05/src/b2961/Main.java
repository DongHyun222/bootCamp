package b2961;

import java.util.Scanner;

public class Main {
	static int[][] arr ;
    static boolean[] visited;
    static int N ; 
    static int result; 
	
    static void powerSet(int depth, int ccnt) {
        if (depth == N) {
        	int sub_ans = find_ans();
        	if (sub_ans < result & ccnt != 0)
        		result = sub_ans;
        	return;
        }

        visited[depth] = false;
        powerSet(depth + 1,ccnt);

        visited[depth] = true;
        powerSet(depth + 1,ccnt+1);
    }
    
	private static int find_ans() {
		int sin = 1;
		int ssn = 0;
		for (int i = 0; i < N; i++) {
			if (visited[i] == true) {
				sin *= arr[i][0];
				ssn += arr[i][1];
			}
		}
		return Math.abs(sin-ssn);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		visited = new boolean[N];
		arr = new int[N][2];
		result = (int) 99999;
		
		for (int i = 0; i < N; i++) {
			arr[i][0] = sc.nextInt();
			arr[i][1] = sc.nextInt();
		}
		
		powerSet(0,0);
		System.out.println(result);
	}
}
