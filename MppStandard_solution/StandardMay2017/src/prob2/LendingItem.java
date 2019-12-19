package prob2;

public class LendingItem {
	private Integer numCopiesInLib;
	// Getters

	public Integer getNumCopiesInLib() {
		return numCopiesInLib;
	}
// setter
	public void setNumCopiesInLib(Integer numCopiesInLib) {
		this.numCopiesInLib = numCopiesInLib;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LendingItem other = (LendingItem) obj;
		if (numCopiesInLib == null) {
			if (other.numCopiesInLib != null)
				return false;
		} else if (!numCopiesInLib.equals(other.numCopiesInLib))
			return false;
		return true;
	}

 
	
	
	
	
}
