import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BFS_b1697 {
	static int N;
	static int K;
	static int[] visited;
	static int[] line;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		K = sc.nextInt();
		visited = new int[100001];
		
		BFS(N);
		System.out.println(visited[K]-1);
	}

	private static void BFS(int n) {
		visited[n] = 1;
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(n);
		
		while (!q.isEmpty()) {
			int idx = q.poll();
			int[] lst = new int[] {idx-1,idx+1,idx*2};
			
			for (int i : lst) {
				if (0 <= i && i < 100001 && visited[i] == 0) {
					visited[i] = visited[idx] + 1;
					if (i == K) {
						return;
					}
					q.add(i);
				}
			}
		}
	}
}
