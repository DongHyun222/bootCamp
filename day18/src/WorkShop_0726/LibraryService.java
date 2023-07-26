package WorkShop_0726;

import java.util.ArrayList;

public class LibraryService {
	private ArrayList<LibType> libs = new ArrayList<LibType>();
	private ArrayList<Member> mems = new ArrayList<Member>();
	private ArrayList<rental> rentals = new ArrayList<rental>();
	
	public void add(LibType lib) {
		for (LibType l : libs) {
			if (lib.getLibName() == l.getLibName()) {
				lib.setLibCount(+lib.getLibCount());
				return;
			}
		}
		libs.add(lib);
	}
	
	public void add(Member m) {
		try {
			login(m.getId());
			mems.add(m);
		} catch (회원아이디중복Exception e) {
			System.out.println(e.getMessage());
		}
	}
	private void login(String id) throws 회원아이디중복Exception {
		for (Member member : mems) {
			if (member.getId() == id)
				throw new 회원아이디중복Exception(id + "이미 등록된 아이디입니다.");
		}
	}
	
	public void add(rental r) {
		rentals.add(r);
	}
	
	public ArrayList<Member> findMemberByName(String s){
		ArrayList<Member> arr = new ArrayList<Member>();
		for (Member member : mems) {
			if (member.getName() == s) {
				arr.add(member);
			}
		}
		return arr;
	}
	
	public Member findMemberById(String id) {
		for (Member member : mems) {
			if (id == member.getId())
				return member;
		}
		return null;
	}
	

	public LibType findItemByTitle(String string) {
		for (LibType libType : libs) {
			if (libType.getLibName() == string) {
				return libType;
			}
		}
		return null;
	}

	public void rent(int libNumber, String id, String startDate, int startHour, int startMinute, int LibCount) 
			throws {
		
	}
}
