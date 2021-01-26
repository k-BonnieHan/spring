package pack5setter;

public class Gugudan implements CalcInter{
	public int[] guguCalc(int dan) {
		int[] cal = new int[9];
		for (int i = 0; i < 9; i++) {
			cal[i] = dan * (i + 1);
		}
		return cal;
	}
}
