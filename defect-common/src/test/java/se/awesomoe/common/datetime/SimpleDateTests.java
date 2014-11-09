package se.awesomoe.common.datetime;

import static org.junit.Assert.assertEquals;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import org.junit.Test;
/**
 * 
 * @author lars.g.mellberg
 *
 */
public class SimpleDateTests {
     
	@Test 
	public void testToday()  {
		SimpleDate today  = SimpleDate.today( );
		Calendar cal = new GregorianCalendar();
		cal.set(Calendar.HOUR_OF_DAY,0);
		cal.set(Calendar.MINUTE,0);
		cal.set(Calendar.SECOND,0);
		cal.set(Calendar.MILLISECOND,0);
		System.out.println("testToday");
		
		System.out.println(" today " + today.asDate() );
		System.out.println(" cal " + cal.getTime() );
		assertEquals(today.asDate(),cal.getTime());
 	}
	
	@Test 
	public void testValueOfDate() {
		SimpleDate today  = SimpleDate.today( );
		Date date = today.asDate();
		SimpleDate today2  = SimpleDate.valueOf(date);
		System.out.println("testValueOfDate");
		
		System.out.println(" today " + today.asDate() );
		System.out.println(" today2 " + today2.asDate() );
	
		
		assertEquals(today ,today2);
		
	}
}
