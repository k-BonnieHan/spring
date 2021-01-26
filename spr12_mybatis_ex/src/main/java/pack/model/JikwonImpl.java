package pack.model;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.stereotype.Repository;

import pack.mybatis.SqlMapConfig;

@Repository
public class JikwonImpl implements JikwonInter{
	private SqlSessionFactory factory = SqlMapConfig.getSqlSession();
	
	//직원 자료
	public List<JikwonDto> selectList() {
		SqlSession session = factory.openSession();
		List<JikwonDto> list = null;
		
		try {
			list = session.selectList("selectDataAll");
		} catch (Exception e) {
			System.out.println("selectList err: " + e);
		} finally {
			if(session != null) session.close();
		}
		return list;
	}
	
	//부서별 인원수
	public List<JikwonDto> selectBuser() {
		SqlSession session = factory.openSession();
		List<JikwonDto> list = null;
		
		try {
			list = session.selectList("selectBuser");
		} catch (Exception e) {
			System.out.println("selectBuser err: " + e);
		} finally {
			if(session != null) session.close();
		}
		return list;
	}
	
	//부서별 최대 급여자
	public List<JikwonDto> selectMaxPay() {
		SqlSession session = factory.openSession();
		List<JikwonDto> list = null;
		
		try {
			list = session.selectList("selectMaxPay");
		} catch (Exception e) {
			System.out.println("selectMaxPay err: " + e);
		} finally {
			if(session != null) session.close();
		}
		return list;
	}
	
}
