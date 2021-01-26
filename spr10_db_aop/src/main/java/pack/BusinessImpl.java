package pack;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BusinessImpl implements BusinessInter{
	@Autowired
	private JikwonInter jikwonInter;
	
	public void dataList() {
		int cou = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.print("부서번호 입력:");
		String buser = scanner.nextLine();
		for(JikwonDto j:jikwonInter.selectList(buser)) {
			System.out.println(j.getJikwon_no() + " " + 
					j.getJikwon_name() + " " +
					j.getBuser_name() + " " +
					j.getJikwon_jik());
			cou += 1;
		}
		System.out.println("인원수:" + cou + "명");
	}
}


