import java.util.HashMap; 
import java.io.Serializable;
public class Tile extends GameObject
{
	protected GameList<String, GameList> tile;
	protected GameList<String, Item> items;
	protected GameList<String, Character> characters;
	protected Tile northTile;
	protected Tile southTile;
	protected Tile eastTile;
	protected Tile westTile;
	 /**
	 * Default constructor.
	 * Sets default values as follows:
	 */
	public Tile()
	{
		name = "Purgatory";
		description = "Not much to do except think";
		number = 0;
		bool = false;		
		createTile();
	}
	public Tile(String newName, String newDescription, Tile newNorthTile, Tile newSouthTile, Tile newEastTile, Tile newWestTile)
	{
		name = newName;
		description = newDescription;
		northTile = newNorthTile;
		southTile = newSouthTile;
		eastTile = newEastTile;
		westTile = newWestTile;
		number = 0;
		bool = false;		
		createTile();
	}
	public void createTile()
	{
		tile = new GameList<String, GameList>;;
		items = new GameList<String, Item>;
		characters = new GameList<String, Character>;
		tile.put("Items",items);
		tile.put("Characters",characters);
		items.put("Bronze Dagger",new Weapon("Bronze Dagger","Left Hand"));
		items.put("Iron Chest",new Armor("Iron Chest","Chest"));
		characters.put("Boo Radley",new Character("Boo Radley","Rarely leaves the house"));
	}
	public void setNorthTile(Tile theTile)
	{
		northTile = theTile;
	}
	public Tile getNorthTile()
	{
		return northTile;
	}
	public void setSouthTile(Tile theTile)
	{
		southTile = theTile;
	}
	public Tile getSouthTile()
	{
		return southTile;
	}
	public void setEastTile(Tile theTile)
	{
		eastTile = theTile;
	} 
	public Tile getEastTile()
	{
		return eastTile;
	}
	public void setWestTile(Tile theTile)
	{
		westTile = theTile;
	}
	public Tile getWestTile()
	{
		return westTile;
	}
	public String toString()
	{
		String output = name + ": " + description + "\n";
		return output;
	}
}