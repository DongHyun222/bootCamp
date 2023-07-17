package kb1반_고동현;

import java.util.Iterator;
import java.util.Scanner;

public class kb1반_알고리즘1번_고동현 {
	static int[] arr;
	
	public static void main(String[] args) {
		Scanner	sc = new Scanner(System.in);
		int N = sc.nextInt();
		arr = new int[N];
		
		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}
		
		for (int i = 0; i < N-1; i++) {
        	int max = i; 
        	for (int j = i+1; j < N; j++) {
				if (arr[j] > arr[max])
					max = j;
			}
        	swap(i,max);
		}
		
		for (int i = 0; i < N; i++) {
			System.out.println(arr[i]);
		}
		
	}
	
	private static void swap(int i, int j) {
		int tmp = arr[i];
		arr[i] = arr[j];
		arr[j] = tmp;
	}
}
