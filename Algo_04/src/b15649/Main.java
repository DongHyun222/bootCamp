package b15649;

import java.util.Scanner;

public class Main {
	static int[] arr;
	static int[] result;
	static boolean[] visited;
	static int N;
	static int M;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		M = sc.nextInt();
		arr = new int[N];
		result = new int[M];
		visited = new boolean[N];
		for (int i = 1; i <= N; i++) {
			arr[i-1] = i;
		}
		
		recur(0,M);
		
	}

	private static void recur(int depth, int m) {
		if (depth == m) {
			printResult();
			return;
		}
		for (int i = 0; i < arr.length; i++) {
			if (visited[i] == false) {
				visited[i] = true;
				result[depth] = arr[i];
				recur(depth+1,m);
				visited[i] = false;
			}
		}
	}

	private static void printResult() {
		for (int i : result) {
			System.out.print(i+" ");
		}
		System.out.println();
	}
	
}
