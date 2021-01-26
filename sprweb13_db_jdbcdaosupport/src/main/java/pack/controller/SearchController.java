package pack.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import pack.model.JikwonInter;

@Controller
public class SearchController {
	
	@Autowired
	private JikwonInter jikwonInter;
	
	@RequestMapping("search")
	public ModelAndView searchProcess(BuserBean bean) {
		ModelAndView modelAndView = new ModelAndView();
		
		modelAndView.addObject("info",jikwonInter.bdto(bean));
		modelAndView.addObject("datas",jikwonInter.list());
		modelAndView.addObject("data",jikwonInter.dto());
		modelAndView.setViewName("list");
		
		return modelAndView;
	}


}
