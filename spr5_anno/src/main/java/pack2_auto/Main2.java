package pack2_auto;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main2 {
	public static void main(String[] args) {
		String[] metas = new String[] {"anno2.xml"}; 
		ApplicationContext context = new ClassPathXmlApplicationContext(metas[0]);
		
		SenderProcess process = (SenderProcess)context.getBean("senderProcess");
		process.dispData();
	}
}
