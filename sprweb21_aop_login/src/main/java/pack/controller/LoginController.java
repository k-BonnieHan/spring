package pack.controller;

import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import pack.model.JikwonDto;
import pack.model.JikwonInter;

@Controller
public class LoginController {
	@Autowired
	private JikwonInter jikwonInter;
	
	@RequestMapping(value="login", method = RequestMethod.GET)
	public String goLogin() {
		return "login";
	}
	
	@RequestMapping(value="login", method = RequestMethod.POST)
	public String submitLogin(HttpSession session,
			@RequestParam("no")String no,
			@RequestParam("name")String name) {
		JikwonDto dto = jikwonInter.getLoginInfo(no);
		if(dto != null) {
			String retName = dto.getJikwon_name();
			if(retName.equals(name)) {
				session.setAttribute("name", name);
				return "redirect:/jikwonlist";
			}else {
				return "login";
			}
		}else {
			return "login";
		}
	}
	
}
