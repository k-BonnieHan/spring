package pack4setter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("pack4_init.xml");
		
		MyProcess myProcess = (MyProcess)context.getBean("myProcess");
		System.out.println(myProcess.toString());
		System.out.println();
		System.out.println(myProcess);
	}
}
