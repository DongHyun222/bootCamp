package day_0801.dao;

import java.sql.SQLException;
import java.util.List;

import day_0801.dto.MemberDto;

public class MembersDaoImplExam {
	public static void main(String[] args) {
		add();
		count();
//		update();
//		delete();
//		find();
		list();
	
	}
	private static void add() {
		MembersDao membersDao = new MembersDaoImpl();
		try {
			membersDao.add(new MemberDto("user07", "유저7", "777", "Y"));
			System.out.println("등록성공");
		} catch (SQLException e) {
			System.out.println("SQL오류발생");
		} catch (DuplicatedIdException e) {
			System.out.println("ID가 중복됩니다.");
		}
	}
	private static void update() {
		MembersDao membersDao = new MembersDaoImpl();
		try {
			membersDao.update(new MemberDto("user07", "유저7", "123", "Y"));
			System.out.println("수정완료");
		} catch (SQLException e) {
			System.out.println("SQL오류발생");
		} catch (RecordNotFoundException e) {
			System.out.println("데이터가 없습니다.");
		}
	}
	private static void delete() {
		MembersDao membersDao = new MembersDaoImpl();
		try {
			membersDao.delete("user02");
			System.out.println("삭제완료");
		} catch (SQLException e) {
			System.out.println("SQL오류발생");
		} catch (RecordNotFoundException e) {
			System.out.println("데이터가 없습니다.");
		}
	}
	private static void count() {
		MembersDao membersDao = new MembersDaoImpl();
		try {
			int count = membersDao.count();
			System.out.println("등록갯수 : " + count);
		} catch (SQLException e) {
			System.out.println("SQL오류발생");
		}
	}
	private static void find() {
		MembersDao membersDao = new MembersDaoImpl();
		try {
			MemberDto findById = membersDao.findById("user03");
			System.out.println(findById);
		} catch (SQLException e) {
			System.out.println("SQL오류발생");
		}
	}
	private static void list() {
		MembersDao membersDao = new MembersDaoImpl();
		try {
			List<MemberDto> list = membersDao.list();
			for (MemberDto memberDto : list) {
				System.out.println(memberDto);
			}
		} catch (SQLException e) {
			System.out.println("SQL오류발생");
		}
	}
}
