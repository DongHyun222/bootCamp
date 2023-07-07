package day_04;

public class MyMemberExam {
	public static void main(String[] args) {
		//회원정보 관리 - 등록, 검색, 수정, 삭제 (CRUD)
		//회원 : 이름, 나이
		MyMember m1 = new MyMember("홍길동", 33);		
		System.out.println(m1);
		System.out.println(m1.toString());
		
		MyMember[] mems = new MyMember[300];		//new로 만든건 다 객체임
		int count = 0;	//객체 저장할 위치 -> 저장갯수
		mems[count++] = new MyMember("김길동", 23);
		mems[count++] = new MyMember("고길동", 30);
		mems[count++] = new MyMember("박길동", 45);
		System.out.println("count=" + count);
		
		//목록출력
		System.out.println("***목록***");
		for (int i = 0; i < count; i++) {
			System.out.println(mems[i]);
		}
		
		//회원검색
		System.out.println("***회원검색***");
		String findName = "김길동";
		int targetIndex = -1;	//찾은 회원의 위치번호
		for (int i = 0; i < count; i++) {
			if (findName == mems[i].getName()) {
				targetIndex = i;
			}
		}
		if (targetIndex == -1) {
			System.out.println("못찾았음");
		} else {
			System.out.println("---찾았음---" + mems[targetIndex]);
		}
		
		//수정 - 김길동 나이 1 증가
		System.out.println("***회원수정***");
		findName = "김길동";
		targetIndex = -1;	//찾은 회원의 위치번호
		for (int i = 0; i < count; i++) {
			if (findName == mems[i].getName()) {
				targetIndex = i;
			}
		}
		if (targetIndex == -1) {
			System.out.println("못찾았음");
		} else {
			System.out.println("---찾았음---" + mems[targetIndex]);
			int age = mems[targetIndex].getAge();
			mems[targetIndex].setAge(age + 1);
			System.out.println("수정후 : " + mems[targetIndex]);
		}
		
		//삭제 - 김길동 삭제
		//객체 삭제는 불가능함 따라서 선택안되게 해야됨
		System.out.println("***회원삭제***");
		findName = "고길동";
		targetIndex = -1;	//찾은 회원의 위치번호
		for (int i = 0; i < count; i++) {
			if (findName == mems[i].getName()) {
				targetIndex = i;
			}
		}
		if (targetIndex == -1) {
			System.out.println("못찾았음");
		} else {
			mems[targetIndex] = mems[targetIndex+1];
			count--;
		}
		
		//목록출력
		System.out.println("***목록***");
		for (int i = 0; i < count; i++) {
			System.out.println(mems[i]);
		}
		
	}
}
