package www.silver.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import www.silver.dao.IF_BoardDao;
import www.silver.vo.BoardVO;
import www.silver.vo.PageVO;

@Service
public class BoardServiceImpl implements IF_BoardService {
	@Inject
	IF_BoardDao boarddao;

	@Override
	public void addBoard(BoardVO boardvo) throws Exception {
		// TODO Auto-generated method stub
		if (boardvo.getViewmember() != null) {
			if (boardvo.getViewmember().equals("1")) {
				boardvo.setViewmember("공개");
			}
		} else {

			boardvo.setViewmember("비공개");
		}
		// 게시글을 kboard에 저장해라
		boarddao.insertBoard(boardvo);
		// 첨부파일이 있다는 뜻
		// 첨부파일이 있다면 첨부파일을 별도로 저장해라
		String[] fname = boardvo.getNewFileName();
		for (int i = 0; i < fname.length; i++) {
			// kboard_attach에 저장하는 코드
			if (fname[i] != null) {

				boarddao.insertAttach(fname[i]);
			}
		}
	}

	// dao > mapper > DB insert
	

	@Override
	public List<BoardVO> boardList(PageVO pagevo) throws Exception {
		// 처리하다가 DB작업이 필요
		return boarddao.selectAll(pagevo);
	}

	@Override
	public void deleteBoard(String delno) throws Exception {
		// TODO Auto-generated method stub
		boarddao.deleteBoard(delno);
	}

	@Override
	public BoardVO modBoard(String modno) throws Exception {
		// TODO Auto-generated method stub
		return boarddao.selectOne(modno);
	}

	@Override
	public void modBoard(BoardVO boardvo) throws Exception {
		// TODO Auto-generated method stub
		boarddao.updateBoard(boardvo);
	}

	@Override
	public int totalCountBoard() throws Exception {
		// TODO Auto-generated method stub
		return boarddao.cntBoard();
	}

	@Override
	public void insertAttach(String filename) throws Exception {
		// TODO Auto-generated method stub
		boarddao.insertAttach(filename);
	}

	@Override
	public BoardVO getBoard(String no) throws Exception {
		// TODO Auto-generated method stub
		return boarddao.selectOne(no);
	}

	@Override
	public List<String> getAttach(String no) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
