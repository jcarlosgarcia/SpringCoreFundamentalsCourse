package blackbelt.springf.service;

import org.springframework.stereotype.Component;

@Component
public class RemotePayGateway implements PayGateway {

	@Override
	public void performPayment(String bankAccountNbDebit,
			String bankAccountNbCredit, double amount) {
		
		System.out.println("Using RemotePayGateway");

	}

}
