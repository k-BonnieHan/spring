package pack2;

import org.aspectj.lang.ProceedingJoinPoint;

public class ProfileAdvice {  //Advice(Aspect)
	public Object kbs(ProceedingJoinPoint joinPoint) throws Throwable{
		System.out.println("핵심 메소드 수행 전 작업");
		
		Object object = joinPoint.proceed();
		
		System.out.println("핵심 메소드 수행 후 처리");
		
		return object;
	}
}
