package aspect;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class LoggingAdvice implements MethodInterceptor {
	public Object invoke(MethodInvocation invocation) throws Throwable {
		// joinpoint에 삽입되어 동작할 코드 기술
		// target 메소드명 출력
		String methodName = invocation.getMethod().getName();
		System.out.println("호출된 메소드 이름 : " + methodName);
		
		Object object = invocation.proceed();  //핵심로직 클래스 중 하나의 메소드 수행  sayHi()
		
		System.out.println(methodName + " 수행 후 다음 작업");
		
		return object;
	}
}
