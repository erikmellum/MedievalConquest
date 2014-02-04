import java.util.*;
public class Driver
{	
	public static void main (String [] args)
	{
		Item item = new Item();
		Character theCharacter = new Character();
		System.out.println(theCharacter.getAttribute("Health").getValue());
		Interface myFace = new Interface();
		myFace.go();
	}
}