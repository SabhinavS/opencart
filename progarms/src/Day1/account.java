package Day1;

public class account {
	private int acc_no;
	private String accname;
	private double amount;
	//all variables are private and restricted
	/*
	//setter
	void setaccno(int accno)
	{
		acc_no=accno;
	}
	//getter
	int getaccno()
	{
		return acc_no;
	}
	*/
	//Source>>generate setters and getters>selectall>continue//
	public int getAcc_no() {
		return acc_no;
	}
	public void setAcc_no(int acc_no) {
		this.acc_no = acc_no;
	}
	public String getAccname() {
		return accname;
	}
	public void setAccname(String accname) {
		this.accname = accname;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	

}
