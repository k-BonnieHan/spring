package pack6_ex;

public class SangpumInput implements SangpumInter {
	private String msg;
	
	public void sangSet(String sang, String su, String dan) {
		int total = Integer.parseInt(su) * Integer.parseInt(dan);
		msg = "상품 " + sang + "에 대한 총 금액은 " + total;			
	}
	
	public String reData() {
		return msg;
	}
}
