package pack.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import pack.model.SangpumModel;

@Controller
public class SangpumController {
	@Autowired
	private SangpumModel sangpumModel;
	
	@RequestMapping(value = "sangpum", method = RequestMethod.POST)
	//public ModelAndView submit(SangpumBean bean) {
	public ModelAndView submit(@ModelAttribute("my") SangpumBean bean) {
		ModelAndView view = new ModelAndView();
		view.setViewName("list");
		view.addObject("data", sangpumModel.compute(bean));
		return view;
	}
	
	@ModelAttribute("myList")
	public List<String> aaa(){
		List<String> list = new ArrayList<String>();
		list.add("홍길동");
		list.add("신기해");
		return list;
	}
}
