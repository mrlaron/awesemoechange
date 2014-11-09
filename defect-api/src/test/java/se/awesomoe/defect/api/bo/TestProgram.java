package se.awesomoe.defect.api.bo;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runners.Parameterized.Parameters;

import se.awesomoe.defetct.api.bo.Developer;
import se.awesomoe.defetct.api.bo.Program;
import se.awesomoe.defetct.api.bo.Version;
/**
 * The purpose of these tests is to verify the relationships and logic of the 
 * Program. 
 * @author lars.g.mellberg
 *
 */
 
 public class TestProgram {

	/*
	 * Local test parameters
	 */
	Program prog;
	Program prog2;
	
	Developer dev;
	
//	@Parameters
	//publ
	
	@Before
	public void before() {
		prog = new Program(); 
		prog.setPid(1L);
	    prog.setDescription("Thanks for the opportunity!" +
                  "The Acando Google Cloud Platform Team");
       prog.setName("Google DTS");
       prog.setTitle("DTS");
       prog.setType("*.exe ");

	}
	
	@Test
	public void test() {
	        
	      
	      Version ver = new Version();
	      ver.setName("0.draft");
	      ver.setStartedDate(new Date());
	      prog.addVersion( ver);
	      
	      System.out.println(prog);
	      
	      
	      assertFalse(prog.getVersions().isEmpty());
	      
	      
	      
	}
	
	@Test
	public void compareProgram() {
		prog2 = new Program(); 
		prog2.setPid(1L);
	    prog2.setDescription("Thanks for the opportunity!" +
                  "The Acando Google Cloud Platform Team");
        prog2.setName("Google DTS");
        prog2.setTitle("DTS");
        prog2.setType("*.exe ");
	      
	      Version ver = new Version();
	      ver.setName("0.draft");
	      ver.setStartedDate(new Date());
	      prog.addVersion( ver);
		  
	      prog2.addVersion( ver);
	      
	      
	      System.out.println(prog2);
	      
	      assertTrue(prog.equals(prog2));
	      
	      assertEquals(prog,prog2);
	      
	      
	}

}
