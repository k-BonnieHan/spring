package pack.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pack.model.SangpumInter;

@Service
public class BusinessImpl implements BusinessInter{
	@Autowired
	private SangpumInter sangpumInter;
	
	public void dataList() {
		sangpumInter.selectList();
	}
}
