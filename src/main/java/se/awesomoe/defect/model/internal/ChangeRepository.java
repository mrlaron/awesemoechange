package se.awesomoe.defect.model.internal;

import java.util.List;

import se.awesomoe.defect.model.Change;

/**
 * 
 * @author lars.g.mellberg
 *
 */
public interface ChangeRepository {

	public Change findChangebyId(String changeid);
	
	public List<Change> findChangesbyComponent(String compName);
	
}
