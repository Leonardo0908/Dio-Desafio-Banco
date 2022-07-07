//Conta
public abstract class Account implements inAccount {
	
	private static int sequential = 1;
	private static final int agencyPattern = 0001;
	
	private int agency; //agencia 
	private int number; //numero
	private double balance; //saldo
	
	public Account() {
		this.agency = Account.agencyPattern;
		this.number = sequential++;
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
	
}
