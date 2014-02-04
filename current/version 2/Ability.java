/**
 * Attacks is a class created for the purpose of giving weapons attacks with their own damage, name and accuracy 
 * It provides methods for setting and getting the damage name and accuracy.
 *
 * @author Erik Mellum
 * @version 1.0
 */

import java.util.HashMap;
import java.io.Serializable; 
public class Ability extends GameObject
{
	protected HashMap<String, GameObject> ability;
	protected GameList<String, Stat> stats;
	public Ability()
	{
		name = "Fireball";
		description = "Typical Mage Spell";		
		buildAbility();
	}
	public Ability(String newName, String newDescription)
	{
		name = newName;
		description = newDescription;;
		buildAbility();
	}
	public void buildAbility()
	{
		ability = object;
		stats = new GameList<String, Stat>();
		ability.put("Stats",stats);
		stats.put("Damage",new Stat("Damage",1));
		stats.put("Accuracy",new Stat("Accuracy",1));
		stats.put("Duration",new Stat("Duration",1));
		stats.put("Cooldown",new Stat("Cooldown",1));
		stats.put("Defense",new Stat("Defense",1));
		stats.put("Accuracy",new Stat("Accuracy",1));
		stats.put("Range",new Stat("Range",1));
		stats.put("Crit",new Stat("Crit",1));
		stats.put("Speed",new Stat("Speed",1));
		stats.put("Cost",new Stat("Cost",1));
		// stats.put("Required Skill",new Stat("Required Skill","Required Skill Level",1));
	}
	public String toString()
	{
		String output = name;
		return output;
	}
}