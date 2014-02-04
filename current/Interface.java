import java.util.*;
public class Interface
{
	
	Random generator = new Random();
	CinReader reader = new CinReader();
	Toolkit toolkit = new Toolkit();
    // There is one blank global self named object that is used for storage during the interface when grabbing and receiving objects
	World world;
	Player user;
	Room room;
    Ability ability;
    Implant implant;
    Quest quest;
    Item item;
    Weapon weapon;
    Armor armor;
    Equippable equippable;
    Attribute attribute;
    Skill skill;
    Stat stat;
	public void go()
	{
		world = new World();
		user = world.getPlayer();
		room = world.getRoom(user.getRoom());
		mainMenu();
	}
	public void mainMenu()
	{
		boolean loop = true;
		String toString;
		do
		{
			toolkit.screenClear(4, "===========================Arena===========================");
			int userChoice = toolkit.newMenu("Interaction Menu","Check Character","View Surroundings","Create","Quit");
			switch (userChoice)
			{
				case 1:
					characterMenu(user);
				break;
				case 2:
					viewRoom(user);
				break;
				case 3:
					create();
				break;
				default:
					loop = false;
				break;
			}
		} while(loop == true);
	}
	public void viewAbility(Ability ability)
	{
		System.out.println(ability.getName());
		System.out.println("Stats: ");

	}
	public void create()
	{
		switch(toolkit.newMenu("Welcome to the Creation Engine!","Create","Modify","Quit"))
		{
			case 1:
				switch(toolkit.newMenu("What would you like to create?","Monster","Weapon","Armor","Go Back"))
				{
					case 1:
					
					break;
					case 2:
					break;
					case 3:
					break;
					case 4:
					break;
				}
			break;
			case 2:
			break;
			case 3:
			break;
			default:
			break;
		}
	}
	public void viewRoom(Character character)
	{
		int i = 1;
		ArrayList<String> keyList = new ArrayList<String>();          	 
		System.out.println(room);	
		HashMap<String, Item> items = room.getItems();
		if (items.size() < 1)
			System.out.println("No items here...");
		else
		{
			for(Item item : items.values()) 
			{ 
		    	System.out.println("[" + i + "] " + item.getName());
		    	i++;
		    	keyList.add(item.getName());
			}
			System.out.print("\nYour Choice: ");
        	// reads in a string with a length no longer than 10 and it can't be length 0
			String input = reader.readString(false, 10);
			// tokenizes the string on space and puts in the array
			String[] splice = input.split(" ");
			// creates holder for the item selected by the user
			System.out.println("Not really implemented yet...");
		}


			toolkit.promptEnter();
	}
    public void useAbility(Character character, Ability selected, String action)
    {
        
    }
	public void useItem(Character character, Item selected, String action)
	{
        if(selected != null)
        {
            if(action.equals("menu"))
            {
                int choice;
                String option;
                if(selected instanceof Equippable)
                    if(((Equippable)selected).getIsEquipped() == true)
                        option = "Dequip";
                    else 
                        option = "Equip";
                else
                    option = "Back";
                if(option.equals("Back"))
                    choice = toolkit.newMenu(selected.getName(),"View","Drop","Inspect","Use","Back");
                else
                    choice = toolkit.newMenu(selected.getName(),"View","Drop","Inspect","Use",option,"Back");
                switch(choice)
                {
                    case 1:
                        action = "view";
                    break;
                    case 2:
                        action = "drop";
                    break;
                    case 3:
                        action = "inspect";
                    break;
                    case 4:
                        action = "use";
                    break;
                    case 5:
                        if(option.equals("Equip"))
                            action = "equip";
                        else if(option.equals("Dequip"))
                            action = "dequip";
                        else
                            action = "back"; 
                    break;
                    case 6:
                        action = "back"; 
                    break;
                    default:
                        action = "invalid";
                    break;
                
                }
            }
            if(action.equals("view"))
            {
                System.out.println(selected);
            }
            else if(action.equals("equip"))
            {
                if(selected.getEquippable() != true)
                    System.out.println("Cannot equip this item!");
                else
                {
                    Equippable theItem = ((Equippable)selected);
                    switch(promptEquip(character, theItem))
                    {
                    case 1:
                        character.equip(theItem.getLocation(), theItem);
                        System.out.println(theItem.getName() + " equipped...");
                    break;
                    case 2:
                        System.out.println(theItem.getName() + " not equipped...");
                    break;
                    case 3:
                        viewSlot(character, theItem.getLocation());
                    break;
                    }
                }

            }
            else if(action.equals("dequip"))
            {
                character.dequip(((Equippable)selected).getLocation());
                System.out.println(selected.getName() + " dequipped...");
            }
            else if(action.equals("drop"))
            {	
                int choice = toolkit.newMenu("Are you sure you want to drop " + selected.getName() +"?", "Yes", "No");
                switch(choice)
                {
                    case 1:

                        // if(item instanceof QuestItem)
                        if(false)
                        {
                            System.out.println("Cannot drop quest items...");
                            break;
                        }
                        else
                        {
                            room.addItem(character.dropItem(selected));
                            System.out.println(selected.getName() + " dropped...");
                        }
                    break;
                    default: 
                        System.out.println("Didn't drop " + selected.getName() +"...");
                    break;
                }
            }
            else if(action.equals("inspect"))
            {
                System.out.println(selected.getDescription());
            }
            else if(action.equals("use"))
            {
                System.out.println("Can't use this...");
            }
            else if(action.equals("eat"))
            {
            }
            else if(action.equals("drink"))
            {
            }
            else if(action.equals("smoke"))
            {
            }
            else if(action.equals("back"))
                return;
            else
                System.out.println("Unrecognized action...");
            toolkit.promptEnter();
        }
	}
    public void readList(Character character, GameObject object)
    {
        do
        {
            ArrayList<String> keyList = new ArrayList<String>();
            HashMap<String, GameObject> valueList = character.getList(object);
            Iterator<Map.Entry<String, GameObject>> it = valueList.entrySet().iterator();
            int i = 1;
            System.out.println("[0] Go Back");
            while (it.hasNext()) {
                Map.Entry<String, GameObject> pairs = it.next();
                keyList.add(pairs.getKey());
                if(pairs.getValue() != null)
                    System.out.println("[" + i + "] " + pairs.getKey() + " = " + pairs.getValue().getName());
                else
                    System.out.println("[" + i + "] " + pairs.getKey() + " = " + "Empty");
                i++;
            }
            System.out.print("\nYour Choice: ");
            String input = reader.readString(false, 10);
            String[] splice = input.split(" ");
            GameObject selected = null;
            if(isInt(splice[0]) == true)
            {
                int y = Integer.parseInt(splice[0]);
                if(y==0)
                    return;
                y--;
                if(y < valueList.size())
                {
                    selected = valueList.get(keyList.get(y));
                    // this logic allows will make sure the user can select empty spaces and view all available items for that slot
                    if(selected == null && keyList.get(y) != null)
                        viewSlot(character, keyList.get(y));       
                }
                splice[0] = "menu";               
            }
            else if(isInt(splice[1]) == true)
            {
                int y = Integer.parseInt(splice[1]);
                if(y==0)
                    return;
                y--;
                if(y < valueList.size())
                {
                    selected = valueList.get(keyList.get(y));
                    // this logic allows will make sure the user can select empty spaces and view all available items for that slot
                    if(selected == null && keyList.get(y) != null)
                        viewSlot(character, keyList.get(y));       
                }
            }
            else if(splice[1].equals("quit") || splice[1].equals("back"))
                return;
            else
                selected = valueList.get(splice[1]);
      
            String action = splice[0];
            
            if(selected instanceof Ability)
            {
                ability=((Ability)selected);
                useAbility(character, ability, action);           
            }
            else if(selected instanceof Implant)
            {
                implant=((Implant)selected);
                //useImplant(character, selected, action);           
            }
            else if(selected instanceof Quest)
            {
                quest=((Quest)selected);
                //useQuest(character, selected, action);           
            }
            else if(selected instanceof Equippable)
            {
                equippable=((Equippable)selected);
                useItem(character, equippable, action);             
            }
            else if(selected instanceof Item)
            {
                item=((Item)selected);
                useItem(character, item, action);           
            }
            else if(selected instanceof Attribute)
            {
                attribute=((Attribute)selected);
                //useAttribute(character, selected, action);           
            }
            else if(selected instanceof Skill)
            {
                skill=((Skill)selected);
                //useSkill(character, selected, action);           
            }
            else if(selected instanceof Stat)
            {
                stat=((Stat)selected);
                //useStat(character, selected, action);           
            }
            if(selected == null)
            {
            }
        }while(true);
    }
    public void viewSlot(Character character, String key)
    {
        ArrayList<String> keyList = new ArrayList<String>();
        HashMap<String, Item> valueList = character.get("Items");
        String action;
        Iterator<Map.Entry<String, Item>> it = valueList.entrySet().iterator();
        int i = 1;
        System.out.println("Items for the " + key + " slot: \n");
        System.out.println("[0] Go Back");
        // This loop outputs the entire list of items for that slot in the inventory
        while (it.hasNext()) {
            Map.Entry<String, Item> pairs = it.next();
            keyList.add(pairs.getKey());
            if(pairs.getValue() instanceof Equippable)
            {
                Equippable temp = ((Equippable)pairs.getValue());
                if(temp.getLocation().equals(key))
                    System.out.println("[" + i + "] " + pairs.getKey() + " = " + pairs.getValue().getName());
            }
            i++;
        }
        // This additional dialogue shows the equipped item for the slot
        if(character.get("Equipped").get(key) != null)
        {
            Equippable equipped = character.getEquipped(key);
            keyList.add(equipped.getLocation());
            System.out.println("[" + i + "] (Equipped) " + equipped.getLocation() + " = " + equipped.getName());
        }
        System.out.print("\nYour Choice: ");
        String input = reader.readString(false, 10);
        String[] splice = input.split(" ");
        Equippable selected = null;
        if(isInt(splice[0]) == true)
        {
            int y = Integer.parseInt(splice[0]);
            if(y==0)
                return;
            y--;
            if(y==(i-1) && character.get("Equipped").get(key) != null)
                selected = character.getEquipped(key);
            else if(y<keyList.size())
                selected = ((Equippable)valueList.get(keyList.get(y)));
            
            splice[0] = "menu";
        }
        else if(isInt(splice[1]) == true)
        {
            int y = Integer.parseInt(splice[1]);
            if(y==0)
                return;
            y--;
            if(y==(i-1) && character.get("Equipped").get(key) != null)
                selected = character.getEquipped(key);
            else if(y<keyList.size())
                selected = ((Equippable)valueList.get(keyList.get(y)));
        }
        else
            selected = ((Equippable)valueList.get(splice[1]));
  
        action = splice[0];
        useItem(character, selected, action);
           
    }
	public void characterMenu(Character character)
	{
        int choice;
        do
        {
            choice = toolkit.newMenu("Character Menu","Inventory","Equipped Items","Abilities","Stats","Quests","Active Effects","View Commands(Help)");
            switch(choice)
            {

                // functionality should allow you to type "drop 1", "equip 1", "view 1", "upgrade 1", view questitems, view weapons,
                // view abilities, view consumables, view misc, view armor, view equipped, view stats, view quests, drop quests
                // view effects,
                case 1:
                {
                    item = new Item();
                    readList(character, item);
                }
                
                break;
                case 2:
                {
                    equippable = new Equippable();
                    readList(character, equippable);
                }
                break;
                case 3:
                {
                    ability = new Ability();
                    readList(character, ability);
                }
                break;
                default:
                    choice = 10;
                break;
            }
        }while(choice != 10);
	}
	public int promptEquip(Character character, Item item)
	{
		if(item instanceof Equippable)
		{
            Equippable old = character.getEquipped(((Equippable)item).getLocation());
            if(old != null)
            {
                String title = "Are you sure you want to equip the " + item.getName() + "? \n";
                title += old.getName() + " is currently equipped. ";
                return toolkit.newMenu(title, "Yes", "No", "Compare");
            }
            else
                return 1;
        }
        return 2;
            
	}
	public static boolean isInt(String s) {
	    try { 
	        Integer.parseInt(s); 
	    } catch(NumberFormatException e) { 
	        return false; 
	    }
	    // only got here if we didn't return false
	    return true;
	}
}