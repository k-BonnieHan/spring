package pack;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping({"world.do", "nice.do", "go*"})
public class WorldController{
	
	@RequestMapping(method=RequestMethod.GET)
	public ModelAndView bbb() {
		System.out.println("WorldController 수행");
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("view2");
		modelAndView.addObject("message", "스프링으로 처리 - anno - get");
		return modelAndView;
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public ModelAndView ccc() {
		System.out.println("WorldController 수행");
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("view2");
		modelAndView.addObject("message", "스프링으로 처리 - anno - post");
		return modelAndView;
	}
}
