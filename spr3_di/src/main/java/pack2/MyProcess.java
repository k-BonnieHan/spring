package pack2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MyProcess implements MyProcessInter {
	private MoneyInter inter;
	private int re[];
	
	public MyProcess(MoneyInter inter) {
		this.inter = inter;
	}
	
	public void inputMoney() {
		try {
			InputStreamReader reader = new InputStreamReader(System.in);
			BufferedReader reader2 = new BufferedReader(reader);
			int myMoney = 0;
			System.out.print("금액입력(56781):");
			String data = reader2.readLine();
			myMoney = Integer.parseInt(data);
			
			re = inter.calcMoney(myMoney);
		} catch (Exception e) {
			System.out.println("inputMoney err : " + e);
		}
	}

	public void showMoney() {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer();
		sb.append("만원: " + re[0] + "\n");
		sb.append("천원: " + re[1] + "\n");
		sb.append("백원: " + re[2] + "\n");
		sb.append("십원: " + re[3] + "\n");
		sb.append("일원: " + re[4]);
		System.out.println(sb.toString());
	}
}
