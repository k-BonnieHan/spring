package pack;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class TestController implements Controller{
	@Override 
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("TestController 수행");
		//모델과의 통신은 생략
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("say", "스프링 만세");
		modelAndView.setViewName("list");
		return modelAndView;
	}
}
