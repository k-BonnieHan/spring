package pack1_required;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main1 {
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("anno1.xml");
		Abc abc= context.getBean("abc", Abc.class);
		abc.display();
		
		context.registerShutdownHook();  //servlet destroy()를 명시적으로 호출 
		context.refresh();
		context.close();
	}

}
