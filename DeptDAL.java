package jdbctemp;

import org.springframework.jdbc.core.JdbcTemplate;

public class DeptDAL implements DeptDAO {
	private JdbcTemplate jdbcTemplate;

	@Override
	public int insert(dept05 d) {
		// TODO Auto-generated method stub
		String query = "insert into dept05(deptid,dname,location) values(?,?,?)";
		int r = this.jdbcTemplate.update(query, d.getDeptNo(), d.getDName(), d.getLocation());

		return r;
	}

	@Override
	public int update(dept05 d1) {
		// TODO Auto-generated method stub
		return 0;
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

}
