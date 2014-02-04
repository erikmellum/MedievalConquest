/**
 * Dialogue is a class created to hold lists of dialogue as well as boolean flags to check if they have been read by 
 * the player or not. They will be used by all types of characters.
 *
 * @author Erik Mellum
 * @version 1.0
 * @date created 7/17/13
 * @last updated 7/17/13
 */
 
 
import java.util.*;
public class Dialogue
{
	protected String response;
	protected boolean check;
	/**
	 * Default constructor.
	 * Sets default values as follows:
	 * responses to default constructor for arraylists
	 * checks to default constructor for arraylists
	 * adds a single response and sets the boolean flag for it to false
	 */
	public Dialogue()
	{
		response = "Insert witty comment here";
		check = false;
	}
	public void setResponse(String newResponse)
	{
		response = newResponse;
	}
	public String getResponse()
	{
		return response;
	}
	public void setCheck(boolean newCheck)
	{
		check = newCheck;
	}
	public boolean getCheck()
	{
		return check;
	}
}