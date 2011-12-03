package blackbelt.springf.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import blackbelt.springf.service.BankService;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		BankService bs = (BankService) ac.getBean("bankService");
		
		System.out.println("InterestRate: " + bs.getInterestRate());
		System.out.println("Balance: " + bs.computeBalanceWithInterests(100));
		
		System.out.println(bs.getGateway() == ac.getBean("rateExchangeGateway"));
		
	}

}
