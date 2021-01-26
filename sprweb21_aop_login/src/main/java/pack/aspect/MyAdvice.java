package pack.aspect;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyAdvice {
	@Autowired
	private LoginClass login;  //여러 관심 사항 중 하나로 로긴 관련 클래스 
	
	@Around("execution(* getList*(..))")
	public Object aopProcess(ProceedingJoinPoint joinPoint) throws Throwable{
		HttpServletRequest req = null;
		HttpServletResponse res = null;
		
		for (Object obj:joinPoint.getArgs()) {
			if(obj instanceof HttpServletRequest) {
				req = (HttpServletRequest)obj;
			}
			if(obj instanceof HttpServletResponse) {
				res = (HttpServletResponse)obj;
			}
		}
		
		if(login.loginCheck(req, res)) {
			return null;
		}
		
		Object object = joinPoint.proceed();
		return object;
	}
}
