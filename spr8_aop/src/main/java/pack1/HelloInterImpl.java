package pack1;

public class HelloInterImpl implements HelloInter{
	public HelloInterImpl() {
		System.out.println("HelloInterImpl 생성자");
	}
	
	public void hello() {
		try {
			Thread.sleep(2000);
			System.out.println("hello() 수행~~~~");
			System.out.println("2초 진행");
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public void hi() {
		System.out.println("hi 처리");
	}
}
