package blackbelt.springf.main;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import blackbelt.springf.service.BankService;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		BasicDataSource ds = (BasicDataSource)ac.getBean("dataSource");
		
		System.out.println(ds.getDriverClassName() + " - " + ds.getUrl() + " - " + ds.getUsername() + " - " + ds.getPassword());
		
		BankService bs = (BankService) ac.getBean("bankService");
		
		System.out.println("InterestRate: " + bs.getInterestRate());
		System.out.println("Balance: " + bs.computeBalanceWithInterests(100));
		bs.transferMoney("debitAccount", "creditAccount", 10);
		bs.computeYearlyInterest("bankAccountNb");
		System.out.println(bs.getGateway() == ac.getBean("rateExchangeGateway"));
		
	}

}
