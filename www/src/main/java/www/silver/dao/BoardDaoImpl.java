package www.silver.dao;

import java.util.HashMap;
import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import www.silver.vo.BoardVO;
import www.silver.vo.Pagevo;

@Repository
public class BoardDaoImpl implements IF_BoardDao{
	@Inject
	SqlSession sqlsession;
	final String mapperQuery="www.silver.dao.IF_BoardDao";
	
	@Override
	public void insertBoard(BoardVO boardvo) throws Exception {
		// TODO Auto-generated method stub
		//sqlsession을 통해서 mapper와 매핑해야 하기에 정보를 넘겨준다.
		System.out.println("insert board");
		sqlsession.insert(mapperQuery+".inin", boardvo);
	
	}

	@Override
	public List<BoardVO> selectAll(Pagevo pagevo) throws Exception {
		// TODO Auto-generated method stub
		return sqlsession.selectList(mapperQuery+".selectall",pagevo);
	}

	@Override
	public void deleteBoard(String delno) throws Exception {
		// TODO Auto-generated method stub
		sqlsession.delete(mapperQuery+".delone", delno);
	}

	@Override
	public BoardVO selectOne(String title) throws Exception {
		// TODO Auto-generated method stub
//		HashMap aa = new HashMap<String, String>();
//		aa.put("tt", title);
//		aa.put("dd", date);
		return sqlsession.selectOne(mapperQuery+".selectTitle", title);
	}

	@Override
	public void updateBoard(BoardVO boardvo) throws Exception {
		// TODO Auto-generated method stub
		System.out.println(boardvo.getNum());
		sqlsession.update(mapperQuery+".update", boardvo);
	}

	@Override
	public int cntBoard() throws Exception {
		// TODO Auto-generated method stub
		return sqlsession.selectOne(mapperQuery+".allcnt");
	}

	@Override
	public void insertAttach(String fname) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("attach insert");
		sqlsession.insert(mapperQuery+".insertattach", fname);
	}

	@Override
	public List<String> selectAllAttach(String no) throws Exception {
		// TODO Auto-generated method stub
		return sqlsession.selectList(mapperQuery+".selectattach", no);
	}

	

}
