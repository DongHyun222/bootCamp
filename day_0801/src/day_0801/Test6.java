package day_0801;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Test6 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//1. Jdbc Driver 로딩, 교재909p
		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("Jdbc Driver 로딩 성공");
		String url = "jdbc:oracle:thin:@127.0.0.1:1521/XE";
		String user = "HR";
		String password = "HR";
		//2. DBMS 연결
		Connection conn = DriverManager.getConnection(url, user, password);
		System.out.println("DBMS 로그인 성공");
		//3. SQL 작성
		String sql = "SELECT member_id, login_date, login_time, logout_date, logout_time, "
				+ "M.name  FROM LOGIN L JOIN MEMBERS M ON (L.member_id = M.id) ";
		//4. statement 생성
		PreparedStatement pstmt = conn.prepareStatement(sql);
		//5. 데이터 설정 
		//6. SQL 전송, 결과수신-
		//	DML 전송 : executeUpdate() : int
		//	SELECT전송 : executeQuery() : ResultSet
		ArrayList<LoginDto> loginList = new ArrayList<LoginDto>();
		ResultSet rs = pstmt.executeQuery();
		while (rs.next()) {
			String id = rs.getString("member_id");
			String login_date = rs.getString("login_date");
			String login_time = rs.getString("login_time");
			String logout_date = rs.getString("logout_date");
			String logout_time = rs.getString("logout_time");
			String name = rs.getString("name");
			LoginDto md = new LoginDto(id, login_date, login_time, logout_date, logout_time,name);
			loginList.add(md);
		}
		//7. 자원반환
		pstmt.close();
		conn.close();
		for (LoginDto loginDto : loginList) {
			System.out.println(loginDto);
		}
//		System.out.println(loginList);
	}
}
