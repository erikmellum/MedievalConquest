/**
 * Store is-a Room that has a trader set into it by default. This allows the user to buy and sell within the store at all times.
 * It provides only default constructors, all methods are inherited from Room.
 *
 * @author Erik Mellum
 * @version 1.0
 */
import java.util.ArrayList;
import java.io.Serializable;
public class Store extends Room implements Serializable
{
	Trader theTrader;
	/**
	* Default Constructor.
	* Sets the store name to Store
	* Creates a new Trader for the room
	* Creates a new list of Characters for the room
	* Sets the connections of the room to be null
	* Creates a new list of items in the room
	* Creates a new list of characters in the room and adds the Trader to it
	*
	*/
	public Store()
	{
		name = "Store";
		description = "Buy and sell here";
		theTrader = new Trader();
		characters = new ArrayList<Character>();
		northRoom = null;
		southRoom = null;
		eastRoom = null;
		westRoom = null;
		roomNumber = 13;
		items = new ArrayList<Item>();
		characters = new ArrayList<Character>();
		characters.add(theTrader);
	}
}