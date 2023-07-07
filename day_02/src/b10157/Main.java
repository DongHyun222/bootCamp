package b10157;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt();
		int r = sc.nextInt();
		int t = sc.nextInt();
		
		int[][] arr = new int[c][r];
		
		int i = 0;
		int j = r - 1;
		arr[i][j] = 1;
		int cnt = 2;
		
		int x_flag = 0, y_flag = 0;
		boolean flag = false;
		while (true) {
			if ((x_flag%2) == 0) {
				for (int x = 1; x < r; x++) {
					if (cnt == t) {
						flag = true;
						break;}
					cnt += 1;
				}
			} else {
				for (int x = 1; x < r; x++) {
					if (cnt == t) {
						flag = true;
						break;}
					cnt += 1;
				}
			}
			if (flag == true) {
				System.out.println((c-i-1) + " " + (j+1));
				break;
			}
			if ((y_flag%2) == 0) {
				for (int y = 1; y < c; y++) {
					if (cnt == t) {
						flag = true;
						break;}
					cnt += 1;
				}
			} else {
				for (int y = 1; y < c; y++) {
					if (cnt == t) {
						flag = true;
						break;}
					cnt += 1;
				}
			}
			if (flag == true) {
				System.out.println((c-i-1) + " " + (j+1));
				break;
			}
			x_flag +=1;
			y_flag +=1;
			r -= 1;
			c -= 1;
			
//			arr[i][j] = cnt;
//			cnt += 1;
		}

	}

}
