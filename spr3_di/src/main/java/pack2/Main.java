package pack2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("pack2_init.xml");
		
		MyProcessInter myProcessInter = (MyProcessInter)context.getBean("myProcess");
		myProcessInter.inputMoney();
		myProcessInter.showMoney();
	}
}
