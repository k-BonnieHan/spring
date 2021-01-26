package aa.bb.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {
	@RequestMapping(value = "kbs/login", params = "type=admin")
	public ModelAndView aa() {
		ModelAndView andView = new ModelAndView();
		andView.setViewName("show");
		andView.addObject("msg", "관리자");
		return andView;
	}
	
	@RequestMapping(value = "kbs/login", params = "type=user")
	public ModelAndView bb() {
		ModelAndView andView = new ModelAndView();
		andView.setViewName("show");
		andView.addObject("msg", "일반고객");
		return andView;
	}
	
	@RequestMapping(value = "kbs/login", params = "!type")
	public ModelAndView cc() {
		ModelAndView andView = new ModelAndView();
		andView.setViewName("show");
		andView.addObject("msg", "인자가 없군요");
		return andView;
	}
	
	// 요청 url의 일부를 변수로 받아 처리 
	@RequestMapping(value = "mbc/{url}")
	public ModelAndView dd(
			@PathVariable String url, 
			@RequestParam("name") String name) {
		
		String ss = "url : " + url;
		
		ModelAndView andView = new ModelAndView();
		
		if(url.equals("korea")) {
			andView.addObject("msg", ss + " " + name);
		}else if(url.equals("usa")) {
			andView.addObject("msg", ss + " " + name);
		}else {
			andView.addObject("msg", "기타");
		}
		
		andView.setViewName("show");
		return andView;
	}
	
	@RequestMapping(value = "ent/{co}/singer/{singer}")
	public ModelAndView ee(
			@PathVariable String co,
			@PathVariable String singer,
			@RequestParam("title") String title) {
		
		String datas = "소속사:" + co + ", 가수:" + singer + ", 타이틀:" + title;
		ModelAndView andView = new ModelAndView();
		andView.setViewName("show");
		andView.addObject("msg", datas);
		return andView;
	}
}




