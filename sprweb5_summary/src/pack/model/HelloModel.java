package pack.model;

import java.util.Calendar;

public class HelloModel {
	public String getGreeting() {
		int hour = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
		
		String ss = "";
		
		if(hour >= 6 && hour <= 10) {
			ss = "좋은 아침입니다";
		}else if(hour >= 12 && hour <= 15) {
			ss = "점심은 맛있게 드셨나요";
		}else if(hour >= 18 && hour <= 22) {
			ss = "좋은 저녁 되세요";
		}else {
			ss = "안녕하세요";
		}
		
		return ss;
	}
}
