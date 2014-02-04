import java.util.HashMap; 
import java.io.Serializable;
public class Trainer extends Character implements Serializable
{
	protected HashMap<String,HashMap> trainer;
	public Trainer()
	{
		name = "Trainer";
		description = "Greed isn't his only motive";
		number = 1;
		buildTrainer();
	}
	public Trainer(String newName, String newDescription)
	{
		name = newName;
		description = newDescription;
		number = 1;
		buildTrainer();
	}
	public void buildTrainer()
	{
		trainer = character;
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
	}
}