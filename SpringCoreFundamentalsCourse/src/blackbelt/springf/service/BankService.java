package blackbelt.springf.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BankService {
	
	@Autowired
	private RateExchangeGateway reGateway;
	private double interestRate;
	@Autowired
	private PayGateway payGateway;
	
	public RateExchangeGateway getGateway() {
		return reGateway;
	}

	public void setGateway(RateExchangeGateway reGateway) {
		this.reGateway = reGateway;
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
		payGateway.performPayment(bankAccountNbDebit, bankAccountNbCredit, amount);
	}
	
}
