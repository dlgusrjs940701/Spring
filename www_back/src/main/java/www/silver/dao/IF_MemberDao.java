package www.silver.dao;

import www.silver.vo.MemberVO;

public interface IF_MemberDao {
	// DB 작업을 메서드로 정의한다.
	public void insertOne(MemberVO membervo) throws Exception;
}
