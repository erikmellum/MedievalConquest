import java.util.HashMap; 
import java.io.Serializable;
public class NPC extends Character implements Serializable
{
	protected HashMap<String,GameObject> npc;
	public NPC()
	{
		name = "Character";
		description = "Fangs and Claws Galore";
		number = 1;
		buildCharacter();
	}
	public NPC(String newName, String newDescription)
	{
		name = newName;
		description = newDescription;
		number = 1;
		buildCharacter();
	}
	public NPC(String newName, newLevel)
	{
		name = newName;
		description = newDescription;
		number = 1;
		buildCharacter();
		stats.lget("Level").setValue(newLevel);
	}
	public void buildCNPC()
	{
		npc = character;
	}
}