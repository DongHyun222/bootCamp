package day_0802.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import day_0802.dao.DuplicatedIdException;
import day_0801.util.jdbcUtil;
import day_0802.vo.BoardDto;

/** SQL처리(DB로 보냄) */ 
public class BoardDaoImpl implements BoardDao {

	@Override
	public void add(BoardDto dto) throws SQLException, DuplicatedIdException {
		//DBMS연결과 
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = jdbcUtil.connect();
			//3. SQL 작성
			String sql = "INSERT INTO BOARD(NO, WRITER, TITLE, CONTENT, REGDATE) ";
			sql += "VALUES(BOARD_SEQ.NEXTVAL, ?, ?, ?, SYSDATE)";
			//4. statement 생성
			pstmt = con.prepareStatement(sql);
			//5. 데이터 설정 
			pstmt.setString(1, dto.getWriter());
			pstmt.setString(2, dto.getTitle());
			pstmt.setString(3, dto.getContent());
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
	public void update(BoardDto dto) throws SQLException, RecordNotFoundException {
		//DBMS연결
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			//등록여부검사
			if( findById(dto.getNo()) == null )
				throw new RecordNotFoundException(dto.getNo()+"는 없습니다");

			con = jdbcUtil.connect();
			// 3. SQL 작성
			String sql = "UPDATE BOARD set title=?, writer=?, content = ?";
			sql += "WHERE no = ?";
			// 4. Statement 생성
			pstmt = con.prepareStatement(sql);
			// 5. 데이터 설정
			pstmt.setString(1, dto.getTitle());
			pstmt.setString(2, dto.getWriter());
			pstmt.setString(3, dto.getContent());
			pstmt.setInt(4, dto.getNo());
			// 6. SQL 전송, 결과수신
			int count = pstmt.executeUpdate();
		} catch (ClassNotFoundException e) {
			throw new SQLException(e);
		} finally {
			jdbcUtil.close(pstmt, con);
		}	
	}

	@Override
	public void delete(int no) throws SQLException, RecordNotFoundException {
		//DBMS연결과 
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = jdbcUtil.connect();
			//3. SQL 작성
			String sql = "DELETE BOARD ";
			sql += "WHERE NO = ?";
			//4. statement 생성
			pstmt = con.prepareStatement(sql);
			//5. 데이터 설정 
			pstmt.setLong(1, no);
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
	public int count() throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<BoardDto> list() throws SQLException {
		//DBMS연결
		List<BoardDto> result = new ArrayList<BoardDto>();
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = jdbcUtil.connect();
			//3. SQL 작성
			String sql = "SELECT * FROM BOARD order by no DESC ";
			//4. statement 생성
			pstmt = con.prepareStatement(sql);
			//5. 데이터 설정 
			//6. SQL 전송, 결과수신-
			//	DML 전송 : executeUpdate() : int
			//	SELECT전송 : executeQuery() : ResultSet
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				int no = rs.getInt("no");
				String title = rs.getString("title");
				String writer = rs.getString("writer");
				Date regdate = rs.getDate("regdate");
				String content = rs.getString("content");
				BoardDto dto = new BoardDto(no, title, writer, regdate, content);
				result.add(dto);
			}
		} catch (ClassNotFoundException e) {
			throw new SQLException(e);
		} finally {
			jdbcUtil.close(pstmt,con);
		}
		return result;
	}

	@Override
	public BoardDto findById(int no) throws SQLException {
		BoardDto dto = null;
		//DBMS연결
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = jdbcUtil.connect();
			//3. SQL 작성
			String sql = "SELECT * FROM BOARD WHERE NO = ? ";
			//4. statement 생성
			pstmt = con.prepareStatement(sql);
			//5. 데이터 설정 
			pstmt.setLong(1, no);
			//6. SQL 전송, 결과수신
			//	DML 전송 : executeUpdate() : int
			//	SELECT전송 : executeQuery() : ResultSet
			ResultSet rs = pstmt.executeQuery();
			if (rs.next()) {	//조회 결과가 있다
				int nno = rs.getInt("no");
				String title = rs.getString("title");
				String writer = rs.getString("writer");
				Date regdate = rs.getDate("regdate");
				String content = rs.getString("content");
				dto = new BoardDto(nno, title, writer, regdate, content);
			}
		} catch (ClassNotFoundException e) {
			throw new SQLException(e);
		} finally {
			jdbcUtil.close(pstmt,con);
		}
		return dto;
	}

}
