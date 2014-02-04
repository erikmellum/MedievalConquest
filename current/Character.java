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
	protected HashMap<String, Equippable> equipped;
	protected HashMap<String, Attribute> attributes;
    protected HashMap<String, Ability> actionbar;
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
    public Character(String newName, String newDescription, HashMap<String, Equippable> newEquipped, HashMap<String, Response> newResponses, HashMap<String, Attribute> newAttributes, HashMap<String, Skill> newSkills, HashMap<String, Effect> newEffects, HashMap<String, Stat> newStats, HashMap<String, Ability> newAbilities, HashMap<String, Quest> newQuests, HashMap<String, Item> newItems, HashMap<String, Implant> newImplants, int level, int coins, int health, int mana, int energy, int power, int accuracy, int toughness, int dexterity, int speed, int stealth, int concentration, int crit, int vision, int hearing, int smell, int temperature, int hunger, int thirst, String type)
    {
        character = new HashMap<String, HashMap>();
        name = newName;
        description = newDescription;
        equipped = newEquipped;
        responses = newResponses;
        attributes = newAttributes;
        abilities = newAbilities;
        
        quests = newQuests;
        items = newItems;
        implants = newImplants;
        actionbar = new HashMap<String, Ability>();
        character.put("Equipped",equipped);
		character.put("Attributes",attributes);
		character.put("Skills",skills);
		character.put("Effects",effects);
		character.put("Stats",stats);
		character.put("Abilities",abilities);
		character.put("Quests",quests);
		character.put("Items",items);
        character.put("Responses",responses);
        character.put("Implants",implants);
        character.put("Actionbar",actionbar);
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
		equipped = new HashMap<String, Equippable>();
		attributes = new HashMap<String, Attribute>();
		skills = new HashMap<String, Skill>();
		effects = new HashMap<String, Effect>();
		stats = new HashMap<String, Stat>();
		abilities = new HashMap<String, Ability>();
		quests = new HashMap<String, Quest>();
		items = new HashMap<String, Item>();
        implants = new HashMap<String, Implant>();
        actionbar = new HashMap<String, Ability>();
		character.put("Equipped",equipped);
		character.put("Attributes",attributes);
		character.put("Skills",skills);
		character.put("Effects",effects);
		character.put("Stats",stats);
		character.put("Abilities",abilities);
		character.put("Quests",quests);
		character.put("Items",items);
        character.put("Responses",responses);
        character.put("Implants",implants);
        character.put("Actionbar",actionbar);
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
    public HashMap getList(GameObject object)
    {
        if(object instanceof Ability)
            return abilities;
        else if(object instanceof Implant)
            return implants;
        else if(object instanceof Quest)
            return quests;
        else if(object instanceof Equippable)
            return equipped;
        else if(object instanceof Item)
            return items;
        else if(object instanceof Attribute)
            return attributes;
        else if(object instanceof Skill)
            return skills;
        else if(object instanceof Stat)
            return stats;
        else
            return null;
    }
    public void equip(String key, Equippable newItem)
    {
    
        Equippable oldItem = equipped.get(newItem.getLocation());
        if(oldItem != null)
        {
            oldItem.setIsEquipped(false);
            items.put(oldItem.getName(), oldItem);
            equipped.remove(newItem.getLocation());
        }
        equipped.put(newItem.getLocation(), newItem);
        items.remove(newItem.getName());
        newItem.setIsEquipped(true);
        
    }
    public boolean checkEquipped(String key)
    {
        if(equipped.get(key) == null)
            return false;
        else
            return true;
    }
    public void dequip(String key)
    {
        Equippable item = equipped.get(key);
        if(item!=null)
        {
            items.put(item.getName(), item);
            item.setIsEquipped(false);
            equipped.remove(key);
            equipped.put(item.getLocation(),null);
        }
        
    }
    public void viewEquipped(String key)
    {
        System.out.println(equipped.get(key));
    }
    public Item dropItem(String key)
    {
        Item temp = items.get(key);
        items.remove(key);
        return temp;
    }
    public Item dropItem(Item item)
    {
        if(item instanceof Equippable)
        {
            Equippable theItem = ((Equippable)item);
            if(theItem.getIsEquipped() == true)
                dequip(theItem.getLocation()); 
        }
        Item temp = items.get(item.getName());
        items.remove(item.getName());
        return temp;
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
    public Equippable getEquipped(String key)
    {
        return equipped.get(key);
    }
}