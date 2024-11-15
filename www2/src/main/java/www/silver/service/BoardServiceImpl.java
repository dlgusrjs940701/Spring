package www.silver.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import www.silver.dao.IF_BoardDao;
import www.silver.vo.BoardVO;

@Service
public class BoardServiceImpl implements IF_BoardService {
	
	@Inject
	IF_BoardDao boarddao;

	@Override
	public void addBoard(BoardVO boardvo) throws Exception {
		// TODO Auto-generated method stub
		
		boarddao.insertBoard(boardvo);
		// dao > mapper > DB insert
	}

	@Override
	public List<BoardVO> boardList() throws Exception {
		// 처리하다가 DB작업이 필요
		return boarddao.selectAll();
	}

	@Override
	public void deleteBoard(String delno) throws Exception {
		// TODO Auto-generated method stub
		boarddao.deleteBoard(delno);
	}

}
