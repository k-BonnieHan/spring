package pack.go;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import pack.bank.BankInter;
import pack.bank.HanaBank;
import pack.bank.SinhanBank;

@Service
@ComponentScan("pack.bank")
//@Scope("singleton")
@Scope("prototype")
public class Gogek {
	private BankInter bankInter;
	
	@Autowired
	@Qualifier("sinhanBank")
	private SinhanBank sinhanBank;
	
	@Resource(name="hana")
	private HanaBank hanaBank;
	
	public void selectBank(String sel) {
		if(sel.equals("sinhan")) {
			bankInter = sinhanBank;
		}else if(sel.equals("hana")) {
			bankInter = hanaBank;
		}
	}
	
	public void playInputMoney(int money) {
		bankInter.inputMoney(money);
	}
	
	public void playOutputMoney(int money) {
		bankInter.outputMoney(money);
	}
	
	public void showMoney() {
		System.out.println("계좌 잔고 : " + bankInter.getMoney());
	}
}



