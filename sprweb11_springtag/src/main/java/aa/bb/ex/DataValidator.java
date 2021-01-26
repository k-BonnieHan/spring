package aa.bb.ex;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

//입력 자료가 들어 있는 폼빈 클래스가 가진 값 검증용
public class DataValidator implements Validator{
	@Override
	public boolean supports(Class<?> arg) {
		// TODO Auto-generated method stub
		return LoginCommand.class.isAssignableFrom(arg);
	}
	
	@Override
	public void validate(Object target, Errors errors) {
		// target에 대한 검증 지원. 에러 발생 시 Errors 객체에 저장
		LoginCommand command = (LoginCommand)target;
		//넘어온 자료 확인
		System.out.println("----" + command.getUserid() + " " + command.getPasswd());
		
		//입력자료 검증
		//방법1
		if(command.getUserid() == null || command.getUserid().isEmpty()) {
			errors.rejectValue("userid", "err.userid");
		}
		
		//방법2
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "passwd", "err.passwd");
	}
}
