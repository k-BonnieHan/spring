package aa.bb.xml;

import java.util.Arrays;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class XmlController {
	@RequestMapping(value = "member_xml", method = RequestMethod.GET)
	public String formBack() {
		return "myform";
	}
	
	@RequestMapping(value = "member_xml", method = RequestMethod.POST)
	@ResponseBody
	public XmlMesssageList submit(@RequestParam("name") String name,
			@RequestParam("age") String age) {
		//return name + age;
		return getXml(name, age);
	}
	
	public XmlMesssageList getXml(String name, String age) {
		List<XmlMessage> messages = Arrays.asList(
			new XmlMessage(name, age),
			new XmlMessage("john", "33"),
			new XmlMessage("신기해", "32")
		);
		
		return new XmlMesssageList(messages);
	}
}
