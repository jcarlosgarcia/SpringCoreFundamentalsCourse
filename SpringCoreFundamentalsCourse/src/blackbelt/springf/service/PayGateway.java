package blackbelt.springf.service;

public interface PayGateway {
	
	void performPayment(String bankAccountNbDebit, String bankAccountNbCredit, double amount);

}
