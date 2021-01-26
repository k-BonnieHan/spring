package pack.go;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BankMain {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("bankinit.xml");
		
		Gogek daniel = (Gogek)context.getBean("gogek");
		daniel.selectBank("sinhan");
		daniel.playInputMoney(500);
		daniel.playOutputMoney(200);
		System.out.println("daniel : ");
		daniel.showMoney();
		
		System.out.println();
		Gogek john = (Gogek)context.getBean("gogek");
		john.selectBank("sinhan");
		john.playInputMoney(1000);
		john.playOutputMoney(200);
		System.out.println("john : ");
		john.showMoney();
		
		System.out.println();
		Gogek oscar = (Gogek)context.getBean("gogek");
		oscar.selectBank("hana");
		oscar.playInputMoney(1000);
		oscar.playOutputMoney(200);
		System.out.println("oscar : ");
		oscar.showMoney();
	}
}





