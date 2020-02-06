package se.awesomoe.defect.model;
/**
 * 
 * @author lars.g.mellberg
 *
 */
public class Defect extends Change {
	
	private boolean verified;
	private String workaround;
	 
	public Defect(){
		
	}
	 
	/**
	 * 
	 * @param verified
	 * @param workaround
	 */
	public Defect(boolean verified, String workaround) {
	 
		this.verified = verified;
		this.workaround = workaround;
	}
	
	/**
	 * 
	 * @return
	 */
	public String getWorkaround() {
		return workaround;
	}
	
	/**
	 * 
	 * @param workaround
	 */
	public void setWorkaround(String workaround) {
		this.workaround = workaround;
	}
	
	@Override
	public String toString() {
		return "Defect [verified=" + verified + ", workaround=" + workaround  ;
	}
	
	
 
	

}
