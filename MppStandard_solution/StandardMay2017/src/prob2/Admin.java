package prob2;

import java.util.*;

public class Admin {
	// Returns phone numbers (in sorted order) of the Library Members who have ever
	// checked out the specified lending item
	public static List<String> getPhoneNums(LibraryMember[] members, LendingItem item) {
		List<String> phoneNums = new ArrayList<>();
		// implement
		for (LibraryMember libraryMember : members) {
			
			List<CheckoutRecordEntry> cores = libraryMember.getCheckoutRecord().getCheckoutRecordEntry();
			for (CheckoutRecordEntry checkoutRecordEntry: cores) {
				LendingItem borrower = checkoutRecordEntry.getLendingItem();				
				if ( borrower.equals(item)) {
					phoneNums.add(libraryMember.getPhone());
				}
			}

		}

		Collections.sort(phoneNums);
		return phoneNums;
	}
}
