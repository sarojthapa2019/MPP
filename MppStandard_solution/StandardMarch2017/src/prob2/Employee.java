package prob2;

import java.util.ArrayList;
import java.util.List;

public class Employee {
	private String name;
	private List<Account> list = new ArrayList<Account>();
	public Employee(String string) {
		// TODO Auto-generated constructor stub
		this.name= string;
	}
	public String getName() {
		return name;
	}
	public void addAccount(Account acc) {
		// do something
		list.add(acc);
		
	}	
	
	public double computeUpdatedBalanceSum() {
		//implement
		double sum=0.00;
		for(Account ac: list) {
			sum+=ac.computeUpdatedBalance();
		}
		return sum;
	}
}
