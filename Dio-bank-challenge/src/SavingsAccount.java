//Conta Poupança
public class SavingsAccount extends Account {

	public SavingsAccount(Client client) {
		super(client);
	}

	public void printExtract() {
		
		System.out.println(" *** Savings Account Statement *** ");
		super.printCommonInformation();
	}
}	
