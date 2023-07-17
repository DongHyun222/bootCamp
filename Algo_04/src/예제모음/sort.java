package 예제모음;

import java.util.Arrays;
import java.util.Comparator;

public class sort {
	public static void main(String[] args) {
		int[][] arr = new int[][] {{1,40}, {1,50}, {1,30}, {4,20}, {2,10}};
		
		Arrays.sort(arr,(o1,o2) -> {
			return o1[1] - o2[1];
		});
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i][0]+" "+arr[i][1]);
		}
		
		Arrays.sort(arr, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				if (o1[0] == o2[0]) {
					return o1[1] - o2[1];
				} else {
					return o1[0] - o2[0];
				}
			}
		});
		System.out.println("*******");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i][0]+" "+arr[i][1]);
		}
		
		
	}
}
