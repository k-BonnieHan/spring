package pack.business;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("init.xml");
		BusinessInter inter = (BusinessInter)context.getBean("businessImpl");
		
		inter.dataList(); //직원자료
		
		System.out.println();
		inter.inwonList(); //부서별 인원수
		
		System.out.println();		
		inter.maxPay(); //부서별 최대 급여자
	}
}
