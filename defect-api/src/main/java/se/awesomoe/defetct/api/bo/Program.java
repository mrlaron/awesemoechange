package se.awesomoe.defetct.api.bo;

import java.util.HashSet;
import java.util.Set;

/**
 * 
 * @author lars.g.mellberg
 * 
 */
public class Program {
	
	private Long pid;
	private String title;
	private String type;
	private String name;
	private String description;
	private Set<Version> versions = new HashSet<Version>(0);

	/**
	 * 
	 */
	public Program() {

	}
	
	
	/**
	 * 
	 * @param title
	 * @param type
	 * @param name
	 * @param description
	 */
	public Program(String title, String type, String name, String description) {
		super();
		this.title = title;
		this.type = type;
		this.name = name;
		this.description = description;
		this.versions = versions;
		
	    	
	
	}

	/**
	 * 
	 * @param title
	 * @param type
	 * @param name
	 * @param description
	 * @param versions
	 */
	public Program(String title, String type, String name, String description,
			Set<Version> versions) {
		super();
		this.title = title;
		this.type = type;
		this.name = name;
		this.description = description;
		this.versions = versions;
	}

	
	
	
	public Long getPid() {
		return pid;
	}


	public void setPid(Long pid) {
		this.pid = pid;
	}


	public String getTitle() {
		return title;
	}

	/**
	 * 
	 * @param title
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	public String getName() {
		return name;
	}

	/**
	 * 
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	/**
	 * 
	 * @param description
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	public Set<Version> getVersions() {
		return versions;
	}

	
	public void addVersion (Version v) {
		this.versions.add(v);
	}
	
	/**
	 * 
	 * @param versions
	 */
	public void setVersions(Set<Version> versions) {
		this.versions = versions;
	}

	public String getType() {
		return type;
	}

	/**
	 * 
	 * @param type
	 */
	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Program [title=" + title + ", type=" + type + ", name=" + name
				+ ", description=" + description + ", versions=" + versions
				+ "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		result = prime * result
				+ ((versions == null) ? 0 : versions.hashCode());
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
		Program other = (Program) obj;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		if (versions == null) {
			if (other.versions != null)
				return false;
		} else if (!versions.equals(other.versions))
			return false;
		return true;
	}
	
	
	
	

}
