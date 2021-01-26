package pack.business;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pack.other.MyInfo;
import pack.other.OutFileInterImpl;

@Configuration
public class Config {
	@Bean
	public MyInfo myInfo() {
		return new MyInfo();
	}
	
	@Bean
	public OutFileInterImpl outFileInterImpl() {
		OutFileInterImpl fileInterImpl = new OutFileInterImpl();
		fileInterImpl.setFilePath("c:/work/show.txt");
		return fileInterImpl;
	}
	
	@Bean("mesBean")
	public MessageImpl messageImpl() {
		MessageImpl impl = new MessageImpl("관우","안녕~~~",2000, myInfo());
		
		impl.setSpec("데이터 분석 전문가");
		impl.setMyInfo(myInfo());
		impl.setFileInter(outFileInterImpl());
		
		return impl;
	}
}
