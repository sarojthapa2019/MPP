package prob2;

import java.time.LocalDate;

public class CheckoutRecordEntry {
	private LocalDate checkoutDate;
	private LocalDate dueDate;
	private LendingItem item;
	private ItemType type;
	
	//getters	
	public LocalDate getCheckoutDate() {
		return checkoutDate;
	}
	public LocalDate getDueDate() {
		return dueDate;
	}
	
	

	public LendingItem getLendingItem() {
		return item;
	}
	public ItemType getTLendingType() {
		return type;
	}
	//Constructor

	public CheckoutRecordEntry(LendingItem item,LocalDate checkoutDate, LocalDate dueDate,ItemType type) {
		this.item = item;
		this.type = type;
		this.checkoutDate = checkoutDate;
		this.dueDate = dueDate;
	}


	
	
}
