package 선택정렬;

import java.util.Scanner;

public class j1146 {
	static int num;
	static int[] x;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		num = sc.nextInt();
		
		x = new int[num];
		
		for (int i = 0; i < num; i++) {
			x[i] = sc.nextInt();
		}

        for (int i = 0; i < num-1; i++) {
        	int min = i; 
        	for (int j = i+1; j < num; j++) {
				if (x[j] < x[min])
					min = j;
			}
        	swap(i,min);

			for (int j = 0; j < num; j++) {
				System.out.print(x[j]+" ");
			}
			System.out.println();
		}
	}

	private static void swap(int i, int j) {
		int tmp = x[i];
		x[i] = x[j];
		x[j] = tmp;
	}
}