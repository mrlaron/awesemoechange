package se.awesomoe.defect.api.bo.repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import se.awesomoe.defect.model.Change;
import se.awesomoe.defect.model.Component;
import se.awesomoe.defect.model.Defect;
import se.awesomoe.defect.model.Request;
import se.awesomoe.defect.model.Severity;
import se.awesomoe.defect.model.internal.ChangeRepository;

public class StubChangeRepository implements ChangeRepository {
	
	private Map<String, Change> changeByChangeId = new HashMap<String, Change>(); 
	 
	public StubChangeRepository(){
		
		Component comp = new Component();
		comp.setId(1L);
		comp.setName("First");
	
		
		
	   	   Request req = new Request();
	 		req.setAgentNr("1234");
 		    req.setInformation("Bugg");
			req.setSeverity(Severity.LOW);
 			req.setApproved(false);
 			req.setComponent(comp);
 			changeByChangeId.put("1234",req);
	 		Defect defekt  = new Defect();
			defekt.setInformation("Bugg");
			defekt.setSeverity(Severity.LOW);
			defekt.setWorkaround("add layer");
			defekt.setComponent(comp);

			changeByChangeId.put("1235",defekt);
			
			
	}
	

	@Override
	public Change findChangebyId(String changeid) {
		// TODO Auto-generated method stub
		return changeByChangeId.get(changeid);
	}

	@Override
	public List<Change> findChangesbyComponent(String compName) {
		// TODO Auto-generated method stub
		return null;
	}

}
