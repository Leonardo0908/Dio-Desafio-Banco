//Conta
public abstract class Account implements inAccount {
	
	private static int sequential = 1;
	private static final int agencyPattern = 0001;
	
	protected int agency; //agencia 
	protected int number; //numero
	protected double balance; //saldo
	protected Client client;
	
	public Account(Client client) {
		this.agency = Account.agencyPattern;
		this.number = sequential++;
		this.client = client;
	}	
	
	//Sacar
	@Override
	public void ToWithdraw(double value) {
		balance -= value;
	}
	
	//Deposito
	@Override
	public void Deposit(double value) {
		balance += value;
		
	}
	
	//Tranferencia
	@Override
	public void Transfer(double value, Account destinationAccount) {
		this.ToWithdraw(value);
		destinationAccount.Deposit(value);
		
	}
	
	public int getAgency() {
		return agency;
	}
	public int getNumber() {
		return number;
	}
	public double getBalance() {
		return balance;
	}
	
	protected void printCommonInformation(){
		System.out.println(String.format(" Agency: %d ", this.agency)); 
		System.out.println(String.format(" Holder: %s ", this.client.getName()));	//Titular
		System.out.println(String.format(" Number: %d ", this.number));   //Numero conta
		System.out.println(String.format(" Balance: %.2f ", this.balance));  //Saldo
	}
	
}
