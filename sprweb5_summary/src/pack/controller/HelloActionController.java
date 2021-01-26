package pack.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;
import org.springframework.web.servlet.mvc.Controller;

import pack.model.HelloModel;

/*
public class HelloActionController implements Controller{
	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
}
*/

public class HelloActionController extends AbstractController{
	private HelloModel helloModel;
	
	public void setHelloModel(HelloModel helloModel) {
		this.helloModel = helloModel;
	}
	
	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		// 모델과 통신
		String result = helloModel.getGreeting();
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("hello");  //forward (default)
		//modelAndView.setViewName("redirect:/views/hello.jsp");  //redirect
		modelAndView.addObject("result", result);
		
		return modelAndView;
	}
}








