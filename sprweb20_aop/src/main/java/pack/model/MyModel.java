package pack.model;

import org.springframework.stereotype.Repository;

@Repository
public class MyModel implements MyModelInter{
	@Override
	public String processMsg() {
		System.out.println("processMsg 실행");
		return "폴박 만세";
	}
	
	@Override
	public String businessMsg() {
		System.out.println("businessMsg 실행~~~~");
		return "모델 만세";
	}
}
