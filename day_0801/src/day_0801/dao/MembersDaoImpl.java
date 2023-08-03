package day_0801.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import day_0801.dto.MemberDto;
import day_0801.util.jdbcUtil;

public class MembersDaoImpl implements MembersDao {

	@Override		//메서드 오버라이딩할때 예외는 부모보다 갯수가 같거나 작아야한다. 예외타입은 부모보다 같거나 자식타입이여야함
	public void add(MemberDto m) throws SQLException, DuplicatedIdException {
		//DBMS연결과 
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			//등록여부검사
			if (findById(m.getId()) != null)
				throw new DuplicatedIdException(m.getId() + "는 사용중입니다.");
			
			con = jdbcUtil.connect();
			//3. SQL 작성
			String sql = "INSERT INTO MEMBERS(id, name, passwd, status)";
			sql += "VALUES(?, ?, ?, ?)";
			//4. statement 생성
			pstmt = con.prepareStatement(sql);
			//5. 데이터 설정 
			pstmt.setString(1, m.getId());
			pstmt.setString(2, m.getName());
			pstmt.setString(3, m.getPasswd());
			pstmt.setString(4, m.getStatus());
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
	public void update(MemberDto m) throws SQLException, RecordNotFoundException {
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			if (findById(m.getId()) == null)
				throw new RecordNotFoundException(m.getId() + "는 없습니다.");
			
			con = jdbcUtil.connect();
			//3. SQL 작성
			String sql = "UPDATE MEMBERS set name = ?, passwd = ?, status = ? ";
			sql += "WHERE id = ?";
			//4. statement 생성
			pstmt = con.prepareStatement(sql);
			//5. 데이터 설정 
			pstmt.setString(1, m.getName());
			pstmt.setString(2, m.getPasswd());
			pstmt.setString(3, m.getStatus());
			pstmt.setString(4, m.getId());
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
		//DBMS연결과 
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			if (findById(id) == null)
				throw new RecordNotFoundException(id + "는 없습니다.");
			
			con = jdbcUtil.connect();
			//3. SQL 작성
			String sql = "DELETE MEMBERS ";
			sql += "WHERE id = ?";
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
		//DBMS연결
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = jdbcUtil.connect();
			//3. SQL 작성
			String sql = "SELECT COUNT(*) FROM MEMBERS ";
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
	public List<MemberDto> list() throws SQLException {
		//DBMS연결
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = jdbcUtil.connect();
			//3. SQL 작성
			String sql = "SELECT * FROM MEMBERS ";
			//4. statement 생성
			pstmt = con.prepareStatement(sql);
			//5. 데이터 설정 
			//6. SQL 전송, 결과수신-
			//	DML 전송 : executeUpdate() : int
			//	SELECT전송 : executeQuery() : ResultSet
			ArrayList<MemberDto> memList = new ArrayList<MemberDto>();
			
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				String id = rs.getString("id");
				String name = rs.getString("name");
				String passwd = rs.getString("passwd");
				String status = rs.getString("status");
				MemberDto md = new MemberDto(id, name, passwd, status);
				memList.add(md);
			}
			return memList;
		} catch (ClassNotFoundException e) {
			throw new SQLException(e);
		} finally {
			jdbcUtil.close(pstmt,con);
		}
	}

	@Override
	public MemberDto findById(String id) throws SQLException {
		MemberDto dto = null;
		//DBMS연결
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = jdbcUtil.connect();
			//3. SQL 작성
			String sql = "SELECT * FROM MEMBERS WHERE id = ? ";
			//4. statement 생성
			pstmt = con.prepareStatement(sql);
			//5. 데이터 설정 
			pstmt.setString(1, id);
			//6. SQL 전송, 결과수신
			//	DML 전송 : executeUpdate() : int
			//	SELECT전송 : executeQuery() : ResultSet
			ResultSet rs = pstmt.executeQuery();
			if (rs.next()) {	//조회 결과가 있다
				String iid = rs.getString("id");
				String name = rs.getString("name");
				String passwd = rs.getString("passwd");
				String status = rs.getString("status");
				dto = new MemberDto(iid, name, passwd, status);
			}
		} catch (ClassNotFoundException e) {
			throw new SQLException(e);
		} finally {
			jdbcUtil.close(pstmt,con);
		}
		return dto;
	}

}
