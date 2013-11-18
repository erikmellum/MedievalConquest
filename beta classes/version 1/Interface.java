import java.util.*;
public class Interface
{
	
	Random generator = new Random();
	CinReader reader = new CinReader();
	Toolkit toolkit = new Toolkit();
	Player user;
	public void go()
	{
		user = new Player();
		monster = new Monster();
		room = new Room();
		mainMenu();
	}
	public void mainMenu()
	{
		boolean loop = true;
		String toString;
		do
		{
			toolkit.screenClear(4, "===========================Arena===========================");
			toString = user.getName() + " is in " + room.getName();
			int userChoice = toolkit.newMenu(toString,"Check Character","Examine","Create","Quit");
			switch (userChoice)
			{
				case 1:
					characterMenu();
				break;
				case 2:
					explore();
				break;
				case 3:
					create();
				break;
				default:
					loop = false;
				break;
			}
		} while(loop == true);
		battle(monster,user);
	}
	public void create()
	{
		switch(toolkit.newMenu("Welcome to the Creation Engine!","Create","Modify","Quit"))
		{
			case 1:
				switch(toolkit.newMenu("What would you like to create?","Monster","Weapon","Armor","Go Back"))
				{
					case 1:
						int monsterStyle = toolkit.newMenu("What style of monster would you like to create?","Strong","Fast","Defensive","Accurate","Balanced","Tough","Weak");
						int monsterType = toolkit.newMenu("What type of monster would you like to create?","Human","Goblin","Orc","Bear","Elf","Wizard","Knight");
						System.out.print("Please enter in the level of the monster (0-144): ");
						int monsterLevel = reader.readInt(0,144);
						Monster newMonster = new Monster(monsterStyle,monsterType,monsterLevel);
						room.setNPC(newMonster);
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
	public void attack(NPC attacker, Player defender)
	{
		int roll = 0;
		boolean hit = false;
		Weapon weapon = attacker.getWeapon();
		Weapon weapon1 = defender.getWeapon();
		Armor armor = defender.getArmor();
		Armor armor1 = attacker.getArmor();
		Stat theStat
		for(int i = 0; i < 2; i++)
		{
			
			if (i == 0)
			{
				roll = generator.nextInt(12);
				
				if (accuracy > evade)
				{
					roll += (accuracy - evade)/3;
					if (roll > 3)
						hit = true;
				}
				else if(accuracy == evade)
					if (roll > 4)
						hit = true;
				else 
				{
					roll -= (evade - accuracy)/3;
					if (roll > 6)
						hit = true;
				}
				if (hit == true)
				{
					damage += generator.nextInt(attacker.getStrength())/3;
					damage += weapon.getPower()/4;
					damage -= armor.getProtection()/8;
					damage -= generator.nextInt(defender.getDefense())/4;
					if (damage < 3)
						damage = generator.nextInt(3);
					else
					{
						damage = generator.nextInt(damage);
						damage += (attacker.getLevel() - defender.getLevel())/3;
					}
					roll = generator.nextInt(144) + (crit - luck);
					if (roll > 132)
						damage = (damage * 3)/2 ;
					defender.setHealth(defender.getHealth() - damage);
					System.out.println(damage);
				}
				else
				{
					System.out.println("Miss");
				} 		
			
			}
			if (i == 1)
			{
				if (defender.getHealth() > 0)
				{
					roll = generator.nextInt(12);
				
					if (accuracy1 > evade1)
					{
						roll += (accuracy1 - evade1)/3;
						if (roll > 3)
							hit = true;
					}
					else if(accuracy1 == evade1)
						if (roll > 4)
							hit = true;
					else 
					{
						roll -= (evade1 - accuracy1)/3;
						if (roll > 6)
							hit = true;
					}
					if (hit == true)
					{
						damage += generator.nextInt(defender.getStrength())/3;
						damage += weapon1.getPower()/4;
						damage -= armor1.getProtection()/8;
						damage -= generator.nextInt(attacker.getDefense())/4;
						if (damage < 3)
							damage = generator.nextInt(3);
						else
						{
							damage = generator.nextInt(damage);
							damage += (defender.getLevel() - attacker.getLevel())/3;
						}
						roll = generator.nextInt(144) + (crit1 - luck1);
						if (roll > 132)
							damage = (damage * 3)/2 ;
						attacker.setHealth(attacker.getHealth() - damage);
						System.out.println(damage);
					}
					else
					{
						System.out.println("Miss");
					} 	
				}
			}
		}
	}
	public void characterMenu()
	{
		System.out.println(user);
		int choice = toolkit.newMenu("Character Menu","Equip Item","View Inventory","Use Item","Drop Item","View Quests","Go Back");
		System.out.println();
		switch (choice)
		{
			case 1:
				if(user.getInventorySize() > 0)
				{
					Item newItem = user.selectItem();
					if (newItem instanceof Weapon)
					{
						Weapon theWeapon = (Weapon)newItem;
						user.setWeapon(theWeapon);
						System.out.println("\nYou equipped the " + user.getWeapon().getName() + "!");
					}
					if (newItem instanceof Armor)
					{
						Armor theArmor = (Armor)newItem;
						user.setArmor(theArmor);
						System.out.println("\nYou equipped the " + user.getArmor().getName() + "!");
					}
				}
				else
					System.out.println("No items to equip!");
			break;
			case 2:
				if(user.getInventorySize() > 0)
					user.viewItems();
				else
					System.out.println("No items in inventory");
			break;
			case 3:
				Item theItem1 = user.selectItem();
				if(theItem1 instanceof Potion)
				{
					Potion thePotion = (Potion)theItem1;
					if(thePotion.getName() == "Potion of Youth")
					{
						System.out.println("You drink the potion and a warm sensation comes over you... It moves to your toes... and as it slowly moves up it starts to burn...! You try to scream in panic but nothing comes out. You slowly fade into darkness as death embraces you, turns out... it was poison.");
					}
					if(user.getHealth() < user.getMaxHealth())
					{
						int random = generator.nextInt(thePotion.getRating());
						user.setHealth(user.getHealth()+random);
						System.out.println("This potion just healed you " + random + " points of health!");
						user.removeItem(thePotion);
					}
					else
						System.out.println("You have full health, no need for this!");
				}
				else
				{
					System.out.println("Can't use this item!");
				}
			break;
			case 4:
				if(user.getInventorySize() > 0)
				{
					Item theItem = user.selectItem();
					String output = "Are you sure you want to drop the " + theItem.getName() + "?";
					int choice1 = toolkit.newMenu(output,"Yes","No");
					if (choice1 == 1)
					{
						Item newItem = theItem;
						user.removeItem(theItem);
						room.setItem(newItem);
					}
					
				}
				else
					System.out.println("No items in inventory");
			break;
			case 5:
				if(user.getQuestsSize() > 0)
					user.viewQuests();
				else
					System.out.println("Your not on any quests!");
			break;	
		}
		System.out.println();
		toolkit.promptEnter();
	}	
	public void explore()
	{
		String choices = "QqBbCc";
		NPC actor = null;
		Item item = null;
		boolean loop = true;
		do
		{
			System.out.println("\n" + room + "\n");
			if (room.getNPCsSize() < 1)
				System.out.println("You are the only person in this room");
			else
			{
				for(NPC output: room.getNPCs())
				{
					if (output instanceof Monster)
					{
						System.out.println("[A] Attack " + output.getName()+ " Level: " + output.getLevel());
						choices += "Aa";
					}
					else 
					{
						System.out.println("[T] Talk to " + output.getName());
						choices += "Tt";
					}	
				}
			}
			if (room.getItemsSize() <= 0)
				System.out.println("[I] No items here");
			else
			{
				for(Item output: room.getItems())
				{
					System.out.println("[I] Pick up " + output.getName());
					choices += "Ii";
				}
			}
			if (room.getNPCsSize() == 1)
				actor = room.getNPC(0);
			System.out.println("[C] Character");
			System.out.println("[B] Back\n");
			System.out.print("Your Choice: ");
			char choice = java.lang.Character.toUpperCase(reader.readChar(choices));
			System.out.println();
			switch (choice)
			{
				case 'C':
					characterMenu();
				break;
				case 'A':
					int choice2 = 0;
					do
					{
						for (NPC test: room.getNPCs())
						{
							if (test instanceof Monster)
								System.out.println("[" + (room.getNPCs().indexOf(test)+1) + "] " + room.getNPC(room.getNPCs().indexOf(test)).getName());
						}
						System.out.print("\nYour Choice: ");
						choice2 = reader.readInt(1,room.getNPCsSize())-1;
						if (room.getNPC(choice2) instanceof Monster)
							actor = room.getNPC((choice2));	
						else
							System.out.println("Please select a valid target");
					}while(room.getNPC(choice2) instanceof Monster == false);
					battle(actor,user);
				break;
				case 'I':
					if (room.getItems().size()<= 0)
					{
						System.out.println("No items here");
					}
					if (room.getItems().size() == 1)
					{
						for(Quest output: user.getQuests())
							if (output.getTarget() == room.getItems().get(0).getName())
								output.setComplete();
						item = room.getItem(room.getItems().get(0));
						user.addItem(item);
						if (item instanceof Weapon)
						{
							Weapon weapon = (Weapon)item;
							int choice0 = toolkit.newMenu("Would you like to equip this weapon?","Yes","No");
							if (choice0 == 1)
							{
								user.setWeapon(weapon);
							}
						}	
						if (item instanceof Armor)
						{
							Armor armor = (Armor)item;
							int choice0 = toolkit.newMenu("Would you like to equip this armor?","Yes","No");
							if (choice0 == 1)
							{
								user.setArmor(armor);
							}
						}
					}
					else
					{
						for(int i = 0; i<room.getItems().size(); i++)
							System.out.println("[" + (i+1) + "] " + room.getItems().get(i).getName());
						System.out.print("\nYour Choice: ");
						int userChoice = reader.readInt(1,room.getItems().size());
						item = room.getItem(room.getItems().get(userChoice -1));	
						for(Quest output: user.getQuests())
							if (output.getTarget() == item.getName())
								output.setComplete();
						user.addItem(item);
						if (item instanceof Weapon)
						{
							Weapon weapon = (Weapon)item;
							int choice0 = toolkit.newMenu("Would you like to equip this weapon?","Yes","No");
							if (choice0 == 1)
							{
								user.setWeapon(weapon);
							}
						}
						if (item instanceof Armor)
						{
							Armor armor = (Armor)item;
							int choice0 = toolkit.newMenu("Would you like to equip this armor?","Yes","No");
							if (choice0 == 1)
							{
								user.setArmor(armor);
							}
						}
					}
					System.out.println();
					toolkit.promptEnter();
				break;
				case 'Q':
					System.exit(0);
				case 'B':
					loop = false;	
				break;
			}
			System.out.println();
		} while(loop == true);
	}
}