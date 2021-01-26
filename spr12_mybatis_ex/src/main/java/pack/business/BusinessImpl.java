package pack.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pack.model.JikwonDto;
import pack.model.JikwonInter;

@Service
public class BusinessImpl implements BusinessInter{
	@Autowired
	private JikwonInter jikwonInter;
	
	//직원자료
	public void dataList() {
		List<JikwonDto> list = jikwonInter.selectList();
		
		System.out.println("직원 자료");
		System.out.println("사번\t이름\t부서명\t입사년");
		
		for(JikwonDto j:list) {
			System.out.println(j.getJikwon_no() + "\t" + 
					j.getJikwon_name() + "\t" + 
					j.getBuser_name() + "\t" + 
					j.getIbsa());
		}
	}
	
	//부서별 인원수
	public void inwonList() {
		List<JikwonDto> list = jikwonInter.selectBuser();
		System.out.println("부서별 인원수");
		for(JikwonDto j:list) {
			System.out.println(j.getBuser_name() + "\t" + j.getCount());
		}
	}
	
	//부서별 최대 급여자
	public void maxPay() {
		List<JikwonDto> list = jikwonInter.selectMaxPay();
		
		System.out.println("부서별 최대 급여자");
		
		for(JikwonDto j:list) {
			System.out.println(j.getBuser_name() + " : " + j.getJikwon_name() + "("+ j.getJikwon_pay() + ")");
		}
	}
}
