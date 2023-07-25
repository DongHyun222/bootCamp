package WorkShop;

import java.util.ArrayList;

public class RentExam {
	public static void main(String[] args) {
		RentService rs = new RentService();
		
		nomalCar c = new nomalCar(1111,1000,"nomalCar",2010,111,5);
		van v = new van(1234, 700, "van", 1999, 666, 12, 4);
		truck t = new truck(2222, 2000, "truck", 2002, 444, 10);
		bus b = new bus(5555, 5000, "bus", 1988, 888, 30);
		
		rs.add(c);
		rs.add(v);
		rs.add(t);
		rs.add(b);
		
		individualMember im = new individualMember(100,"individualMember","1111-2222","홍길동");
		corporateMember cm = new corporateMember(2000,"corporateMember", "3333-4444", "(주)멀캠", "1010-111");
		
		rs.add(im);
		rs.add(cm);
		
		//회원번호, 승용차번호, 승용차의 대여비, "2023-07-01",7,"2023-07-07",17시까지
		rs.rent(im.getMemberNum(), c.getCarNum(), c.getCarPrice(),"2023-07-01",7, "2023-07-07",17);
		rs.rent(cm.getMemberNum(), c.getCarNum(), c.getCarPrice(),"2023-07-02",7,"2023-07-05",17);
		
		System.out.println("총 대여 횟수 : " + rs.getCount());
		rs.rentprint();
		
	}
}
