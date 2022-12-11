package com.example.board;

import com.example.board.BoardVO;
import org.apache.ibatis.jdbc.SQL;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BoardDAO {

	@Autowired
	SqlSession sqlSession;

	public int insertBoard(BoardVO vo) {
		int count = sqlSession.insert("Board.insertBoard", vo);
		return count;
	}

	public int updateBoard(BoardVO vo) {
		int result = sqlSession.insert("Board.updateBoard", vo);
		return result;
	}

	public int deleteBoard(int id) {
		int de = sqlSession.delete("Board.deleteBoard", id);
		return de;
	}

	public BoardVO getBoard(int seq){
		BoardVO one = sqlSession.selectOne("Board.getBoard", seq);
		return one;
	}
	public List<BoardVO> getBoardList(){
		List<BoardVO> list = sqlSession.selectList("Board.getBoardList");
		return list;
	}


}
