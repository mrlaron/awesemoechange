package se.awesomoe.defect.api.bo;

import static org.junit.Assert.*;

import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;

import se.awesomoe.defect.model.Component;
import se.awesomoe.defect.model.Program;
import se.awesomoe.defect.model.Version;

public class TestComponents {

	Program prog;
	Version vers;
	Component comp;
	Set<Version> versions ;
	Set<Component> components ;  

	@Before 
	public void before() {

		vers = new Version();
		vers.setName("0.draft");
		vers.setStartedDate(new Date());
		versions = new HashSet<Version>(0);

		components  =  new HashSet<Component>();

		Component comp = new Component();
		comp.setName("First");
		components.add(comp);
		vers.setComponents(components);
		versions.add(vers);


		prog = new Program("testProg","app","testNameApp","used for testing", versions);


	}

	@Test
	public void findComp() {
		Component comp1 = new Component();
		comp1.setName("Second");
		components = vers.getComponents();
		components.add(comp1);
		vers.setComponents(components);
		prog.addVersion(vers);
		
    	Set<Version> versions2  = prog.getVersions();
    	Boolean found = false;
    	Iterator<Version> itr= versions2.iterator();
    	 while (itr.hasNext()){
    		 Version ver = itr.next();
    		 if (ver.getComponents().contains(comp1)) {
    			 found = true;
    		   break;
    		 }
    	 }
    	 assertTrue(found);  
		
		
 	}

	@Test
	public void dontFindComp() {
		Component comp1 = new Component();
		comp1.setName("Second");
		vers.addComponent(comp1);
	 	
		
         System.out.println(vers); 
         System.out.println(prog); 
     	Component comp3 = new Component();
    	
     	comp3.setName("Third");
    	vers.addComponent(comp3);
    	   
     	System.out.println(prog); 
       	
         
         Component comp2 = new Component();
		comp1.setName("First");
    	Boolean found = false;
    	Iterator<Version> itr= prog.getVersions().iterator();
    	 while (itr.hasNext()){
    		 Version ver = itr.next();
    		 if (ver.getComponents().contains(comp2)) {
    			 found = true;
    		   break;
    		 }
    	 }
    	 
    	 assertFalse(found);  
		
		
 	}

}
