package blackbelt.springf.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class BankService {
	
	@Autowired
	private RateExchangeGateway reGateway;
	
	@Value("#{myProperties.interestRate}")
	private double interestRate;
	
	@Autowired
	private PayGateway payGateway;
	
	public RateExchangeGateway getGateway() {
		return reGateway;
	}

	public void setGateway(RateExchangeGateway reGateway) {
		this.reGateway = reGateway;
	}
	
	public PayGateway getPayGateway() {
		return payGateway;
	}
	
	public void setPayGateway(PayGateway payGateway) {
		this.payGateway = payGateway;
	}
	
	public double getInterestRate() {
		return interestRate;
	}
	
	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	
	public double computeBalanceWithInterests(double balance) {
		return balance * (1 + getInterestRate());
	}
	
	public void transferMoney(String bankAccountNbDebit, String bankAccountNbCredit, double amount) {
		System.out.println("Transferring money between 2 bank accounts");
        // Let's take a nap of 2 sec, to simulate a long operation.
        try {
            Thread.sleep(2000);
            payGateway.performPayment(bankAccountNbDebit, bankAccountNbCredit, amount);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } 
	}
	
	public void computeYearlyInterest(String bankAccountNb) {
        // Let's take a nap of 1 sec, to simulate a long operation.
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } 
    }
	
}
