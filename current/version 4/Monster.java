import java.util.HashMap; 
import java.io.Serializable;
public class Monster extends Character implements Serializable
{
	protected HashMap<String,HashMap> monster;
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
		stats.get("Level")).setValue(newLevel);
	}
	public void buildMonster()
	{
		monster = character;
	}
}