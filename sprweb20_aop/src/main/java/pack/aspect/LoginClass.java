package pack.aspect;

import org.springframework.stereotype.Component;

@Component
public class LoginClass {
	public void myLogin() {
		System.out.println("핵심 메소드 수행 전에 로긴 작업 선행");
	}
}
