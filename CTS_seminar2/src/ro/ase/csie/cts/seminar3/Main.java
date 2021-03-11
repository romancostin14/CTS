package ro.ase.csie.cts.seminar3;

import java.util.HashMap;
import java.util.Map;

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
			
			Map<Person, BankAccount> employees = new HashMap<>();
			Person p1 = new Person("Chuck Norris");
			BankAccount b1 = new BankAccount("RFZB123123123", p1);
			
			Person p2 = new Person("Arnold");
			BankAccount b2 = new BankAccount("RFZB123123123", p2);
			

			Person p3 = new Person("Van Damme");
			BankAccount b3 = new BankAccount("Bt123123", p3);
			
			employees.put(p1, b1);
			employees.put(p2, b2);
			employees.put(p3, b3);
			
			for(BankAccount a :employees.values())
			{
				a.deposit(1000);
			}
		
			for(BankAccount a :employees.values())
			{
				try {
					a.withdraw(10);
				} catch (InsuficientFundsException e) {
					// TODO Auto-generated catch block
					System.out.println(e.getMessage());
				}
			}
			
	}

	
}
