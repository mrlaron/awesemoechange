package se.awesomoe.defect.model;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
/**
 * 
 * @author lars.g.mellberg
 *
 */
public class Version {
	private String name;
	private Boolean realeaseStatus;
	private Date releaseDate;
	private Date startedDate;
	private Set<Component> components = new HashSet<>();
	
	
	public Version(){
		
	}
	
	/**
	 * 
	 * @param name
	 * @param realeaseStatus
	 * @param releaseDate
	 * @param startedDate
	 */
	public Version(String name, Boolean realeaseStatus, Date releaseDate,
			Date startedDate) {
		super();
		this.name = name;
		this.realeaseStatus = realeaseStatus;
		this.releaseDate = releaseDate;
		this.startedDate = startedDate;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Boolean getRealeaseStatus() {
		return realeaseStatus;
	}
	public void setRealeaseStatus(Boolean realeaseStatus) {
		this.realeaseStatus = realeaseStatus;
	}
	public Date getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}
	public Date getStartedDate() {
		return startedDate;
	}
	public void setStartedDate(Date startedDate) {
		this.startedDate = startedDate;
	}

	public Set<Component> getComponents() {
		return components;
	}

	public Component findComponent(Component comp) {
		boolean found  = components.contains(comp);
		if (found){
			return comp;
		}
		return null;
	}
	
	public void setComponents(Set<Component> components) {
		this.components = components;
	}

    /**
     * 
     * @param comp
     */
	public void addComponent(Component comp) {
		this.components.add(comp);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((components == null) ? 0 : components.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result
				+ ((realeaseStatus == null) ? 0 : realeaseStatus.hashCode());
		result = prime * result
				+ ((releaseDate == null) ? 0 : releaseDate.hashCode());
		result = prime * result
				+ ((startedDate == null) ? 0 : startedDate.hashCode());
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
		Version other = (Version) obj;
		if (components == null) {
			if (other.components != null)
				return false;
		} else if (!components.equals(other.components))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (realeaseStatus == null) {
			if (other.realeaseStatus != null)
				return false;
		} else if (!realeaseStatus.equals(other.realeaseStatus))
			return false;
		if (releaseDate == null) {
			if (other.releaseDate != null)
				return false;
		} else if (!releaseDate.equals(other.releaseDate))
			return false;
		if (startedDate == null) {
			if (other.startedDate != null)
				return false;
		} else if (!startedDate.equals(other.startedDate))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Version [name=" + name + ", realeaseStatus=" + realeaseStatus
				+ ", releaseDate=" + releaseDate + ", startedDate="
				+ startedDate + ", components=" + components + "]";
	}
	
	
	

	
	
	
	

}
