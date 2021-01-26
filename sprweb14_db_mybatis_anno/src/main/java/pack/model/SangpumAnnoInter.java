package pack.model;

import java.util.List;
import org.apache.ibatis.annotations.Select;
import pack.controller.SangpumBean;

public interface SangpumAnnoInter {
	@Select("select * from sangdata")
	public List<SangpumDto> selectAllData();
	
	@Select("select * from sangdata where sang like concat('%',#{searchValue},'%')")
	public List<SangpumDto> selectSearchData(SangpumBean bean);
}
