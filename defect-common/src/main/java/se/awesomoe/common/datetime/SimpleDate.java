package se.awesomoe.common.datetime;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * A simple wrapper around a calendar for working with dates like 12/22/2014.
 * Does not consider time.
 * 
 * @author lars.g.mellberg
 * 
 */
public class SimpleDate implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3457487716495930581L;

	private GregorianCalendar base;

	
	
	private SimpleDate() {
		init(new GregorianCalendar());
	}
	/**
	 * 
	 * @param month
	 * @param day
	 * @param year
	 */
	public SimpleDate(int month, int day, int year) {
		init(new GregorianCalendar(year, month, day));
	}

	/**
	 * 
	 * @param time
	 */
	public SimpleDate(long time) {
		GregorianCalendar cal = new GregorianCalendar();
		cal.setTimeInMillis(time);
		init(cal);
		

	   
	}
	/**
	 * 
	 * @param cal
	 */
	private void init(GregorianCalendar cal) {
		this.base = trimToDays(cal);
	}

	/**
	 * 
	 * @param cal
	 * @return
	 */
	private GregorianCalendar trimToDays(GregorianCalendar cal) {
		cal.set(Calendar.HOUR_OF_DAY, 0);
		cal.set(Calendar.MINUTE, 0);
		cal.set(Calendar.SECOND, 0);
		cal.set(Calendar.MILLISECOND, 0);
		return cal;

	}

	
	
	/**
	 * 
	 * @return
	 */
	public long inMilliseconds() {
		 return asDate().getTime();
	}
	
	/**
	 * Returns this simple date as a <code>java.utils.Date </date>
	 * 
	 * @return
	 */
    public Date asDate(){
    	return base.getTime();
    }

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((base == null) ? 0 : base.hashCode());
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
		SimpleDate other = (SimpleDate) obj;
		if (base == null) {
			if (other.base != null)
				return false;
		} else if (!base.equals(other.base))
			return false;
		return true;
	}
    
	
	
	public static SimpleDate today() {
		return new SimpleDate();
	}
	
	/**
	 * 
	 * @param date
	 * @return
	 */
	public static SimpleDate valueOf(Date date) {
		 return valueOf(date.getTime());
	}
	
	/**
	 * 
	 * @param time
	 * @return
	 */
    public static SimpleDate valueOf(long time) {
		// TODO Auto-generated method stub
		return new SimpleDate(time);
	}
	/**
     * 
     * @param date
     * @return
     */
    public int compareTo(Object date) {
    	SimpleDate other  = (SimpleDate) date;
    	return asDate().compareTo(other.asDate());
    }

    
}
