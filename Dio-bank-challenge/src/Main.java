
public class Main {
	
	public static void main(String[] args) {
		
		Client Franciane = new Client();
		Franciane.setName("Franciane Rodrigues");
		Client Leonardo = new Client();
		Leonardo.setName("Leonardo Rodrigues");
		
		Account pp = new SavingsAccount(Franciane);
		
		Account cc = new CheckingAccount(Leonardo);
		cc.Deposit(100);
		
		cc.Transfer(10, pp);
		
		cc.printExtract();
		pp.printExtract();
	}
}
