package jdbctemp;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppConfig {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("jdbctemp/spring-servlet.xml");
		DeptDAO DAO = context.getBean("DeptDAO", DeptDAO.class);
		System.out.println("hi");
		dept05 de = new dept05();
		de.setDeptNo(130);
		de.setDName("vanish");
		de.setLocation("vizag");
		// int r = DAO.insert(de);
		service s = context.getBean("services", service.class);
		s.insert(de);
		List<dept05> depart = s.getAll();
		for (dept05 i : depart) {
			System.out.println(i);
		}
	}

}
