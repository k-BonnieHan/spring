package pack.model;

import org.springframework.stereotype.Component;
import pack.controller.SangpumBean;

@Component
public class SangpumModel {
	public String compute(SangpumBean bean) {
		String data = "품명:" + bean.getSang() + " " +
				", 금액:" + (bean.getSu() * bean.getDan());
		return data;
	}
}
