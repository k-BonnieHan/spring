package pack2_auto;

import org.springframework.stereotype.Component;

@Component
public class Sender2 implements SenderInter{
	public void show() {
		System.out.println("Sender2클래스의 show 메소드 수행");
		System.out.println("하하하");
	}
}
