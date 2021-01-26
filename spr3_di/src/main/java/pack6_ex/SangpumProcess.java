package pack6_ex;

import java.util.Scanner;

public class SangpumProcess implements SangpumProInter {
	private SangpumInter inter;

	public void setInter(SangpumInput inter) {
		this.inter = inter;
	}

	public void inputData() {
		try {
			System.out.print("상품명: ");
			Scanner scanner = new Scanner(System.in);
			String sang = scanner.next();
			System.out.print("수량: ");
			String su = scanner.next();
			System.out.print("단가: ");
			String dan = scanner.next();
			inter.sangSet(sang, su, dan);
		} catch (Exception e) {
			System.out.println("inputData err: " + e);
		}
	}

	public void showData() {
		System.out.println(inter.reData());
	}

}
