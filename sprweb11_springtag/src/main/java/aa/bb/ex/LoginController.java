package aa.bb.ex;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {
	private String forViewName = "loginform";
	
	@ModelAttribute("command")   //다른 객체보다 먼저 생성
	public LoginCommand formBack() {
		//...
		//return loginCommand;    //어노테이션 안쓰면 이렇게 할 수 있다 => return new LoginCommand();
		return new LoginCommand();
	}
	
	@RequestMapping(value = "login", method = RequestMethod.GET)
	public String form() {
		return forViewName;
	}
	
	@RequestMapping(value = "login", method = RequestMethod.POST)
	//public String submit(LoginCommand loginCommand) {
	public String submit(
			@Validated @ModelAttribute("command") LoginCommand loginCommand,
			BindingResult result) {
		//BindingResult는 아래의 initBinder를 호출
		System.out.println("*****" + result.hasErrors());
		if(result.hasErrors()) {
			return forViewName;
		}
		
		if(loginCommand.getUserid().equals("aa") && 
				loginCommand.getPasswd().equals("11")) {
			return "redirect:/list";   //목록보기
		}else {
			return forViewName;
		}
	}
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		binder.setValidator(new DataValidator());
	}
}


