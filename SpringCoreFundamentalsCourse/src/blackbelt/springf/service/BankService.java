package blackbelt.springf.service;

public class BankService {
	
	private RateExchangeGateway reGateway;
	private double interestRate;
	
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
	
}
