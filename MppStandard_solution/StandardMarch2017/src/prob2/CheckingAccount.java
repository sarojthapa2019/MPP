package prob2;

public class CheckingAccount extends Account{
	private double balance;
	private double monthlyFee;
	private String acctId;
	
	
	public CheckingAccount(String acctId, double monthlyFee, double balance) {
		//super();
		this.balance = balance;
		this.monthlyFee = monthlyFee;
		this.acctId = acctId;
	}

	@Override
	public String getAccount() {
		// TODO Auto-generated method stub
		return acctId;
	}

	@Override
	public double getBalance() {
		// TODO Auto-generated method stub
		return balance;
	}

	@Override
	public double computeUpdatedBalance() {
		// TODO Auto-generated method stub
		return balance - monthlyFee;
	}

}
