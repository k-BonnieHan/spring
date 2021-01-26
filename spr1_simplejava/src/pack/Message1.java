package pack;

public class Message1 implements MessageInter{
	@Override
	public void sayHi(String name) {
		System.out.println("안녕 " + name + "님");	
	}
}
