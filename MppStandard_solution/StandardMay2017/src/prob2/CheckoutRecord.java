package prob2;

import java.util.ArrayList;
import java.util.List;

public class CheckoutRecord {
	private List<CheckoutRecordEntry> core = new ArrayList<>();

	public List<CheckoutRecordEntry> getCheckoutRecordEntry() {
		return core;
	}
    public void  addCheckoutEntry(CheckoutRecordEntry myCore) {
    			 core.add(myCore);
    }
	
 }
