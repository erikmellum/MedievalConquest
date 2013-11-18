import java.util.*;
public class Driver
{	
	public static void main (String [] args)
	{
		Item item = new Item();
		Character theCharacter = new Character();
		System.out.println(theCharacter.get("Attributes").get("Health"));
	}
}