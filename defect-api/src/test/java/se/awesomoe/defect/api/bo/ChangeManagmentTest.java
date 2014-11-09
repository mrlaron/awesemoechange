package se.awesomoe.defect.api.bo;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import se.awesomoe.defect.api.bo.repository.StubChangeRepository;
import se.awesomoe.defetct.api.bo.Change;
import se.awesomoe.defetct.api.bo.Defect;
import se.awesomoe.defetct.api.bo.Request;

public class ChangeManagmentTest {

	StubChangeRepository changeReStub;
	
	@Before
	public void setUp() throws Exception {
	
		changeReStub = new StubChangeRepository();
		
		
	}

	@Test
	public void test() {
		Change ch = changeReStub.findChangebyId("1235");
		if (ch instanceof Defect) {
			System.out.println( "Defect " + ((Defect)ch).getWorkaround() + " " + ch.getInformation() );
		}
		  ch=  changeReStub.findChangebyId("1234");
		  System.out.println(ch.getComponent());
		
		if (ch instanceof Request) {
			System.out.println( "Request " + ((Request)ch).isApproved()   + " " + ch.getInformation() );
		}
		  System.out.println(ch.getComponent());
		
		
		fail("Not yet implemented");
	}

}
