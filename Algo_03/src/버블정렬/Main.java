package 버블정렬;

import java.util.Scanner;

public class Main {
	static int num;
	static int[] x;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("버블 정렬 버전1");
		System.out.print("요소수 : ");
		num = sc.nextInt();
		
		x = new int[num];
		
		for (int i = 0; i < num; i++) {
			System.out.print("x[" + i + "]: ");
			x[i] = sc.nextInt();
		}
		
		bubbleSort();
		
		System.out.println("오름차순 정렬");
		for (int i = 0; i < x.length; i++) {
			System.out.println("x[" + i + "] : " + x[i]);
		}
		
	}

	private static void bubbleSort() {
		for (int i = 0; i < num-1; i++) {
			for (int j = num-1; j > i; j--) {
				if (x[j-1] > x[j])
					swap(j-1,j);
			}
		}
	}

	private static void swap(int i, int j) {
		int tmp = x[i];
		x[i] = x[j];
		x[j] = tmp;
	}
}
