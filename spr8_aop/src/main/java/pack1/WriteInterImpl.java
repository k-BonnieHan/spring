package pack1;

public class WriteInterImpl implements WriteInter{
	public WriteInterImpl() {
		System.out.println("WriteInterImpl 생성자");
	}
	
	public void write() {
		try {
			Thread.sleep(3000);
			System.out.println("write() 수행");
			System.out.println("3초 진행");
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
