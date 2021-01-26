package pack;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;
 
public class WorldActionController implements Controller{
	private ShardData shardData;
	
	public void setShardData(ShardData shardData) {
		this.shardData = shardData;
	}
	
	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("helloworld");
		modelAndView.addObject("msg", "월드 : " + shardData.getShared());
		return modelAndView;
	}
}



