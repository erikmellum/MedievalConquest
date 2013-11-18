/**
 * Attribute is a class created to allow the user in the game world to have core attributes such as
 * health, accuracy, or strength. This Attribute Class provides the capability to give String names and descriptions
 * and integers for variables such as maxPoints (ex. max hit points), points (ex. current hit points), experience,
 * experienceNeeded and level (in case this attribute has leveling capabilites).
 * @author Erik Mellum
 * @version 1.0
 * @date created 7/17/13
 * @last updated 7/17/13
 */
 import java.io.Serializable;
import java.util.HashMap; 
public class Attribute extends Skill
{
	public Attribute()
	{
		name = "Health";
		description = "Your health points";
		buildAttribute();
	}

	public Attribute(String newName, String newDescription, int newLevel, int newMaxPoints)
	{
		name = newName;
		description = newDescription;
		buildAttribute();
		stats.get("Level").setValue(newLevel);
		stats.get("Points").setValue(newMaxPoints);
		stats.get("Max Points").setValue(newMaxPoints);
	}
	public void buildAttribute()
	{
		stats.get("Level").setValue(1);
		stats.get("Current Experience").setValue(0);
		stats.get("Experience Needed").setValue(10);
		stats.put("Points",new Stat("Points",10));
		stats.put("Max Points",new Stat("Max Points",10));
		stats.put("Regeneration Rate",new Stat("Regeneration Rate",1));
	}
}