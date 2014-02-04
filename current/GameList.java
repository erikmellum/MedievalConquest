import java.util.HashMap;
import java.io.Serializable; 
public class GameList<T, V> extends GameObject
{

	protected HashMap<T, V> list;
	public GameList()
	{
		list = new  HashMap<T, V>();
	}
	public V get(T hashValue)
	{
		return list.get(hashValue);
	}
	public void put(T theKey,V theValue)
	{
		list.put(theKey,theValue);
	}
}