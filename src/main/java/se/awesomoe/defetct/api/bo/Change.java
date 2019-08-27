package se.awesomoe.defetct.api.bo;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
/**
 * This class stores  the general information about a change 
 *  
 * @author lars.g.mellberg
 *
 */
public class Change {
	private Long id; 
	
	private String information;
	private Date createdDate;
	private Date finishedDate;
	private Severity severity;
    private String agentNr;
    private  Component component;  
    /**
     * 
     */
    public Change(){
    	
    }
   /**
    * 
    * @param id
    * @param information
    * @param createdDate
    * @param finishedDate
    * @param severity
    * @param agentNr
    * @param component
    */
	public Change(Long id, String information, Date createdDate,
			Date finishedDate, Severity severity, String agentNr,
			Component component) {
	 	this.id = id;
		this.information = information;
		this.createdDate = createdDate;
		this.finishedDate = finishedDate;
		this.severity = severity;
		this.agentNr = agentNr;
		this.component = component;
	}
	
	public Component getComponent() {
		return component;
	}
	/**
	 * 
	 * @param component
	 */
	public void setComponent(Component component) {
		this.component = component;
	}
	public Long getId() {
		return id;
	}
	/**
	 * 
	 * @param id
	 */
	public void setId(Long id) {
		this.id = id;
	}
	public String getInformation() {
		return information;
	}
	/**
	 * 
	 * @param information
	 */
	public void setInformation(String information) {
		this.information = information;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	public Date getFinishedDate() {
		return finishedDate;
	}
	public void setFinishedDate(Date finishedDate) {
		this.finishedDate = finishedDate;
	}
	public Severity getSeverity() {
		return severity;
	}
	public void setSeverity(Severity severity) {
		this.severity = severity;
	}
	
	
	
	
	
	public String getAgentNr() {
		return agentNr;
	}
	
	
	public void setAgentNr(String agentNr) {
		this.agentNr = agentNr;
	}
	@Override
	public String toString() {
		return "Change [information=" + information + ", createdDate="
				+ createdDate + ", finishedDate=" + finishedDate
				+ ", severity=" + severity + ", agentNr=" + agentNr + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((agentNr == null) ? 0 : agentNr.hashCode());
		result = prime * result
				+ ((createdDate == null) ? 0 : createdDate.hashCode());
		result = prime * result
				+ ((finishedDate == null) ? 0 : finishedDate.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result
				+ ((information == null) ? 0 : information.hashCode());
		result = prime * result
				+ ((severity == null) ? 0 : severity.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Change other = (Change) obj;
		if (agentNr == null) {
			if (other.agentNr != null)
				return false;
		} else if (!agentNr.equals(other.agentNr))
			return false;
		if (createdDate == null) {
			if (other.createdDate != null)
				return false;
		} else if (!createdDate.equals(other.createdDate))
			return false;
		if (finishedDate == null) {
			if (other.finishedDate != null)
				return false;
		} else if (!finishedDate.equals(other.finishedDate))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (information == null) {
			if (other.information != null)
				return false;
		} else if (!information.equals(other.information))
			return false;
		if (severity != other.severity)
			return false;
		return true;
	}
	
	
	 
	
	
	

}
