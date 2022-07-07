//Conta Corrente
public class CheckingAccount extends Account {

	public CheckingAccount(Client client) {
		super(client);
	}
	
	public void printExtract() {

		System.out.println(" *** Checking Account Statement *** ");
		super.printCommonInformation();
	}
}
