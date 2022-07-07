// interface Conta 
public interface inAccount {
	
	public void ToWithdraw(double value); //Sacar 
	public void Deposit(double value);    //Depositar
	public void Transfer(double value, Account destinationAccount);   //Trasferir
}
