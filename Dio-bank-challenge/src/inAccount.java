// interface Conta 
public interface inAccount {
	
	void ToWithdraw(double value); //Sacar 
	void Deposit(double value);    //Depositar
	void Transfer(double value, Account destinationAccount);   //Trasferir
	void printExtract();
}
