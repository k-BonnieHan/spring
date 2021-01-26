package pack3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LogicImpl implements LogicInter{
	@Autowired
	private JikwonInter jikwonInter;
	
	public void selectdataProcess() {
		System.out.println("selectdataProcess 수행시작");
		jikwonInter.selectAll();
		System.out.println("selectdataProcess 수행ㄲㅡㅌ");
	}
}
