package j1314;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		char[][] arr = new char[n][n];
		
//		65 ~ 90
		int num = 65;
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (num == 91) {
					num = 65;
				}
				if ((i%2) == 1) {
					int subj = n-1;
					char ch = (char)num;
					arr[subj-j][i] = ch;
					num += 1;
				} else {
					char ch = (char)num;
					arr[j][i] = ch;
					num += 1;
				}
			}
		}
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}
