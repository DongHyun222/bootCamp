package service;

import day_16.MyLine;
import day_16.MyShape;
import day_16.Mycircle;

public class MyShapeService {
	private MyShape[] lines = new MyShape[100];
	private int Count = 0;
	
//	public void add(MyLine m1) {
//		lines[Count++] = m1;
//	}
//	public void add(Mycircle m1) {
//		lines[Count++] = m1;
//	}
	//보통 위에있는 서브타입은 잘 안만들려고 하고
	//아래에 있는 부모타입을 주로 생성함 (사람마다 다름)
	public void add(MyShape m1) {
		lines[Count++] = m1;
	}
	public int getCount() {
		return Count;
	}
	public MyShape findByPosition(int startX, int startY) {
		for (int i = 0; i < Count; i++) {
			MyShape myShape = lines[i];
			if (myShape.getX()==startX && myShape.getY() == startY) {
				return myShape;		//이렇게 객체반환코드를 쓰는게 좋음 (인덱스 반환하면 안좋게봄)
			}
		}
		return null; // 못찾으면 null반환
	}
	public boolean remove(MyShape findShape) {
		for (int i = 0; i < Count; i++) {
			MyShape myShape = lines[i];
			if (myShape.equals(findShape)) {
				remove(i);
				return true;
			}
		}
		return false;
	}
	/** i번째 객체 삭제 */
	private void remove(int i) {
		for (int j = i; j < Count-1; j++) {
			lines[j] = lines[j+1];
		}
		Count--;
	}
	
	public void printAll() {
		System.out.println("** 전체출력 **");
		for (int i = 0; i < Count; i++) {
			MyShape myShape = lines[i];
			System.out.println(myShape);
		}
		System.out.println("** 출력끝 **");
	}
	
}
