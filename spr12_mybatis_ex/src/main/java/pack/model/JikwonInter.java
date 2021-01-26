package pack.model;

import java.util.List;

public interface JikwonInter {
	//직원 자료
	List<JikwonDto> selectList();
	
	//부서별 인원
	List<JikwonDto> selectBuser();
	
	//부서별 최대 급여자
	List<JikwonDto> selectMaxPay();
}
