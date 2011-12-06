package blackbelt.springf.beanlifecycle.service;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import blackbelt.springf.beanlifecycle.dao.CustomerDao;
import blackbelt.springf.beanlifecycle.dao.OrderDao;

@Service
@Lazy(true)
public class OrderService {
	
	@Autowired
	OrderDao orderDao;
	@Autowired
	CustomerDao customerDao;
	
	OrderService() {
		System.out.println(this.getClass() + " constructor.");
	}
	
	@PostConstruct
	public void initialize() {
		System.out.println(this.getClass() + " init.");
	}

}
