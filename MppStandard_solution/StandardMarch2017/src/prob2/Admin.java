package prob2;

import java.util.List;

public class Admin {
	public static double computeUpdatedBalanceSum(List<Employee> list) {
		//implement
		double sum=0;
		for(Employee emps:list) {
			sum+= emps.computeUpdatedBalanceSum();
		}
		return sum;
	}
}
