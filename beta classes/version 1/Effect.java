import java.util.*;
public class Effect extends GameObject
{
	protected HashMap<String, GameObject> effect;
	protected GameList<String, Stat> stats;
	public Effect(String newName, String newDescription)
	{
		name = newName;
		description = newDescription;
		buildEffect();
	}
	public void buildEffect()
	{		
		effect = object;
		stats = new GameList<String, Stat>();
		effect.put("Stats",stats);
		stats.put("Duration",new Stat("Duration",1));
		stats.put("Cooldown",new Stat("Frequency",1));
		stats.put("Type",new Stat("Type",1));
	}
}