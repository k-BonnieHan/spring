package aa.bb.good;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


//방법1 : 전통적 방법
/*
@Controller
public class LoginController {
	@RequestMapping(value="login", method = RequestMethod.GET)
	public ModelAndView submit(HttpServletRequest request) {
		String id = request.getParameter("id");
		String pwd = request.getParameter("pwd");
		
		String data = "";
		if(id.equals("aa") && pwd.equals("11"))
			data = "와우 성공";
		else
			data = "ㅠㅠ 실패";
		
		ModelAndView view = new ModelAndView("list");
		view.addObject("data", data);
		return view;
	}
}
*/

//방법2 : spring 방법
@Controller
@RequestMapping("login")
public class LoginController {
	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView submit(
			@RequestParam(value="id") String id,
			@RequestParam("pwd") String pwd) {
		
		String data = "";
		if(id.equals("aa") && pwd.equals("11"))
			data = "아자 성공";
		else
			data = "ㅠㅠㅠ 실패";
		
		ModelAndView view = new ModelAndView("list");
		view.addObject("data", data);
		return view;
	}
}


