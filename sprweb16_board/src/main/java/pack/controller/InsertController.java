package pack.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import pack.model.BoardDaoInter;

@Controller
public class InsertController {
	@Autowired
	private BoardDaoInter inter;
	
	@RequestMapping(value="insert",method=RequestMethod.GET)
	public String abc(){
		return "insform";
	}
	
	@RequestMapping(value="insert",method=RequestMethod.POST)
	public String def(Model model, BoardBean bean){
		bean.setBdate();
		
		int newNum = inter.currentNum() + 1;
		
		bean.setNum(newNum);
		bean.setGnum(newNum);
		
		if(inter.insert(bean)) 
			return "redirect:/list?page=1";
		else 
			return "error";
	}
}
