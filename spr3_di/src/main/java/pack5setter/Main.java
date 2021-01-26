package pack5setter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("pack5_init.xml");
		
		MyProcess myProcess = (MyProcess)context.getBean("my");
		myProcess.dispData();
	}
}
