package boj1197;

import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	static int[] parent;
	static PriorityQueue<pEdge> q;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		q = new PriorityQueue<>();
		parent = new int[N+1];
		for (int i = 0; i < N; i++) {
			parent[i] = i;
		}
		for (int i = 0; i < M; i++) {
			int s = sc.nextInt();
			int e = sc.nextInt();
			int v = sc.nextInt();
			q.add(new pEdge(s, e, v));
		}
		int useEdge = 0;
		int result = 0;
		while (useEdge < N-1) {
			pEdge now = q.poll();	//(s,e,v)
			if (find(now.s) != find(now.e)) {
				union(now.s,now.e);
				result += now.v;
				useEdge += 1;
			}
		}
		System.out.println(result);
	}
	
	private static int find(int a) {
		if (a == parent[a])
			return a;
		return parent[a] = find(parent[a]);
	}
	
	private static void union(int a, int b) {
		a = find(a);
		b = find(b);
		if (a != b) {
			parent[b] = a;
		}
	}
}
class pEdge implements Comparable<pEdge> {
	int s;
	int e;
	int v;
	pEdge(int s, int e, int v) {
		this.s = s;
		this.e = e;
		this.v = v;
	}
	
	@Override
	public int compareTo(pEdge o) {
		return this.v - o.v;
	}
}
