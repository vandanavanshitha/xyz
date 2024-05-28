package jdbctemp;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository
public class repo {
	private JdbcTemplate jdbc;

	public JdbcTemplate getJdbc() {
		return jdbc;
	}

	@Autowired
	public void setJdbc(JdbcTemplate jdbc) {
		this.jdbc = jdbc;
	}

	public void save(dept05 d) {
		// System.out.println("added");
		String query = "insert into dept05(deptid,dname,location) values(?,?,?)";
		int r = jdbc.update(query, d.getDeptNo(), d.getDName(), d.getLocation());
		System.out.println(r);
	}

	public List<dept05> findAll() {
		// TODO Auto-generated method stub
		// List<dept05> li = new ArrayList<>();
		// dept05 d = new dept05();
		// d.setDeptNo(234);
		// d.setDName("van");
		// d.setLocation("vzm");
		// li.add(d);
		// return li;
		String query1 = "select * from dept05";
		RowMapper<dept05> mapper = new RowMapper<dept05>() {
			@Override
			public dept05 mapRow(ResultSet rs, int rowNum) throws SQLException {
				dept05 d = new dept05();
				d.setDeptNo(rs.getInt(1));
				d.setDName(rs.getString(2));
				d.setLocation(rs.getString(3));
				return d;
			}
		};
		return (jdbc.query(query1, mapper));

	}

}
