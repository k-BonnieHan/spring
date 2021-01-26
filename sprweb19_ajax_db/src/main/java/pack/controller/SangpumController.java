package pack.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pack.model.DataDao;
import pack.model.SangpumDto;

@Controller
public class SangpumController {
	@Autowired
	private DataDao dataDao;
	
	@RequestMapping("sangpum")
	@ResponseBody
	public Map<String, Object> abc(){
		List<Map<String, String>> dataList = new ArrayList<Map<String, String>>();
		
		Map<String, String> data = null;
		List<SangpumDto> sangList = dataDao.sangList();
		
		for (SangpumDto s:sangList) {
			data = new HashMap<String, String>();
			data.put("code", s.getCode());
			data.put("sang", s.getSang());
			data.put("su", s.getSu());
			data.put("dan", s.getDan());
			dataList.add(data);
		}
		
		Map<String, Object> sangpumDatas = new HashMap<String, Object>();
		sangpumDatas.put("datas", dataList);
		return sangpumDatas;
	}
}




