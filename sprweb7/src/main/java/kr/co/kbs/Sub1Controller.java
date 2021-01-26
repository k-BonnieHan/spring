package kr.co.kbs;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Sub1Controller {
	
	@RequestMapping(value="sub1", method = RequestMethod.GET)
	public ModelAndView abcd() {
		String msg = "서브1로 호출";
		
		return new ModelAndView("sub1show", "msg", msg);
	}
}
