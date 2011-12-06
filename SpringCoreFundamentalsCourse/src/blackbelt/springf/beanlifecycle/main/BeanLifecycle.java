package blackbelt.springf.beanlifecycle.main;

import java.text.DateFormat;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import blackbelt.springf.beanlifecycle.service.CustomerService;
import blackbelt.springf.beanlifecycle.service.OrderService;

public class BeanLifecycle {

	public static void main(String[] args) {
		
		ApplicationContext appContext = new ClassPathXmlApplicationContext("beanLifecycleApplicationContext.xml");
		
		CustomerService cService = (CustomerService) appContext.getBean("customerService");
		System.out.println("get customerService bean");
		OrderService oService = (OrderService) appContext.getBean("orderService");
		System.out.println("get orderService bean");
		DateFormat df = (DateFormat) appContext.getBean("euDateFormat");
		System.out.println("get dateFormat bean");

	}

}
