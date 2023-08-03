package day_0801.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
/** DB연결 */
public class jdbcUtil {
	public static Connection connect() throws ClassNotFoundException, SQLException {
		//1. Jdbc Driver 로딩, 교재909p
		Class.forName("oracle.jdbc.driver.OracleDriver");
		String url = "jdbc:oracle:thin:@127.0.0.1:1521/XE";
		String user = "HR";
		String password = "HR";
		//2. DBMS 연결
		return DriverManager.getConnection(url, user, password);
	}

	public static void close(PreparedStatement pstmt, Connection con) {
			try {
				if (pstmt != null) pstmt.close();
			} catch (SQLException e) {}
			try {
				if (con != null) con.close();
			} catch (SQLException e) {}
	}
}
