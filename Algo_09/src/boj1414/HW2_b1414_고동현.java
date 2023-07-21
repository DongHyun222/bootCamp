package boj1414;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class HW2_b1414_고동현 {
	static int N, sum;	//방 개수, 전체 랜선길이 합
	static int[] parent;	//대표노드
	static PriorityQueue<Edge> q;	//우선순위 큐
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	//빠르게 입력받기
		StringTokenizer st = new StringTokenizer(br.readLine());	//한줄씩 입력 받기
		
		int N = Integer.parseInt(st.nextToken());	//방 갯수 입력 받기
		q = new PriorityQueue<Edge>();	//최소신장트리 구하기 위해 우선순위 큐
		sum = 0;	//전체 랜선길이 합 구하기
		
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());	//한줄입력받기
			char[] tempc = st.nextToken().toCharArray();	//입력받은걸 쪼개서 저장
			for (int j = 0; j < N; j++) {
				int temp = 0;	//위에서 받은걸 조건에 맞게 정수로 바꾸기 위해 사용
				if (tempc[j] >= 'a' && tempc[j] <='z')	//소문자일때 (1~26)
					temp = tempc[j] - 'a' + 1;	//정수반환
				else if (tempc[j] >= 'A' && tempc[j] <='Z')	//대문자일때 (27~52)
					temp = tempc[j] - 'A' + 27;	//정수반환
				sum += temp;	//전체랜선 길이 누적더해주기
				if (i != j && temp !=0) {	//대각선과 0이 아니면
					q.add(new Edge (i,j,temp));	//우선순위 큐에 추가
				}
			}
		}
		parent = new int[N];	//각 대표노드(부모노드) 초기화
		for (int i = 0; i < N; i++) {
			parent[i] = i;	//자기자신으로 초기화
		}
		
		int useEdge = 0;	//사용한 간선의 개수
		int result = 0;		//MST 가중치 합(랜선길이 합)
		while (!q.isEmpty()) {	//우선순위 큐가 빌동안
			Edge now = q.poll();	//우선순위 큐에서 계속 꺼내서
			if (find(now.s) != find(now.e)) {	//대표노드(부모노드)가 다를때
				union(now.s, now.e);	//앞에서 했던 합치기 (대표노드 같게)
				result += now.v;	//가중치 합 더하고
				useEdge += 1;		//간선개수 += 1
			}
		}
		if (useEdge == N-1)	//만약에 모든 노드가 연결되어 있다면
			System.out.println(sum - result);	//전체랜선길이에서 MST가중치 합을 뺌
		else
			System.out.println(-1);		//모든컴퓨터 연결 X
	}
	
	private static void union(int a, int b) {	//대표노드 합치기
		a = find(a);	//대표노드
		b = find(b);	//대표노드
		if (a != b)	//대표노드(부모노드)가 다르면
			parent[b] = a;	//합쳐줌
	}
	private static int find(int a) {	//대표노드찾기
		if (a == parent[a])	//대표노드가 본인이면
			return a;	//그대로 반환
		return parent[a] = find(parent[a]);	//대표노드가 본인 아니면 재귀로 찾아감
	}
}
class Edge implements Comparable<Edge>{	//간선정보저장
	int s,e,v;	//시작, 종료노드, 가중치
	Edge(int s, int e, int v) {
		this.s = s;	//시작노드
		this.e = e;	//종료노드
		this.v = v;	//가중치
	}
	@Override
	public int compareTo(Edge o) {	//노드의 가중치를 오름차순으로 정렬
		return this.v - o.v;	//음수면 앞에놈이 먼저, 양수면 뒤에놈이 먼저
	}
}
