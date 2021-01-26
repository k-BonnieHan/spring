package kr.co.kbs;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Sub2Controller {
	@RequestMapping(value = "/sub2", method = RequestMethod.GET)
	public ModelAndView def(HttpServletRequest request) {
		String para = request.getParameter("irum");
		
		if(para.equalsIgnoreCase("oscar")) {
			String ss = para + " 서브2 처리";
			return new ModelAndView("sub2show", "msg", ss);
		}else {
			return new ModelAndView("redirect:resources/index.html");
		}
	}
}
