package day_0801.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import day_0801.dto.loginDto;
import day_0801.util.jdbcUtil;

public class loginDaoImpl implements loginDao {

	@Override
	public void add(loginDto l) throws SQLException, DuplicatedIdException {
		//DBMS연결과 
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			//등록여부검사
			if (findById(l.getMemberId()) != null)
				throw new DuplicatedIdException(l.getMemberId() + "는 사용중입니다.");
			
			con = jdbcUtil.connect();
			//3. SQL 작성
			String sql = "INSERT INTO LOGIN(member_id, login_date, login_time, logout_date, logout_time) ";
			sql += "VALUES(?, ?, ?, ?, ?)";
			//4. statement 생성
			pstmt = con.prepareStatement(sql);
			//5. 데이터 설정 
			pstmt.setString(1, l.getMemberId());
			pstmt.setString(2, l.getLogin_date());
			pstmt.setString(3, l.getLogin_time());
			pstmt.setString(4, l.getLogout_date());
			pstmt.setString(5, l.getLogout_time());
			//6. SQL 전송, 결과수신
			int count = pstmt.executeUpdate();
		} catch (ClassNotFoundException e) {
			throw new SQLException(e);		//내부에서 classNotFoundException이 발생했지만 이걸 최종적으로 SQLException으로 보냄
		} finally {
			//DBMS해제
			jdbcUtil.close(pstmt,con);
		}
	}

	@Override
	public void update(loginDto l) throws SQLException, RecordNotFoundException {
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			if (findById(l.getMemberId()) == null)
				throw new RecordNotFoundException(l.getMemberId() + "는 없습니다.");
			
			con = jdbcUtil.connect();
			//3. SQL 작성
			String sql = "UPDATE LOGIN set logout_date = ?, logout_time = ? ";
			sql += "WHERE member_id = ?";
			//4. statement 생성
			pstmt = con.prepareStatement(sql);
			//5. 데이터 설정 
			pstmt.setString(1, l.getMemberId());
			pstmt.setString(2, l.getLogout_date());
			pstmt.setString(3, l.getLogout_time());
			//6. SQL 전송, 결과수신
			int count = pstmt.executeUpdate();
		} catch (ClassNotFoundException e) {
			throw new SQLException(e);
		} finally {
			jdbcUtil.close(pstmt,con);
		}
	}

	@Override
	public void delete(String id) throws SQLException, RecordNotFoundException {
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			if (findById(id) == null)
				throw new RecordNotFoundException(id + "는 없습니다.");
			
			con = jdbcUtil.connect();
			//3. SQL 작성
			String sql = "DELETE LOGIN ";
			sql += "WHERE member_id = ?";
			//4. statement 생성
			pstmt = con.prepareStatement(sql);
			//5. 데이터 설정 
			pstmt.setString(1, id);
			//6. SQL 전송, 결과수신
			int count = pstmt.executeUpdate();
		} catch (ClassNotFoundException e) {
			throw new SQLException(e);
		} finally {
			jdbcUtil.close(pstmt,con);
		}
	}

	@Override
	public int count() throws SQLException {
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = jdbcUtil.connect();
			//3. SQL 작성
			String sql = "SELECT COUNT(*) FROM LOGIN ";
			//4. statement 생성
			pstmt = con.prepareStatement(sql);
			//5. 데이터 설정 
			//6. SQL 전송, 결과수신
			ResultSet rs = pstmt.executeQuery();
			rs.next();
			return rs.getInt(1);	//행 개수 반환
		} catch (ClassNotFoundException e) {
			throw new SQLException(e);
		} finally {
			jdbcUtil.close(pstmt,con);
		}
	}

	@Override
	public List<loginDto> list() throws SQLException {
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = jdbcUtil.connect();
			//3. SQL 작성
			String sql = "SELECT * FROM LOGIN ";
			//4. statement 생성
			pstmt = con.prepareStatement(sql);
			//5. 데이터 설정 
			//6. SQL 전송, 결과수신-
			//	DML 전송 : executeUpdate() : int
			//	SELECT전송 : executeQuery() : ResultSet
			ArrayList<loginDto> logList = new ArrayList<loginDto>();
			
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				String id = rs.getString("member_id");
				String login_date = rs.getString("login_date");
				String login_time = rs.getString("login_time");
				String logout_date = rs.getString("logout_date");
				String logout_time = rs.getString("logout_time");
				loginDto ld = new loginDto(id, login_date, login_time, logout_date, logout_time);
				logList.add(ld);
			}
			return logList;
		} catch (ClassNotFoundException e) {
			throw new SQLException(e);
		} finally {
			jdbcUtil.close(pstmt,con);
		}
	}

	@Override
	public loginDto findById(String id) throws SQLException {
		loginDto dto = null;
		//DBMS연결
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = jdbcUtil.connect();
			//3. SQL 작성
			String sql = "SELECT * FROM LOGIN WHERE member_id = ? ";
			//4. statement 생성
			pstmt = con.prepareStatement(sql);
			//5. 데이터 설정 
			pstmt.setString(1, id);
			//6. SQL 전송, 결과수신
			//	DML 전송 : executeUpdate() : int
			//	SELECT전송 : executeQuery() : ResultSet
			ResultSet rs = pstmt.executeQuery();
			if (rs.next()) {	//조회 결과가 있다
				String member_id = rs.getString("member_id");
				String login_date = rs.getString("login_date");
				String login_time = rs.getString("login_time");
				String logout_date = rs.getString("logout_date");
				String logout_time = rs.getString("logout_time");
				dto = new loginDto(member_id, login_date, login_time, logout_date, logout_time);
			}
		} catch (ClassNotFoundException e) {
			throw new SQLException(e);
		} finally {
			jdbcUtil.close(pstmt,con);
		}
		return dto;
	}

}
