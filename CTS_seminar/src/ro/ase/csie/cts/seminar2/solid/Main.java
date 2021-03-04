package ro.ase.csie.cts.seminar2.solid;

public class Main {

	public static void main(String[] args) {
			Persoana p = new Persoana("Costin");
			BankAccount account = new BankAccount("INGB123124",p);
			account.deposit(100);
			account.withdraw(50);
			account.withdraw(70);
			System.out.println(account.getBalance());
	}

}
