package se.awesomoe.defect.model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;


public class Component {
	private Long id;
	private String name;

	private Set<Defect> defects = new HashSet<Defect>(0);
	private Set<Request> requests = new HashSet<Request>(0);
	private List<Change>	lit = new ArrayList<Change>(0);




	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setupChanges(){
		addDefectToList(defects.iterator());
		addRequestToList(requests.iterator());
	 
	}

  public List<Change> getChanges() {
        return lit;	          
	  
  }
	 

	private void addRequestToList (Iterator<Request> rit) {
		while (rit.hasNext()) {
			lit.add(rit.next());

		}
	}

	private void addDefectToList(Iterator<Defect> it) {
		while (it.hasNext()) {
			lit.add(it.next());
		}
	}

	public void changeType(Change ch) {
		if (ch instanceof Defect) {
			System.out.println( "Defect " + ((Defect)ch).getWorkaround() + " " + ch.getInformation() );
		}
		if (ch instanceof Request) {
			System.out.println( "Request " + ((Request)ch).isApproved()   + " " + ch.getInformation() );
		}

	}


	public Set<Defect> getDefects() {
		return defects;
	}

	public void setDefects(Set<Defect> defects) {
		this.defects = defects;
	}

	public Set<Request> getRequests() {
		return requests;
	}

	public void setRequests(Set<Request> requests) {
		this.requests = requests;
	}

	/**
	 * 
	 * @param ch
	 */
	public void addDefect(Defect ch) {
		defects.add((Defect) ch);

	}
	public void addRequest(Request ch) {
		requests.add((Request) ch);

	}




	@Override
	public String toString() {
		return "Component [id=" + id + ", name=" + name + ", defects="
				+ defects + ", requests=" + requests + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((defects == null) ? 0 : defects.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result
				+ ((requests == null) ? 0 : requests.hashCode());
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
		Component other = (Component) obj;
		if (defects == null) {
			if (other.defects != null)
				return false;
		} else if (!defects.equals(other.defects))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (requests == null) {
			if (other.requests != null)
				return false;
		} else if (!requests.equals(other.requests))
			return false;
		return true;
	}















}
