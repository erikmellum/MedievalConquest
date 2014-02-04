import java.util.HashMap; 
import java.io.Serializable;
public class NPC extends Character implements Serializable
{
	protected HashMap<String,HashMap> npc;
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
		stats.get("Level").setValue(newLevel);
	}
	public void buildCNPC()
	{
		npc = character;
	}
}