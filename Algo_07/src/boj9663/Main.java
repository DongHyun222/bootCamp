package boj9663;

import java.util.Scanner;

public class Main {	//백준 9663, swea2806
	static int[] arr;
	static int N;
	static int count;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		arr = new int[N];
		
		nQueen(0);
		System.out.println(count);
	}
	
	private static void nQueen(int depth) {
		if (depth == N) {
			count += 1;
			return;
		}
		
		for (int i = 0; i < N; i++) {
			arr[depth] = i;
			
			if (Possibility(depth)) {
				nQueen(depth + 1);
			}
		}
	}
	
	private static boolean Possibility(int depth) {
		for (int i = 0; i < depth; i++) {
			if (arr[depth] == arr[i]) {
				return false;
			} else if (Math.abs(depth-i) == Math.abs(arr[depth]-arr[i])) {
				return false;
			}
		}
		return true;
	}
}
