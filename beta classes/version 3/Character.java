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
    protected GameList<String, GameList> character;
	protected GameList<String, Weapon> weapons;
	protected GameList<String, Armor> armors;
	protected GameList<String, Attribute> attributes;
	protected GameList<String, Skill> skills;
	protected GameList<String, Effect> effects;
	protected GameList<String, Stat> stats;
	protected GameList<String, Ability> abilities;
	protected GameList<String, Quest> quests;
	protected GameList<String, Item> items;
    protected GameList<String, Response> responses;
    protected GameList<String, Implant> implants;
    
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
        character = new GameList<String, GameList>();
        responses = new GameList<String, Response>();
		weapons = new GameList<String, Weapon>();
		armors = new GameList<String, Armor>();
		attributes = new GameList<String, Attribute>();
		skills = new GameList<String, Skill>();
		effects = new GameList<String, Effect>();
		stats = new GameList<String, Stat>();
		abilities = new GameList<String, Ability>();
		quests = new GameList<String, Quest>();
		items = new GameList<String, Item>();
        implants = new GameList<String, Implant>();
		character.put("Weapons",weapons);
		character.put("Armors",armors);
		character.put("Attributes",attributes);
		character.put("Skills",skills);
		character.put("Effects",effects);
		character.put("Stats",stats);
		character.put("Abilities",abilities);
		character.put("Quests",quests);
		character.put("Items",items);
        character.put("Responses",responses);
        character.put("Implants",implants);
		skills.put("Level", new Skill("Level","Overall Level",1));
		items.put("Coins",new Item("Coins","Your Money"));
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
        attributes.put("Vision",new Attribute("Vision","View Distance",1,1));
        attributes.put("Hearing",new Attribute("Hearing","Ear range",1,1));
        attributes.put("Smell",new Attribute("Smell","Smell Distance",1,1));
        attributes.put("Temperature",new Attribute("Temperature","Current Temperature",1,1));
        attributes.put("Hunger",new Attribute("Hunger","Hunger Levels",1,1));
        attributes.put("Thirst",new Attribute("Thirst","Amount of thirstiness",1,1));
		
		//effects
		//abilities
		//inventory
		//dialogue
	}
	//getResponse
    public GameList get(String key)
    {
        return character.get(key);
    }
    public Weapon getWeapon(String key)
    {
        return weapons.get(key);
    }
    public void setWeapon(String key, Weapon newWeapon)
    {
        weapons.put(key,newWeapon);
    }
    public Armor getArmor(String key)
    {
        return armors.get(key);
    }
    public void setArmor(String key, Armor newArmor)
    {
        armors.put(key,newArmor);
    }
    public Attribute getAttribute(String key)
    {
        return attributes.get(key);
    }
    public Skill getSkill(String key)
    {
        return skills.get(key);
    }
    public Stat getStat(String key)
    {
        return stats.get(key);
    }
    public Ability getAbility(String key)
    {
        return abilities.get(key);
    }
    public Quest getQuest(String key)
    {
        return quests.get(key);
    }
    public Item getItem(String key)
    {
        return items.get(key);
    }
    public Effect getEffect(String key)
    {
        return effects.get(key);
    }
    public Response getResponse(String key)
    {
        return responses.get(key);
    }
}