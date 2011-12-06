package blackbelt.springf.beanlifecycle.dao;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CustomerDao {
	
	@Autowired
	DataSource dataSource;
	
	CustomerDao() {
		System.out.println(this.getClass() + " constructor.");
	}
	
	@PostConstruct
	public void initialize() {
		System.out.println(this.getClass() + " init.");
	}
}
