package pack.business;

import pack.other.MyInfo;
import pack.other.OutFileInter;

public class MessageImpl implements MessageInter{  //BL
	// 생성자 주입용 멤버 필드
	private String name1, name2;
	private int year;
	private MyInfo myInfo;
	
	// 셋터 주입용 멤버 필드
	private String spec;
	private OutFileInter fileInter;
	
	public MessageImpl(String name1, String name2, int year, MyInfo myInfo) {
		// 생성자 주입 
		this.name1 = name1;
		this.name2 = name2;
		this.year = year;
		this.myInfo = myInfo;
	}
	
	public void setSpec(String spec) {   // 셋터 주입
		this.spec = spec;
	}
	
	public void setMyInfo(MyInfo myInfo) {  // 셋터 주입
		this.myInfo = myInfo;
	}
	
	public void setFileInter(OutFileInter fileInter) {
		this.fileInter = fileInter;
	}
	
	public void sayHi() {
		// 데이터 출력용 메소드
		String msg = name1 + " " + name2;
		msg += "\n" + (year + 20) + "년";
		msg += "\n" + myInfo.myData();
		System.out.println(msg);
		
		String msg2 = spec;
		msg2 += " " + myInfo.myData();
		System.out.println(msg2);
		
		String ss = msg + "\n" + msg2;
		fileInter.outFile(ss);
	}
	
	public void sayHello() {
		//...
	}
}
