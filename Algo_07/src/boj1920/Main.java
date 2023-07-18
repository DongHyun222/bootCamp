package boj1920;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int arr1[] = new int[N];
		for (int i = 0; i < N; i++) {
			arr1[i] = sc.nextInt();
		}
		Arrays.sort(arr1);
		
		int M = sc.nextInt();
		int arr2[] = new int[M];
		for (int i = 0; i < M; i++) {
			arr2[i] = sc.nextInt();
		}
		
		for (int i = 0; i < M; i++) {
			int idx = arr2[i];
			int left = 0;
			int right = N-1;
			int ans = 0;
			
			while (left <= right) {
				int mid = (left+right)/2;
				
				if (idx == arr1[mid]) {
					ans = 1;
					break;
				} else if(idx < arr1[mid]) {
					right = mid - 1;
				} else {
					left = mid + 1;
				}
			}
			System.out.println(ans);
		}
	}
}
