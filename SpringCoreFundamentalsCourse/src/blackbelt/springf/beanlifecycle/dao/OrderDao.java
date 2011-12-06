package blackbelt.springf.beanlifecycle.dao;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.context.annotation.Lazy;

@Repository
@Lazy(true)
public class OrderDao {
	
	@Autowired
	DataSource dataSource;
	
	OrderDao() {
		System.out.println(this.getClass() + " constructor.");
	}
	
	@PostConstruct
	public void initialize() {
		System.out.println(this.getClass() + " init.");
	}
}
