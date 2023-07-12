package 퀵정렬;

import java.util.Scanner;

public class quickSort {
	static int num;
	static int[] x;
	
	static void quickSort(int[] a, int left, int right) {
		int pl = left;
		int pr = right;
		int mid = a[(pr+pl) / 2];
		
		do {
			while (a[pl] < mid) pl++;
			while (a[pr] > mid) pr--;
			if (pl <= pr)
				swap(a,pl++,pr--);
		} while (pl <= pr);
		
		if (left < pr) quickSort(a,left,pr);
		if (pl < right) quickSort(a,pl,right);
		
	}
	
	private static void swap(int[] a, int i, int j) {
		int tmp = a[i];
		a[i] = a[j];
		a[j] = tmp;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("퀵정렬");
		System.out.print("요소수 : ");
		num = sc.nextInt();
		
		x = new int[num];
		
		for (int i = 0; i < num; i++) {
			System.out.print("x[" + i + "]: ");
			x[i] = sc.nextInt();
		}
		
		quickSort(x,0,num-1);
		
		System.out.println("오름차순 정렬");
		for (int i = 0; i < x.length; i++) {
			System.out.println("x[" + i + "] : " + x[i]);
		}
		
	}
}
