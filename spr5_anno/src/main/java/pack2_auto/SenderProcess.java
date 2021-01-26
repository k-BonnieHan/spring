package pack2_auto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import pack2_etc.Nice;

//@Component
//@Component("senderProcess")
@Service
@ComponentScan("pack2_etc")
public class SenderProcess {
	//@Autowired
	//private Sender sender;
	
	@Autowired   //type에 의한 Mapping
	//@Qualifier("sender")
	@Qualifier("sender2")
	private SenderInter inter;
	
	/*
	@Autowired  //type에 의한 Mapping
	//@Autowired(required = true)
	//@Autowired(required = false)
	public SenderProcess(Sender sender) {
		this.sender = sender;
	}
	*/
	
	/*
	@Autowired
	public void setSender(Sender sender) {
		this.sender = sender;
	}
	*/
	
	@Autowired
	private Nice nice;
	
	public void dispData() {
		System.out.println("dispData ...");
		//sender.show();
		inter.show();
		nice.hello();
	}
}
