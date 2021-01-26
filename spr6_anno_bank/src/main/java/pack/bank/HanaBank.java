package pack.bank;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("hana")
@Scope("prototype")
public class HanaBank implements BankInter{
	private int money = 5000;
	
	public void inputMoney(int money) {
		System.out.println("하나은행에서 입금 처리");
		this.money = this.money + money;
	}
	
	public void outputMoney(int money) {
		this.money = this.money - money;
	}
	
	public int getMoney() {
		int aa = money;
		return aa;
	}
}
