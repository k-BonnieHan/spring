package pack2;

public class LogicImpl implements LogicInter{
	private JikwonInter jikwonInter;
	
	public LogicImpl() {
		// TODO Auto-generated constructor stub
	}
	
	public LogicImpl(JikwonInter jikwonInter) {
		this.jikwonInter = jikwonInter;
	}
	
	public void selectdataProcess() {
		System.out.println("selectdataProcess 수행시작");
		jikwonInter.selectAll();
		System.out.println("selectdataProcess 수행ㄲㅡㅌ");
	}
}
