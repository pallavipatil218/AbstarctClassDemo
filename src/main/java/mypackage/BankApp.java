package mypackage;

public class BankApp {

	public static void main(String[] args) {
	 //Account a1=new Acccount();
		SavingAc s1=new SavingAc();
		s1.AcDetails();
		s1.BankDetails();
		s1.Deposite();
		s1.Display();
		s1.Withdrawl();
		s1.Transfer();

		Account a1=new SavingAc();
		a1.AcDetails();
		a1.Deposite();
		a1.Withdrawl();
		a1.Transfer();
		a1.BankDetails();
//		a1.Display();// not allowed
	}

}
