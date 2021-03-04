package ro.ase.csie.cts.seminar2.solid;

public class BankAccount {

	private String iban;
	private long balance;
	private Persoana accountHolder;

	public BankAccount(String iban, Persoana person)
	{
		this.iban=iban;
		this.accountHolder = person;
		balance =0;
	}
	
	public void withdraw(long amount) {
		
		System.out.println("Withdrawing "+amount+" from "+ iban);
		balance -= amount;
	}
	public void deposit(long amount) {
		System.out.println("Adding "+amount+" to "+ iban);
		balance += amount;
	}
	public String getIban() {
		return iban;
	}

	public long getBalance() {
		return balance;
	}

	public Persoana getAccountHolder() {
		return accountHolder;
	}


	
}
