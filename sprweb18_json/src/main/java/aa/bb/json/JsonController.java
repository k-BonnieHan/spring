package aa.bb.json;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("list")
public class JsonController {
	@Autowired
	private MyData myData;
	
	@RequestMapping(method = RequestMethod.GET)
	@ResponseBody
	public MyData getJson(@RequestParam("name")String name) {
		myData.setName(name);
		myData.setSkills(new String[] {"자바 개발자","웹 개발자"});
		
		return myData;
	}
}




