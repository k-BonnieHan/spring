package pack.model;

import java.util.ArrayList;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import pack.controller.BoardBean;

@Repository
public class BoardDaoImpl extends SqlSessionDaoSupport implements BoardDaoInter{
	@Autowired
	public BoardDaoImpl(SqlSessionFactory factory) {
		setSqlSessionFactory(factory);
	}
	
	public ArrayList<BoardDto> getList(){
		return (ArrayList)getSqlSession().selectList("selectList");
	}
	
	@Override
	public ArrayList<BoardDto> getSearch(BoardBean bean) {
		return (ArrayList)getSqlSession().selectList("searchList", bean);
	}
	
	@Override
	public boolean insert(BoardBean bean) {
		int re = getSqlSession().insert("insertData", bean);
		if(re > 0)
			return true;
		else
			return false;
	}
	
	@Override
	public BoardDto getDetail(String num) {
		return getSqlSession().selectOne("selectOne", num);
	}
	
	@Override
	public boolean update(BoardBean bean) {
		int re = getSqlSession().update("updateData", bean);
		if(re > 0)
			return true;
		else
			return false;
	}
	
	@Override
	public boolean delete(String num) {
		int re = getSqlSession().delete("deleteData", num);
		if(re > 0)
			return true;
		else
			return false;
	}
	
	@Override
	public int currentNum() {
		// 가장 큰 번호
		if(getSqlSession().selectOne("currentNum") == null) return 0;
		return getSqlSession().selectOne("currentNum");
	}
	
	@Override
	public int totalCnt() {
		return getSqlSession().selectOne("totalCnt");
	}
	
	@Override
	public boolean updateReadcnt(String num) { //조회수 증가
		int re = getSqlSession().update("updateReadcnt", num);
		if(re > 0)
			return true;
		else
			return false;
	}
	
	@Override
	public String selectPass(String num) {
		// 수정용
		return getSqlSession().selectOne("selectPass", num);
	}
	
	@Override
	public boolean updateOnum(BoardBean bean) {
		// 댓글용
		int re = getSqlSession().update("updateOnum", bean);
		if(re > 0)
			return true;
		else
			return false;
	}
	
	@Override
	public boolean insertReply(BoardBean bean) {
		// 댓글 등록
		int re = getSqlSession().insert("insertReData", bean);
		if(re > 0)
			return true;
		else
			return false;
	}
}