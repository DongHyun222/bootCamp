package kb1반_고동현;

import java.util.Iterator;
import java.util.Scanner;

public class kb1반_알고리즘1번_고동현 {
	static int N;
	static int M;
	static int ans;
	static int[] parent;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();	//마을사람 수
		M = sc.nextInt();	//친구 관계 수
		ans = 0;			//답
		parent = new int[N+1];
		
		for (int i = 1; i <= N; i++) {
			parent[i] = i;
		}
		
		for (int i = 0; i < M; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			union(a,b);
		}
		
		for (int i = 1; i <= N; i++) {
			if (parent[i] == 1) {
				ans += 1;
			}
		}
		
		System.out.println(ans -1);
	}

	private static void union(int a, int b) {
		a = find(a);
		b = find(b);
		if (a != b) {
			if (a < b) {
				parent[b] = a;
			} else {
				parent[a] = b;
			}
		}
	}
	private static int find(int a) {
		if (a == parent[a])
			return a;
		return parent[a] = find(parent[a]);
	}
}
