package pack.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import pack.model.BoardDto;
import pack.model.BoardDaoImpl;
import pack.model.BoardDaoInter;

@Controller
public class DetailController {
	@Autowired
	private BoardDaoInter inter;
	
	@RequestMapping("detail")
	public Model detail(
			Model model, 
			@RequestParam("num") String num,
			@RequestParam("page") String page){
		inter.updateReadcnt(num);
		model.addAttribute("data", inter.getDetail(num));
		model.addAttribute("page", page);
		
		return model;
	}
}
