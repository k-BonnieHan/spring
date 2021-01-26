package pack;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Repository;

@Repository
public class JikwonImpl extends JdbcDaoSupport implements JikwonInter{
	@Autowired
	public JikwonImpl(DriverManagerDataSource dataSource) {
		setDataSource(dataSource);
	}
	
	public List<JikwonDto> selectList(String buser) throws DataAccessException {
		RowMapper rowMapper = new JikwonRowMapper();
		return getJdbcTemplate().query("select * from jikwon left outer join buser on buser_num=buser_no where buser_num=" + buser, rowMapper);
	}
	
	class JikwonRowMapper implements RowMapper {
		public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
			JikwonDto dto = new JikwonDto();
			dto.setJikwon_no(rs.getString("jikwon_no"));
			dto.setJikwon_name(rs.getString("jikwon_name"));
			dto.setBuser_name(rs.getString("buser_name"));
			dto.setBuser_no(rs.getString("buser_no"));
			dto.setJikwon_jik(rs.getString("jikwon_jik"));
			return dto;
		}
	}
}
