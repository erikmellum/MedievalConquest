/**
* Stats
* Items
* BodyParts
* Attributes
* Abilities
* Skills
* Effects
* Quests
* Weapons
* Armors
* 
*
*
*
**/
import java.util.HashMap;
import java.io.Serializable;
public class Character extends GameObject
{
	protected HashMap<String, GameObject> character;
	protected GameList<String, BodyPart> bodyParts;
	protected GameList<String, Weapon> weapons;
	protected GameList<String, Armor> armors;
	protected GameList<String, Attribute> attributes;
	protected GameList<String, Skill> skills;
	protected GameList<String, Effect> effects;
	protected GameList<String, Stat> stats;
	protected GameList<String, Ability> abilities;
	protected GameList<String, Quest> quests;
	protected GameList<String, Item> items;
	public Character()
	{
		name = "Greg";
		description = "Just a regular guy living in a binary world";
		buildCharacter();
	}
	public Character(String newName, String newDescription)
	{
		name = newName;
		description = newDescription;
		buildCharacter();
	}
	public void buildCharacter()
	{
		character = new HashMap<String, GameObject>();
		bodyParts = new GameList<String, BodyPart>();
		weapons = new GameList<String, Weapon>();
		armors = new GameList<String, Armor>();
		attributes = new GameList<String, Attribute>();
		skills = new GameList<String, Skill>();
		effects = new GameList<String, Effect>();
		stats = new GameList<String, Stat>();
		abilities = new GameList<String, Ability>();
		quests = new GameList<String, Quest>();
		items = new GameList<String, Item>();
		character.put("Body Parts",bodyParts);
		character.put("Weapons",weapons);
		character.put("Armors",armors);
		character.put("Attributes",attributes);
		character.put("Skills",skills);
		character.put("Effects",effects);
		character.put("Stats",stats);
		character.put("Abilities",abilities);
		character.put("Quests",quests);
		character.put("Items",items);
		skills.put("Level", new Skill("Level","Overall Level",1));
		items.put("Coins",new Item("Coins","Your Money"));
		bodyParts.put("Head",new BodyPart("Head"));
		bodyParts.put("Chest",new BodyPart("Chest"));
		bodyParts.put("Legs",new BodyPart("Legs"));
		bodyParts.put("Feet",new BodyPart("Feet"));
		bodyParts.put("Arms",new BodyPart("Arms"));
		bodyParts.put("Waist",new BodyPart("Waist"));
		bodyParts.put("Left Finger",new BodyPart("Left Finger"));
		bodyParts.put("Right Finger",new BodyPart("Right Finger"));
		bodyParts.put("Hands",new BodyPart("Hands"));
		bodyParts.put("Back",new BodyPart("Back"));
		bodyParts.put("Shoulders",new BodyPart("Shoulders"));
		bodyParts.put("Neck",new BodyPart("Neck"));
		bodyParts.put("Accessory",new BodyPart("Accessory"));
		bodyParts.put("Left Hand",new BodyPart("Left Hand"));
		bodyParts.put("Right Hand",new BodyPart("Right Hand"));
		bodyParts.put("Two Hand",new BodyPart("Two Hand"));
		attributes.put("Health",new Attribute("Health","Your hit points",1,10));
		attributes.put("Mana",new Attribute("Mana","Magic casting resource",1,10));
		attributes.put("Energy",new Attribute("Energy","Physical ability resource",1,10));
		attributes.put("Power",new Attribute("Power","Damage with attacks",1,1));
		attributes.put("Accuracy",new Attribute("Accuracy","Chance to hit",1,1));
		attributes.put("Toughness",new Attribute("Toughness","Health regeneration / Physical damage reduction",1,1));
		attributes.put("Dexterity",new Attribute("Dexterity","Energy regeneration / Dodge chance",1,1));
		attributes.put("Speed",new Attribute("Speed","Global cooldowns",1,1));
		attributes.put("Stealth",new Attribute("Stealth","Ability to remain hidden",1,1));
		attributes.put("Concentration",new Attribute("Concentration","Mana regeneration / magical resistance",1,1));
		attributes.put("Crit",new Attribute("Crit","Chance to hit criticals",1,1));
		
		//effects
		//abilities
		//inventory
		//dialogue
	}
	//getResponse

}