package j1157;

import java.util.Scanner;

public class Main {
	static int num;
	static int[] x;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		num = sc.nextInt();
		
		x = new int[num];
		
		for (int i = 0; i < num; i++) {
			x[i] = sc.nextInt();
		}

        for (int i = 1; i < num; i++) {
			for (int j = 0; j < num-i; j++) {
				if (x[j] > x[j+1])
					swap(j,j+1);
			}
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
