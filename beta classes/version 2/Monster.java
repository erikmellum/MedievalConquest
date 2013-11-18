import java.util.HashMap; 
import java.io.Serializable;
public class Monster extends Character implements Serializable
{
	protected HashMap<String,GameObject> monster;
	public Monster()
	{
		name = "Monster";
		description = "Fangs and Claws Galore";
		number = 1;
		buildMonster();
	}
	public Monster(String newName, String newDescription)
	{
		name = newName;
		description = newDescription;
		number = 1;
		buildMonster();
	}
	public Monster(String newName, newLevel)
	{
		name = newName;
		description = newDescription;
		number = 1;
		buildMonster();
		stats.lget("Level")).setValue(newLevel);
	}
	public void buildMonster()
	{
		monster = character;
	}
}