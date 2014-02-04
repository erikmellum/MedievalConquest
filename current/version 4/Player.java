import java.util.HashMap; 
import java.io.Serializable;
public class Player extends Character
{
	protected HashMap<String,HashMap> player;
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
		skills.put("Leatherworking",new Skill("Leatherworking","Allows you to craft armor and accessories",1));
		skills.put("Medicine",new Skill("Medicine","Allows you to craft healing potions and foods",1));
		skills.put("Fletching",new Skill("Fletching","Allows you to craft items out of wood",1));
		skills.put("Jewelcrafting",new Skill("Jewelcrafting","Allows you to create rings and necklaces",1));
		skills.put("Enchanting",new Skill("Enchanting","Allows you to enchant armor and weapons",1));
		quests.put("Escape the Arena!",new Quest());
		items.put("Metal Helmet",new Armor("Metal Helmet","Head"));
        items.put("Wood Helmet",new Armor("Wood Helmet","Head"));
		equip("Head",new Armor("Leather Helmet","Head"));
		equip("Chest",new Armor("Leather Chest","Chest"));
		equip("Legs",new Armor("Leather Leggings","Legs"));
		equip("Feet",new Armor("Leather Boots","Feet"));
		equip("Arms",new Armor("Leather Bracers","Arms"));
		equip("Waist",new Armor("Leather Belt","Waist"));
		equip("Left Finger",new Armor("Gold Ring","Left Finger"));
		equip("Right Finger",new Armor("Silver Ring","Right Finger"));
		equip("Hands",new Armor("Leather Gloves","Hands"));
		equip("Back",new Armor("Leather Cape","Back"));
		equip("Shoulders",new Armor("Leather Spaulders","Shoulders"));
		equip("Neck",new Armor("Bronze Amulet","Neck"));
		equip("Accessory",new Armor("Leather Quiver","Accessory"));
		equip("Two Hand",new Weapon("Bronze Longsword","Two Hand"));
		abilities.put("Fireball",new Ability("Fireball","Gets very hot on your hands while casting"));
	}
}