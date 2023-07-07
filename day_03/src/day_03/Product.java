package day_03;

/** 상품기본정보 정의용 클래스 */
public class Product {
	String code;	//상품코드		//얘네는 힙영역에 있음
	String name;	//상품이름
	String company;	//제조사
	int price;		//상품가격
	static int count = 0;		//static은 클래스 소속, 호출할때도 Product.count=3; 이렇게 호출해야됨
								//메소드영역	
	static public void prn() {
//		this.price = 100; 	//static안에선 this 사용 못함
		Product p1 = new Product("11", "11", "11", 100);	//스태틱 메서드는 선언만 같이될 뿐이지 완전히 다른 영역에 존재
		p1.price = 200;										//독립적인 작업을 하는 용도로 static임 (단순 계산, 랜덤계산 등)
	}
	
	public Product(String code, String name, String company, int price) {
		super();		//부모 생성자를 호출
		this.code = code;
		this.name = name;
		this.company = company;
		this.price = price;
		count++;
	}
	
	public void printInfo() {
		System.out.println("code=" + code+ ", name="+name + ", company="+company + ", price="+price);
	}
}
