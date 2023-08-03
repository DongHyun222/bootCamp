package day_0801.dao;

import java.sql.SQLException;
import java.util.List;

import day_0801.dto.MemberDto;
import day_0801.dto.loginDto;

public class loginDaoImplExam {
	public static void main(String[] args) {
//		add();
//		count();
//		update();
//		delete();
//		find();
		list();
	}
	
	private static void add() {
		loginDao ldo = new loginDaoImpl();
		
		try {
			ldo.add(new loginDto("user07", "20230701", "1230", null, null));
			System.out.println("등록성공");
		} catch (SQLException e) {
			System.out.println("SQL오류발생");
			e.printStackTrace();
		} catch (DuplicatedIdException e) {
			System.out.println("ID가 중복됩니다.");
		}
	}
	private static void update() {
		loginDao ldo = new loginDaoImpl();
		try {
			ldo.update(new loginDto("user07", null, null, "20230702", "1450"));
			System.out.println("수정완료");
		} catch (SQLException e) {
			System.out.println("SQL오류발생");
		} catch (RecordNotFoundException e) {
			System.out.println("데이터가 없습니다.");
		}
	}
	private static void delete() {
		loginDao ldo = new loginDaoImpl();
		try {
			ldo.delete("user07");
			System.out.println("삭제완료");
		} catch (SQLException e) {
			System.out.println("SQL오류발생");
		} catch (RecordNotFoundException e) {
			System.out.println("데이터가 없습니다.");
		}
	}
	private static void count() {
		loginDao ldo = new loginDaoImpl();
		try {
			int count = ldo.count();
			System.out.println("등록갯수 : " + count);
		} catch (SQLException e) {
			System.out.println("SQL오류발생");
		}
	}
	private static void find() {
		loginDao ldo = new loginDaoImpl();
		try {
			loginDto findById = ldo.findById("user03");
			System.out.println(findById);
		} catch (SQLException e) {
			System.out.println("SQL오류발생");
		}
	}
	private static void list() {
		loginDao ldo = new loginDaoImpl();
		try {
			List<loginDto> list = ldo.list();
			for (loginDto loginDto : list) {
				System.out.println(loginDto);
			}
		} catch (SQLException e) {
			System.out.println("SQL오류발생");
		}
	}
}
