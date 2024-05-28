package jdbctemp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class service {
	private repo re;

	public repo getRe() {
		return re;
	}

	@Autowired
	public void setRe(repo re) {
		this.re = re;
	}

	public void insert(dept05 d) {
		// System.out.println("added");
		re.save(d);
	}

	public List<dept05> getAll() {
		return re.findAll();

	}

}
