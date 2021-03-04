package ro.ase.csie.cts.seminar2.solid;

public class Main {

	public static void main(String[] args) {
	
			Person p = new Person("Costin");
			BankAccount account = new BankAccount("INGB123124",p);
			account.deposit(100);
			try {
				account.withdraw(70);
				account.withdraw(50);
			} catch (InsuficientFundsException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println(account.getBalance());
	
			FeeBankAccount fb = new FeeBankAccount("INGB1994", p);
			fb.deposit(200);
			try {
				fb.withdraw(100);
			} catch (InsuficientFundsException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(fb.getBalance());
	}

	
}
