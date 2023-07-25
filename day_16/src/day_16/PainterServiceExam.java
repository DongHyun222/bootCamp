package day_16;

import service.MyShapeListService;

public class PainterServiceExam {
	public static void main(String[] args) {
		//도형을 관리할 객체 생성
		MyShapeListService mss = new MyShapeListService();
		
//		mss.add(new MyLine(0,0,3,3));
		MyLine m1 = new MyLine(0,0,3,3);
		mss.add(m1);
		m1 = new MyLine(3,3,9,9);
		mss.add(m1);
		m1 = new MyLine(6,6,10,10);
		mss.add(m1);
		m1 = new MyLine(4,4,15,15);
		mss.add(m1);
		System.out.println("저장개수: " + mss.getCount());
		//검색 -> 시작좌표로 검색, 반환타입은 인덱스번호 or 객체
		MyShape findShape = mss.findByPosition(3,3);
		if (findShape == null) {
			System.out.println("못찾음");
		} else {
			System.out.println("찾음: " + findShape.toString());	//println에서 변수를 집어넣으면 toString()메서드 호출함
		}
		//삭제
		boolean b = mss.remove(findShape);
		System.out.println("삭제 : " + b);
		mss.printAll();
	}
}
