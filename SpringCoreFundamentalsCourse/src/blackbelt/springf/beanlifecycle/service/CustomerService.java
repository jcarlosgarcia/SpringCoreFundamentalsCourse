package blackbelt.springf.beanlifecycle.service;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import blackbelt.springf.beanlifecycle.dao.CustomerDao;

@Service
public class CustomerService {
	
	@Autowired
	CustomerDao customerDao;
	
	CustomerService() {
		System.out.println(this.getClass() + " constructor.");
	}
	
	@PostConstruct
	public void initialize() {
		System.out.println(this.getClass() + " init.");
	}

}
