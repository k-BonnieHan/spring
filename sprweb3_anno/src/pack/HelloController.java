package pack;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	
	@RequestMapping("hello.do")
	public ModelAndView aaa(){
		System.out.println("HelloController 수행");
		
		ModelAndView modelAndView = new ModelAndView("view1");
		modelAndView.addObject("message", "안녕 반가워 - anno");
		return modelAndView;
	}
}
