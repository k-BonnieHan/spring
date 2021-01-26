package pack4;

import java.util.Scanner;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class RunAdvice {
	@Around("execution(public void startProcess())")
	public Object mbc(ProceedingJoinPoint joinPoint) throws Throwable{
		System.out.println("AOP 시작 : 핵심 메소드 수행 전 id 검증");
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("id 입력:");
		String id = scanner.nextLine();
		if(!id.equals("aa")) {
			System.out.println("id 불일치!. 더 이상 작업하지 않습니다");
			return null;
		}
		
		Object obj = joinPoint.proceed();
		System.out.println("AOP 종료");
		
		return obj;
	}
}
