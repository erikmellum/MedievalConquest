/**
 * Key is-a Item created for the purpose of creating unlocking rooms in the game world. 
 * It provides methods for getting and setting the name of the key and the lock it corresponds to.
 *
 * @author Erik Mellum
 * @version 1.0
 */
 
import java.io.Serializable;
public class Key extends Item implements Serializable
{
	private int lockNumber;
	/**
	 * Default constructor.
	 * Sets default values as follows:
	 * name as key
	 * lockNumber as 0
	 */
	public Key()
	{
		name = "Key";
		lockNumber = 0;
	}
	/**
	 * Overloaded constructor.
	 * Sets lockNumber to newLockNumber:
	 */
	public Key(int newLockNumber)
	{
		name = "Key";
		lockNumber = newLockNumber;
	}
	/**
	 * Gets the lockNumber of the Key.
	 *
	 * @return lockNumber the key's lock number 
	 */
	public int getLockNumber()
	{
		return lockNumber;
	}
	/**
	 * Set the value of the lockNumber to a new value.
	 *
	 * @param newLockNumber the new lock number. 
	 */
	public void setLockNumber(int newLockNumber)
	{
		lockNumber = newLockNumber;
	}
	/**
	 * Gets the name of the Key.
	 *
	 * @return name the name of the key 
	 */
	public String getName()
	{
		return name;
	}
	/**
	 * Sets the name of the Key.
	 *
	 * @param name the name of the key 
	 */
	public void setName(String newName)
	{
		name = newName;
	}
	/**
	 * Returns a string containing all of the information about this Key
	 *
	 */
	public String toString()
	{
		return name;
	}
}