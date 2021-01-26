package pack.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import pack.model.HelloModel;

@Controller
//@RequestMapping("/hello.do") 
@RequestMapping({"/hello.do", "hell*", "kbs/world.do","hi","mbc","sbs"})
public class HelloController {
	@Autowired
	private HelloModel helloModel;
	
	/*
	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView abc() {
		String result = helloModel.getGreeting();  //모델과 통신
		
		ModelAndView modelAndView = new ModelAndView("hello");
		modelAndView.addObject("result", result);
		
		return modelAndView;
	}
	*/
	
	/*
	@RequestMapping(method = RequestMethod.GET)
	public Model abc(Model model) {
		String result = helloModel.getGreeting();  //모델과 통신
		
		model.addAttribute("result", result);
		return model;
	}
	*/
	
	@RequestMapping(method = RequestMethod.GET)
	public Map<String, Object> abc() {
		String result = helloModel.getGreeting();  //모델과 통신
		
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("result", result);
		
		return map;
	}
	
}
