package pack1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		// DB 처리용
		//DataDaoImpl dataDaoImpl = new DataDaoImpl();
		DataDao dataDao = new DataDaoImpl();
		
		// 비즈니스 로직
		SelectService service = new SelectProcessImpl(dataDao);
		service.selectProcess();
		
		System.out.println();
		//Spring 사용
		ApplicationContext context = new ClassPathXmlApplicationContext("pack1_init.xml");
		SelectService selectService = (SelectService)context.getBean("selectProcessImpl");
		selectService.selectProcess();
	}

}
