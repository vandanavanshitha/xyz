package jdbctemp;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity

public class dept05 {

	@Id

	private Integer deptid;

	private String dName;

	private String location;

	public dept05() {

	}

	public dept05(Integer dno, String dnm, String lc) {

		this.deptid = dno;

		this.dName = dnm;

		this.location = lc;

	}

	public Integer getDeptNo() {

		return deptid;

	}

	public void setDeptNo(Integer dno) {

		this.deptid = dno;

	}

	public String getDName() {

		return dName;

	}

	public void setDName(String dnm) {

		this.dName = dnm;

	}

	public String getLocation() {

		return location;

	}

	public void setLocation(String lc) {

		this.location = lc;

	}

	@Override

	public String toString() {

		return "Dept{" + "Dept No=" + deptid + ", Dept Name='" + dName + '\'' + ", Location='" + location

				+ '\'' + '}';

	}

}
