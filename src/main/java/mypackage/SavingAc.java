package mypackage;

public class SavingAc extends Account {

	@Override
	public void AcDetails() {

			System.out.println("Calling Account Details of Saving Account");
	}

	@Override
	public void Withdrawl() {
		System.out.println("Calling Withdrawl of Saving Account");
	}

	@Override
	public void Deposite() {
		System.out.println("Calling Deposite of Saving Account");
	}
	@Override
	public void Transfer() {
		System.out.println("Calling Transfer of Saving Account");
		
	}

	public void Display() {
		System.out.println("Calling Display Function");
	}
}
