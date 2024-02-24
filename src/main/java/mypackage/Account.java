package mypackage;

public abstract class Account {
	public abstract void AcDetails();
	public abstract void Withdrawl();
	public abstract void Deposite();
	public abstract void Transfer();
	public void BankDetails() {
		System.out.println("Calling Bank Details");
	}
}