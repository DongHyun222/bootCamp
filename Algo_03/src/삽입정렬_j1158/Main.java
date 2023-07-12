package 삽입정렬_j1158;

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
        	int j;
        	int tmp = x[i];
        	for (j = i; j > 0 && x[j-1] > tmp; j--) {
				x[j] = x[j-1];
			}
        	x[j] = tmp;
        	
			for (int k = 0; k < num; k++) {
				System.out.print(x[k]+" ");
			}
			System.out.println();
		}
	}
}
