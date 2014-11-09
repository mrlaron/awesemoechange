package se.awesomoe.defetct.api.bo;

import java.util.Set;

/**
 * 
 * @author lars.g.mellberg
 * 
 */
public class Developer  extends Person {
	private String email;
	private Developer supervicor;
	private Set<Developer> devlopers;

	public Developer() {

	}

	public Developer(String email) {

		this.email = email;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Developer getSupervicor() {
		return supervicor;
	}

	public void setSupervicor(Developer supervicor) {
		this.supervicor = supervicor;
	}

	public Set<Developer> getDevlopers() {
		return devlopers;
	}

	public void setDevlopers(Set<Developer> devlopers) {
		this.devlopers = devlopers;
	}

}
