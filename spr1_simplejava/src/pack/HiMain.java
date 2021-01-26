package pack;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HiMain {
	public static void main(String[] args) {
		// 전통적 자바 방법 사용
		MessageInter inter;
		
		Message1 message1 = new Message1();
		inter = message1;
		inter.sayHi("홍길동");
		
		System.out.println();
		//spring 방법 사용
		ApplicationContext context = new ClassPathXmlApplicationContext("init.xml");
		MessageInter inter2 = (MessageInter)context.getBean("messageBean");
		inter2.sayHi("한국인");
	}
}





