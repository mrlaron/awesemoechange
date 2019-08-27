package se.awesomoe.defect.api.bo;

import static org.junit.Assert.*;

import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import se.awesomoe.defetct.api.bo.Change;
import se.awesomoe.defetct.api.bo.Component;
import se.awesomoe.defetct.api.bo.Defect;
import se.awesomoe.defetct.api.bo.Program;
import se.awesomoe.defetct.api.bo.Request;
import se.awesomoe.defetct.api.bo.Severity;
import se.awesomoe.defetct.api.bo.Version;
//@Ignore
public class TestDefekt {

	/**
	 * Test Data
	 */
	Program program;
	Version version;
	Set<Component> components ;  
	Set<Version> versions ;


	@Before  
	public void setup() {

		version = new Version();
		version.setName("0.draft");
		version.setStartedDate(new Date());
		versions = new HashSet<Version>(0);

		components  =  new HashSet<Component>();

		Component comp = new Component();
		comp.setName("First");
		components.add(comp);
		version.setComponents(components);
		versions.add(version);


		program = new Program("testProg","app","testNameApp","used for testing", versions);

	}

	@Test
	public void testAddDefekt() {

		Defect defekt  = new Defect();
		defekt.setInformation("Bugg");
		defekt.setSeverity(Severity.LOW);
		defekt.setWorkaround("add layer");
		Iterator<Version>  iter = program.getVersions().iterator();
		Boolean found = false;
		while (iter.hasNext()) {
			Version type = (Version) iter.next();
			if (type.getName().equals("0.draft")){
				for (Component c :type.getComponents() ) {
					c.addDefect(defekt);
				}
				System.out.println(type.getComponents());
				found = true;
			}
		}

		assertTrue(found);		
	}

	@Test
	public void testAddRequest() {
		Request req  = new Request();
		req.setInformation("Bugg");
		req.setSeverity(Severity.LOW);
		req.setAgentNr("12234");
		req.setApproved(false);
		Iterator<Version>  iter = program.getVersions().iterator();
		Boolean found = false;
		while (iter.hasNext()) {
			Version type = (Version) iter.next();
			if (type.getName().equals("0.draft")){
				for (Component c :type.getComponents() ) {
					c.addRequest(req);
				}
				System.out.println(type.getComponents());
				found = true;
			}
		}

		assertTrue(found);		
	}

	@Test
	public void testAllChanges() {
		Request req  = new Request();
		req.setInformation("Add new feat");
		req.setSeverity(Severity.LOW);
		req.setAgentNr("2");
		req.setApproved(false);

		Defect defekt  = new Defect();
		defekt.setInformation("Bugg");
		defekt.setSeverity(Severity.LOW);
		defekt.setSeverity(Severity.LOW);
		defekt.setWorkaround("add layer");


		Iterator<Version>  iter = program.getVersions().iterator();


		Boolean found = false;
		while (iter.hasNext()) {
			Version type = (Version) iter.next();
			Component comp = new Component();
			comp.setName("First");

			Component  c = type.findComponent(comp);  	
			if (c !=null) {
				c.addRequest(req);
				c.addDefect(defekt);
				c.setupChanges();
				for (Change c1: c.getChanges() )
					c.changeType(c1);
				found = true;
			}
 
		}


		assertTrue(found);		
	}

}
