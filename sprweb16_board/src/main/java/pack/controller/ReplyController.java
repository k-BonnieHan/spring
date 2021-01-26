package pack.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import pack.model.BoardDaoInter;

@Controller
public class ReplyController {
	@Autowired
	private BoardDaoInter inter;
	
	@RequestMapping(value="reply",method=RequestMethod.GET)
	public ModelAndView abc(
			@RequestParam("num") String num,
			@RequestParam("page") String page){
		ModelAndView view = new ModelAndView("reply", "data", inter.getDetail(num));
		view.addObject("page", page);
		return view;
	}
	
	@RequestMapping(value="reply",method=RequestMethod.POST)
	public String def(
			@RequestParam("page") String page, 
			BoardBean bean){
		//onum 갱신
		bean.setOnum(bean.getOnum() + 1);
		
		inter.updateOnum(bean);
		
		bean.setBdate();
		bean.setNum(inter.currentNum() + 1);  //새글 번호
		bean.setNested(bean.getNested() + 1); //들여쓰기
		
		if(inter.insertReply(bean))
			return "redirect:/list?page=" + page;
		else
			return "error";
	}
}
