package pack.bank;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class SinhanBank implements BankInter{
	private int money = 1000;
	
	public void inputMoney(int money) {
		System.out.println("신한은행 : 입금");
		this.money += money;
	}
	
	public void outputMoney(int money) {
		this.money -= money;
	}
	
	public int getMoney() {
		return money;
	}
}
