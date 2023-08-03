package day_0802;
/** 게시판 기능을 제공 */

import java.util.List;

import day_0802.dao.RecordNotFoundException;
import day_0802.vo.BoardDto;

public interface BoardService {
	//게시물 수정
	public boolean add(BoardDto dto) throws BoardException;
	//게시물 목록
	public List<BoardDto> list() throws BoardException;	//보드 접근하는데 있어서 서버오류발생시
	//게시물 상세보기
	public BoardDto read(int no) throws BoardException, RecordNotFoundException;
	//게시물 수정
	public boolean update(BoardDto dto) throws BoardException, RecordNotFoundException;
	//게시물 삭제
	public boolean delete(int no) throws BoardException, RecordNotFoundException;
	//게시물 갯수
	public int count() throws BoardException;
}
