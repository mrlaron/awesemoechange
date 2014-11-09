package se.awesomoe.defetct.api.bo.internal;

import java.util.List;

import se.awesomoe.defetct.api.bo.Change;

/**
 * 
 * @author lars.g.mellberg
 *
 */
public interface ChangeRepository {

	public Change findChangebyId(String changeid);
	
	public List<Change> findChangesbyComponent(String compName);
	
}
