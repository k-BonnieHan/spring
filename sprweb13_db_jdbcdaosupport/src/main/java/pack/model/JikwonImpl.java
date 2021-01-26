package pack.model;

import java.util.List;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import pack.controller.BuserBean;
import pack.controller.JikwonBean;

@Repository
public class JikwonImpl extends SqlSessionDaoSupport implements JikwonInter {

	@Autowired
	public JikwonImpl(SqlSessionFactory factory) {
		setSqlSessionFactory(factory);
	}
	
	@Override
	public List<JikwonDto> list() throws DataAccessException {
		return getSqlSession().selectList("selectJikwon");
	}
	
	 @Override
	public List<JikwonDto> jlist(JikwonBean bean) throws DataAccessException {
		 return getSqlSession().selectList("selJikwon", bean);
	}
	
	@Override
	public JikwonDto dto() throws DataAccessException {
		return getSqlSession().selectOne("countJikwon");
	}
	
	@Override
	public BuserDto bdto(BuserBean bean) throws DataAccessException {
		return getSqlSession().selectOne("selectBuser", bean);
	}
	
}
