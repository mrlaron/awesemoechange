package se.awesomoe.common;

/**
 * Created by IntelliJ IDEA.
 * AdminUser: lars.g.mellberg
 * Date: 2012-07-25
 * Time: 01:45
 * To change this template use File | Settings | File Templates.
 */
public class DefektException
	extends Exception
{
	private static final long serialVersionUID = 7153316082443250953L;

	public DefektException(String message)
	{
		super(message);
	}

	public DefektException(String message, Throwable cause)
	{
		super(message, cause);
	}
}
