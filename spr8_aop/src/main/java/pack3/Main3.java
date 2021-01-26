package pack3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main3 {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("aop3.xml");
		LogicInter logicInter = (LogicInter)context.getBean("logicImpl");
		logicInter.selectdataProcess();
	}
}
