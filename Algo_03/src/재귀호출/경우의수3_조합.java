package 재귀호출;

public class 경우의수3_조합 {//숫자는 1번씩 사용됨, 2개 숫자만 추출
	static int[] arr;
	static int[] result;
	static int n;
	static boolean[] visited;
	public static void main(String[] args) {
		n = 2;	//길이
		arr = new int[] {1,2,3};	//원소저장
		result = new int[n] ;	//답저장
		visited = new boolean[arr.length] ;	//답저장
		recur(0);
	}

	private static void recur(int depth) {
		if (depth == n) {	//종료조건
			print();
			return;
		}
		//처리코드(깊이의 숫자위치에 i값을 저장)
		for (int i = 0; i < arr.length; i++) {
			if (visited[i] == false) {
				visited[i] = true;
				result[depth] = arr[i];
				recur(depth + 1);
				visited[i] = false;
			}
		}
	}
	
	private static void print() {
		for (int i : result) {
			System.out.print(i);
		}
		System.out.println();
	}
}
