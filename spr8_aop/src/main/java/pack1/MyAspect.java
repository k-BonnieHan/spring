package pack1;

public class MyAspect {  //관심 사항 클래스 중 하나
	public void myLogon() {
		System.out.println("핵심 메소드 수행 전 로그온 작업");
	}
	
	public void myLogout() {
		System.out.println("핵심 메소드 수행 후 로그아웃 작업");
	}
	
	public void mySecurity() {
		System.out.println("핵심 메소드 수행 전 보안 설정");
	}
}
