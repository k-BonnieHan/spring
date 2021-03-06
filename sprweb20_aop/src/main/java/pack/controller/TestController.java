package pack.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import pack.model.MyModelInter;

@Controller
public class TestController {
	@Autowired
	@Qualifier("myModel")
	private MyModelInter modelInter;
	
	@RequestMapping("test")
	public ModelAndView abc() {
		String result1 = modelInter.processMsg();
		String result2 = modelInter.businessMsg();
		
		ModelAndView andView = new ModelAndView("list");
		andView.addObject("data1", result1);
		andView.addObject("data2", result2);
		
		return andView;
	}
}
