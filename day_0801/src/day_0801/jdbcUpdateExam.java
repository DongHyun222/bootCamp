package day_0801;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class jdbcUpdateExam {
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
		String sql = "UPDATE MEMBERS set status = ?";
		sql += "WHERE id = ?";
		//4. statement 생성
		PreparedStatement pstmt = conn.prepareStatement(sql);
		//5. 데이터 설정 
		pstmt.setString(1, "Y");
		pstmt.setString(2, "user02");
		//6. SQL 전송, 결과수신
		//	DML 전송 : executeUpdate() : int
		//	SELECT전송 : executeQuery() : ResultSet
		int count = pstmt.executeUpdate();
		System.out.println(count + "행 수정완료");
		//7. 자원반환
		pstmt.close();
		conn.close();
	}
}
