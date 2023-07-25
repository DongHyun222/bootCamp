package day_16;

public class PainterExam2 {
	public static void main(String[] args) {
		MyLine[] lines = new MyLine[100];
		Mycircle[] circles = new Mycircle[100];
		
		MyLine ml = new MyLine(0,0,0,0);
		lines[0] = ml;
//		circles[0] = ml;
		//자식 -> 부모로 업캐스팅으로의 형변환은 가능
		//부모 -> 자식으로 다운캐스팅은 불가능
		MyShape[] msarr = new MyShape[100];
		msarr[0] = ml;
		msarr[1] = new Mycircle(0,0,10);
		//부모타입 배열에 자식타입을 넣음
		
		//ms -> MyShape타입이고 ->Mycircle을 가리킴
		MyShape ms = new Mycircle(0,0,10);
		//오버라이딩한 자식의 메서드가 호출
		System.out.println(ms.draw());
		
	}
}
