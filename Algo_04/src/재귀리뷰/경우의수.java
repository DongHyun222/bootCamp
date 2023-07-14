package 재귀리뷰;

public class 경우의수 {
	static int[] arr;	//원소
	static int n;		//답의 길이
	static int[] result;//답 저장배열
	public static void main(String[] args) {	//주말과제 한줄한줄코멘트를 달자
		//원소 {1,2,3}에 대한 모든 숫자 조합
		arr = new int[] {1,2,3};	//반복할 숫자
		n = arr.length;				//출력할 숫자조합 길이 
		result = new int[n];		//정답 저장할 배열
		
		recur(0);	//깊이 0 전달
		
	}
	private static void recur(int depth) {
		if (depth == n) { //종료조건
			printResult();
			return;
		}
		//처리코드	(result에 숫자 누적)
		for (int i = 0; i < arr.length; i++) {
			result[depth] = arr[i];	//깊이 자리에 i번째 숫자저장
			recur(depth+1);	//깊이증가후 재귀호출
		}
	}
	//답출력
	private static void printResult() {
		for (int i : result) {
			System.out.print(i);
		}
		System.out.println();
	}
}
