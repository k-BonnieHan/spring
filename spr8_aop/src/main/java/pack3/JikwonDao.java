package pack3;

import org.springframework.stereotype.Repository;

@Repository
public class JikwonDao implements JikwonInter{
	public void selectAll() {
		System.out.println("jikwon 전체 자료 읽기");
	}
}
