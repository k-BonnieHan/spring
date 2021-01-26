package pack3;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class ProfileAdvice {  //Advice(Aspect)
	@Around("execution(public * pack3..*(..))")
	public Object kbs(ProceedingJoinPoint joinPoint) throws Throwable{
		System.out.println("Anno로 핵심 메소드 수행 전 작업");
		
		Object object = joinPoint.proceed();
		
		System.out.println("Anno로 핵심 메소드 수행 후 처리");
		
		return object;
	}
	
	@Before("execution(public * pack3..*(..))")
	public void aa() {
		System.out.println("메소드 실행 전 @Before");
	}
	
	@After("execution(public * pack3..*(..))")
	public void bb() {
		System.out.println("메소드 실행 후 @After");
	}
}
