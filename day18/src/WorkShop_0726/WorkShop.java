package WorkShop_0726;

import java.util.ArrayList;

public class WorkShop {
	public static void main(String[] args) {
		LibraryService libScv = new LibraryService();
		libScv.add(new Member("user01", "박", "3333", "010-333"));
		libScv.add(new Member("user02", "김", "2222", "010-222"));
		libScv.add(new Member("user03", "홍", "1111", "010-111"));
		libScv.add(new Member("user02", "홍", "1111", "010-111"));
		
		libScv.add(new book(100, "자바기본", 20000, "한빛출판사", 3));
		libScv.add(new video(200, "자바강좌", 15000, "명량출판사", 3));
		libScv.add(new cd(300, "자바실습", 15000, "자바출판사", 3));
		libScv.add(new book(100, "자바기본", 20000, "한빛출판사", 3));
//		System.out.println(libScv);
		
		//회원검색
		ArrayList<Member> findArr = libScv.findMemberByName("홍");
		System.out.println(findArr);
		Member m = libScv.findMemberById("user01");
		System.out.println(m);
		
		LibType i = libScv.findItemByTitle("자바기본");
		System.out.println(i);
		
		libScv.rent( i.getLibNumber(), m.getId(), "20230726",13,7,1 );
		
		
	}
}
