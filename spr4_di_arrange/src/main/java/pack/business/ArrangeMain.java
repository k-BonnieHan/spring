package pack.business;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class ArrangeMain {
	public static void main(String[] args) {
		// 방법1 : meta 파일(**.xml)을 이용해 객체 생성 및 관리
		/*
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("classpath:pack/business/arrange.xml");
		*/
		/*
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("classpath:arrange.xml");
		*/
		
//		GenericXmlApplicationContext context = 
//				new GenericXmlApplicationContext("classpath:arrange.xml");
//		
//		//singleton 확인
//		MessageImpl impl1 = (MessageImpl)context.getBean("messageImpl");
//		impl1.sayHi();
//		MessageImpl impl2 = (MessageImpl)context.getBean("messageImpl");
//		impl2.sayHi();
//		System.out.println(impl1 + " " + impl2.toString());
//		
//		System.out.println("-------");
//		//다형성
//		/*
//		//casting
//		MessageInter inter = (MessageImpl)context.getBean("messageImpl");
//		inter.sayHi();
//		*/
//		
//		//casting 
//		MessageInter inter = (MessageInter)context.getBean("messageImpl");
//		inter.sayHi();
//		
//		//class type 기술
//		System.out.println("\n^^^^^^^^;");
//		MessageInter inter2 = context.getBean("messageImpl", MessageInter.class);
//		inter2.sayHi();
//		
//		context.close();
		

		// 방법2 : meta 파일을 class로 작성한 후 객체 생성 및 관리
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(Config.class);
		
		MessageInter messageInter = context.getBean("mesBean", MessageInter.class);
		messageInter.sayHi();
	}
}


