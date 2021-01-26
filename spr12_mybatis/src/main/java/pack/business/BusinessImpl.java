package pack.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pack.model.SangpumDto;
import pack.model.SangpumInter;

@Service
public class BusinessImpl implements BusinessInter{
	@Autowired
	private SangpumInter sangpumInter;
	
	public void dataList() {
		List<SangpumDto> list = sangpumInter.selectList();
		
		for(SangpumDto s:list) {
			System.out.println(s.getCode() + " " + 
					s.getSang() + " " + 
					s.getSu() + " " + 
					s.getDan());
		}
	}
}
