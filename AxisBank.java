package week3.day2;

public class AxisBank extends BankInfo {
	public void deposit() {
		System.out.println("Deposit from Axis Bank");
	}
	public static void main(String[] args) {
		BankInfo bk = new BankInfo();
		AxisBank abk = new AxisBank();
		abk.saving();
		abk.fixed();
		abk.deposit();
		bk.deposit();
	}

}
