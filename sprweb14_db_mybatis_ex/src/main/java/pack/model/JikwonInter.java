package pack.model;

import java.util.List;

import org.springframework.dao.DataAccessException;

import pack.controller.BuserBean;
import pack.controller.JikwonBean;

public interface JikwonInter {
	List<JikwonDto> list() throws DataAccessException;
	
	List<JikwonDto> jlist(JikwonBean bean) throws DataAccessException;
	
	JikwonDto dto(JikwonBean bean) throws DataAccessException;
	
	BuserDto bdto(BuserBean bean) throws DataAccessException;
}
