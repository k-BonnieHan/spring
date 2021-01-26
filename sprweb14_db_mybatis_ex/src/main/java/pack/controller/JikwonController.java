package pack.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import pack.model.JikwonInter;

@Controller
public class JikwonController {
	
	@Autowired
	private JikwonInter jikwonInter;
	
	@RequestMapping("jikwon")
	public ModelAndView searchProcess(JikwonBean jbean, BuserBean bbean) {
		ModelAndView modelAndView = new ModelAndView();
		
		modelAndView.addObject("info",jikwonInter.bdto(bbean));
		modelAndView.addObject("datas",jikwonInter.jlist(jbean));
		modelAndView.addObject("data",jikwonInter.dto(jbean));
		modelAndView.setViewName("list");
		
		return modelAndView;
	}


}
