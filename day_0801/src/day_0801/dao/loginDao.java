package day_0801.dao;

import java.sql.SQLException;
import java.util.List;

import day_0801.dto.loginDto;

public interface loginDao {
	//등록
	  public void add(loginDto l) throws SQLException, DuplicatedIdException;
	  //수정
	  public void update(loginDto l) throws SQLException, RecordNotFoundException;
	  //삭제
	  public void delete(String id) throws SQLException, RecordNotFoundException;
	  //갯수
	  public int count() throws SQLException;
	  //목록
	  public List<loginDto> list() throws SQLException;
	  //검색
	  public loginDto findById(String id) throws SQLException;
}
