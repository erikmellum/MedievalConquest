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
    protected HashMap<String, HashMap> character;
	protected HashMap<String, Weapon> weapons;
	protected HashMap<String, Armor> armors;
	protected HashMap<String, Attribute> attributes;
	protected HashMap<String, Skill> skills;
	protected HashMap<String, Effect> effects;
	protected HashMap<String, Stat> stats;
	protected HashMap<String, Ability> abilities;
	protected HashMap<String, Quest> quests;
	protected HashMap<String, Item> items;
    protected HashMap<String, Response> responses;
    protected HashMap<String, Implant> implants;
    
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
    public Character(String newName, String newDescription, HashMap<String, Weapon> newWeapons, HashMap<String, Armor> newArmors, HashMap<String, Response> newResponses, HashMap<String, Attribute> newAttributes, HashMap<String, Skill> newSkills, HashMap<String, Effect> newEffects, HashMap<String, Stat> newStats, HashMap<String, Ability> newAbilities, HashMap<String, Quest> newQuests, HashMap<String, Item> newItems, HashMap<String, Implant> newImplants, int level, int coins, int health, int mana, int energy, int power, int accuracy, int toughness, int dexterity, int speed, int stealth, int concentration, int crit, int vision, int hearing, int smell, int temperature, int hunger, int thirst, String type)
    {
        character = new HashMap<String, HashMap>();
        name = newName;
        description = newDescription;
        weapons = newWeapons;
        armors = newArmors;
        responses = newResponses;
        attributes = newAttributes;
        abilities = newAbilities;
        quests = newQuests;
        items = newItems;
        implants = newImplants;
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
        skills.put("Level", new Skill("Level","Overall Level",level));
		items.put("Coins",new Item("Coins","Your Money", coins));
		attributes.put("Health",new Attribute("Health","Your hit points",1,health));
		attributes.put("Mana",new Attribute("Mana","Magic casting resource",1,mana));
		attributes.put("Energy",new Attribute("Energy","Physical ability resource",1,energy));
		attributes.put("Power",new Attribute("Power","Damage with attacks",1,power));
		attributes.put("Accuracy",new Attribute("Accuracy","Chance to hit",1,accuracy));
		attributes.put("Toughness",new Attribute("Toughness","Health regeneration / Physical damage reduction",1,toughness));
		attributes.put("Dexterity",new Attribute("Dexterity","Energy regeneration / Dodge chance",1,dexterity));
		attributes.put("Speed",new Attribute("Speed","Global cooldowns",1,speed));
		attributes.put("Stealth",new Attribute("Stealth","Ability to remain hidden",1,stealth));
		attributes.put("Concentration",new Attribute("Concentration","Mana regeneration / magical resistance",1,concentration));
		attributes.put("Crit",new Attribute("Crit","Chance to hit criticals",1,crit));
        attributes.put("Vision",new Attribute("Vision","View Distance",1,vision));
        attributes.put("Hearing",new Attribute("Hearing","Ear range",1,hearing));
        attributes.put("Smell",new Attribute("Smell","Smell Distance",1,smell));
        attributes.put("Temperature",new Attribute("Temperature","Current Temperature",1,temperature));
        attributes.put("Hunger",new Attribute("Hunger","Hunger Levels",1,hunger));
        attributes.put("Thirst",new Attribute("Thirst","Amount of thirstiness",1,thirst));
		stats.put("Type",new Stat("Type",type));
    }
	public void buildCharacter()
	{
        character = new HashMap<String, HashMap>();
        responses = new HashMap<String, Response>();
		weapons = new HashMap<String, Weapon>();
		armors = new HashMap<String, Armor>();
		attributes = new HashMap<String, Attribute>();
		skills = new HashMap<String, Skill>();
		effects = new HashMap<String, Effect>();
		stats = new HashMap<String, Stat>();
		abilities = new HashMap<String, Ability>();
		quests = new HashMap<String, Quest>();
		items = new HashMap<String, Item>();
        implants = new HashMap<String, Implant>();
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
		stats.put("Type",new Stat("Type","Human"));
		//effects
		//abilities
		//inventory
		//dialogue
	}
	//getResponse
    public HashMap get(String key)
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