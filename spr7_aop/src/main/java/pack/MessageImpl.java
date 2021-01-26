package pack;

public class MessageImpl implements MessageInter{
	//핵심 로직 클래스
	private String name;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void sayHi() {
		System.out.println("안녕 " + name + "님!  핵심 로직 수행");		
	}
}
