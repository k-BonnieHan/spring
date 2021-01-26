package pack1_required;

import org.springframework.beans.factory.annotation.Required;

public class Abc {
	private int number;
	private int kbs;
	
	@Required
	public void setNumber(int number) {
		this.number = number;
	}
	
	public void setKbs(int kbs) {
		this.kbs = kbs;
	}
	
	public void display() {
		System.out.println("number : " + number);
		System.out.println("kbs : " + kbs);
	}
}
