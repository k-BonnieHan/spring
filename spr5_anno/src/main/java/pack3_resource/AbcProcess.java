package pack3_resource;

import javax.annotation.Resource;

public class AbcProcess {
	@Resource(name="abc1")
	private Abc1 abc1;
	
	@Resource(name="abc2")
	private Abc2 abc2;
	
	public void showData() {
		System.out.println("이름은 " + abc1.getIrum());
		System.out.println("나이는 " + abc2.getNai());
	}
}
