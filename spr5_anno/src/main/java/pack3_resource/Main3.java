package pack3_resource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main3 {
	public static void main(String[] args) {
		String[] metas = new String[] {"anno3.xml","anno3_1.xml"};
		
		//ApplicationContext context = new ClassPathXmlApplicationContext(metas[0]);
		ApplicationContext context = new ClassPathXmlApplicationContext(metas);
		
		AbcProcess process = context.getBean("abcProcess", AbcProcess.class);
		process.showData();
	}

}
