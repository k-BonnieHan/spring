package pack;

import java.util.Scanner;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAdvice {
	@Autowired
	private JikwonInter jikwonInter;
	
	@Around("execution(public void dataList())")
	public Object sbs(ProceedingJoinPoint joinPoint) throws Throwable{
		Scanner scanner = new Scanner(System.in);
		System.out.print("사번:");
		String no = scanner.nextLine();
		System.out.print("이름:");
		String name = scanner.nextLine();
		
		//...
		
		if(no.equals("5") && name.equals("신기해")) {
			Object object = joinPoint.proceed();
			return object;
		}else {
			System.out.println("인증 실패");
			return null;
		}
	}
}
