package day_03;

public class 회원관리 {
	public static void main(String[] args) {
//		MyMember m1 = new MyMember("홍길동", 33, "111-222");
//		MyMember m2 = new MyMember("김길동", 35, "111-333");
		MyMember[] mems = new MyMember[3];		//new는 객체생성 연산자 따라서 배열객체는 1개 생성
												//mems는 스택에, mems주소를 통해 힙으로 가서 배열3개를 만듬
		mems[0] = new MyMember("홍길동", 33, "111-222");
		System.out.println(mems[0].toString());
	}
}
