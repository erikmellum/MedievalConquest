import java.util.HashMap; 
import java.io.Serializable;
public class Player extends Character implements Serializable
{
	protected HashMap<String,GameList> player;
	public Player()
	{
		name = "Player";
		description = "Nothing exciting to describe about a default player";
		number = 1;
		buildPlayer();
	}
	public Player(String newName)
	{
		name = newName;
		description = "Nothing exciting to describe about a default player";
		number = 1;
		buildPlayer();
	}
	public void buildPlayer()
	{
		player = character;
		stats.put("Inventory Slots", new Stat("Inventory Slots",10));
		skills.put("Mining",new Skill("Mining","Allows you to mine raw minerals from the world for smithing",1));
		skills.put("Herbalism",new Skill("Herbalism","Allows you to locate and identify herbs for alchemy",1));
		skills.put("Fishing",new Skill("Fishing","Allows you to catch fish for cooking",1));
		skills.put("Skinning",new Skill("Skinning","Allows you to scavenge hides off of fallen animals",1));
		skills.put("Woodcutting",new Skill("Woodcutting","Allows you to gather wood for fletching",1));
		skills.put("Thieving",new Skill("Thieving","Your ability to successfully pick pockets and locks",1));
		skills.put("Smithing",new Skill("Smithing","Allows you to craft armor and weapons",1));
		skills.put("Alchemy",new Skill("Alchemy","Allows you to mix herbs to create powerful potions",1));
		skills.put("Cooking",new Skill("Cooking","Allows you to cook and prepare food for various benefits",1));
		skills.put("Leatherworking",new Skill("Leatherworking","Allows you to craft armor and accessories",1));
		skills.put("Medicine",new Skill("Medicine","Allows you to craft healing potions and foods",1));
		skills.put("Fletching",new Skill("Fletching","Allows you to craft items out of wood",1));
		skills.put("Jewelcrafting",new Skill("Jewelcrafting","Allows you to create rings and necklaces",1));
		skills.put("Enchanting",new Skill("Enchanting","Allows you to enchant armor and weapons",1));
		quests.put("Escape the Arena!",new Quest());
		armors.put("Leather Helmet",new Armor("Leather Helmet","Head"));
		armors.put("Leather Chest",new Armor("Leather Chest","Chest"));
		armors.put("Leather Leggings",new Armor("Leather Leggings","Legs"));
		armors.put("Leather Boots",new Armor("Leather Boots","Feet"));
		armors.put("Leather Bracers",new Armor("Leather Bracers","Arms"));
		armors.put("Leather Belt",new Armor("Leather Belt","Waist"));
		armors.put("Gold Ring",new Armor("Gold Ring","Left Finger"));
		armors.put("Silver Ring",new Armor("Silver Ring","Right Finger"));
		armors.put("Leather Gloves",new Armor("Leather Gloves","Hands"));
		armors.put("Leather Cape",new Armor("Leather Cape","Back"));
		armors.put("Leather Spaulders",new Armor("Leather Spaulders","Shoulders"));
		armors.put("Bronze Amulet",new Armor("Bronze Amulet","Neck"));
		armors.put("Leather Quiver",new Armor("Leather Quiver","Accessory"));
		weapons.put("Bronze Longsword",new Weapon("Bronze Longsword","Two Hand"));
	}
}