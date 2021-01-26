package pack2_auto;

import org.springframework.stereotype.Component;

//@Component
//@Component("sender")
@Component("sbs")
public class Sender implements SenderInter {
	public void show() {
		System.out.println("show 메소드 수행");
	}
}

