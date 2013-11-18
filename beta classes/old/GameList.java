public class GameList<T>
{
	T[] theList;
	public GameList(int size)
	{
		theList = new T[size];
	}
	public GameObject parseList(String objectName)
	{
		for(int i = 0; i < theList.length; i++)
			if(theList[i].getName() == objectName)
				return theList[i];
		return null;
	}
}