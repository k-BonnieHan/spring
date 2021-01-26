package pack.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import pack.model.JikwonInter;

@Controller
public class ListController {
	@Autowired
	@Qualifier("jikwonImpl")
	private JikwonInter jikwonInter;
	
	@RequestMapping("list")
	public Model abc(Model model, JikwonBean bean) {
		model.addAttribute("datas", jikwonInter.list());
		model.addAttribute("data", jikwonInter.dto(bean));
		return model;
	}
		
}
