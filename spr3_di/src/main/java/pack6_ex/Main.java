package pack6_ex;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("pack6_ex_init.xml");
		SangpumProInter sangproint = (SangpumProInter)context.getBean("process");
		sangproint.inputData();
		sangproint.showData();
	}
}
 