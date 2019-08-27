package se.awesomoe.defetct.api.bo;
/**
 * 
 * @author lars.g.mellberg
 *
 */
public class Request extends Change {
    private boolean approved;

    
    
	public Request() {
 	}

	public Request(boolean approved) {
 		this.approved = approved;
	}

	public boolean isApproved() {
		return approved;
	}

	public void setApproved(boolean approved) {
		this.approved = approved;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + (approved ? 1231 : 1237);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Request other = (Request) obj;
		if (approved != other.approved)
			return false;
		return true;
	}
    
	
	
	
	
	
}
