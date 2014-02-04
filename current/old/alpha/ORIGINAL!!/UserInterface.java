/**
 * Was created to allow the user to have a way to interact with the game world
 * It provides the methods for the main menu, battle system, character menu, and options.
 *
 * @author Erik Mellum
 * @version 1.0
 */
import java.io.*;
import java.util.*;
import java.lang.*; 
public class UserInterface implements Serializable
{
	CinReader reader;
	Toolkit toolkit;
	Player user;
	World world;
	Random generator;
	Room currentRoom;
	Storage storage;
	/**
	 * Default constructor
	 * Creates a reader, toolkit, user, and world
	 */
	public UserInterface()
	{
	
		reader = new CinReader();
		toolkit = new Toolkit();
		user = new Player();
		world = new World();
		storage = new Storage();
	}
	/**
	 * Launch method of the game allows you to choose a new game, a load game, or options menu
	 * 
	 */
	public void go()
	{
		boolean loop = true;	
		do
		{
			toolkit.screenClear(4, "===========================Haunted Mansion===========================");
			int userChoice = toolkit.newMenu("Welcome to the Haunted Mansion. What would you like to do today?","New Game","Load Game","Options","Quit");
			
			switch (userChoice)
			{
				case 1:
					newGame();
					mainMenu();
				break;
				case 2:
					UserInterface temp = storage.loadUI("Save");
					System.out.print("Load successful... ");
					toolkit.promptEnter();
					temp.mainMenu();
					
				break;
				case 3:
					options();
				break;
				case 4:
					System.out.println("See you later!");
					loop = false;
				break;
				default:
				break;
			}
		} while(loop == true);
	}
	/**
	 * Creates a new game allowing the user to input a name for their adventurer
	 * 
	 */
	public void newGame()
	{
		world = new World();
		currentRoom = world.getRoom(0);
		user = world.getUser();
		System.out.print("\nWhat is your name: ");
		user.setName(reader.readString());
		System.out.println("\nGet ready " + user.getName() + ", a spooky adventure awaits!\n");
		toolkit.promptEnter();
	}
	/**
	 * Creates the main menu for the program allowing the user to access the features
	 * 
	 */
	public void mainMenu()
	{
		boolean loop = true;
		String toString;
		do
		{
			toolkit.screenClear(4, "===========================Haunted Mansion===========================");
			toString = user.getName() + " is in " + currentRoom.getName();
			int userChoice = toolkit.newMenu(toString,"Character","Examine Room","Options","Quit");
			switch (userChoice)
			{
				case 1:
					characterMenu();
				break;
				case 2:
					explore();
				break;
				case 3:
					options();
				break;
				default:
					loop = false;
				break;
			}
		} while(loop == true);
	}
	/**
	 * Creates the character menu allowing the user to view items, equip items, drop items, and view quests.
	 * 
	 */
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
						user.setEquippedWeapon(theWeapon);
						System.out.println("\nYou equipped the " + user.getEquippedWeapon().getName() + "!");
					}
					if (newItem instanceof Armor)
					{
						Armor theArmor = (Armor)newItem;
						user.setEquippedArmor(theArmor);
						System.out.println("\nYou equipped the " + user.getEquippedWeapon().getName() + "!");
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
						gameOver();
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
						currentRoom.setItem(newItem);
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
	/**
	 * Allows the user to explore their current room. This will show information
	 * about the items, characters, and description of the room. They can select to
	 * interact with one of these objects to travel into a different section of the 
	 * world
	 * 
	 */
	public void explore()
	{
		String choices = "QqBbCc";
		Character actor = null;
		Item item = null;
		Quest tempQuest = null;
		boolean loop = true;
		do
		{
		System.out.println("\n" +currentRoom + "\n");
		System.out.println("From " + currentRoom.getName() + " you can travel \n");
		if (currentRoom.getNorthRoom() != null)
		{
			System.out.println("[N] Travel to the " + currentRoom.getNorthRoom().getName());
			choices += "Nn";
		}
		if (currentRoom.getSouthRoom() != null)
		{
			System.out.println("[S] Travel to the " + currentRoom.getSouthRoom().getName());
			choices += "Ss";
		}
		if (currentRoom.getEastRoom() != null)
		{
			System.out.println("[E] Travel to the " + currentRoom.getEastRoom().getName());
			choices += "eE";
		}
		if (currentRoom.getWestRoom() != null)
		{
			System.out.println("[W] Travel to the " + currentRoom.getWestRoom().getName());
			choices += "wW";
		}		
		if (currentRoom.getCharactersSize() < 1)
			System.out.println("You are the only person in this room");
		else
		{
			for(Character output: currentRoom.getCharacters())
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
		if (currentRoom.getItemsSize() <= 0)
			System.out.println("[I] No items here");
		else
		{
			for(Item output: currentRoom.getItems())
			{
				System.out.println("[I] Pick up " + output.getName());
				choices += "Ii";
			}
		}
		if (currentRoom.getCharactersSize() == 1)
			actor = currentRoom.getCharacter(0);
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
			case 'N':
				if (currentRoom.getNorthRoom() != null)
				{
					if (currentRoom.getNorthRoom().getLocked() == true)
					{
						Key theKey = null;
						for(Item theItem: user.getInventory())
							if(theItem instanceof Key)
							{
								theKey = (Key)theItem;
								if(theKey.getLockNumber() == currentRoom.getNorthRoom().getRoomNumber())
								{
									System.out.println("You have unlocked the " + currentRoom.getNorthRoom().getName());
									currentRoom.getNorthRoom().setLocked(false);
								}
							}
						if (currentRoom.getNorthRoom().getLocked() == false)
							user.removeItem(theKey);
						else
							System.out.println("You must find the key to this area");
								
					}
					if (currentRoom.getNorthRoom().getLocked() == false)
					{
						currentRoom = world.getRoom(currentRoom.getNorthRoom().getRoomNumber()-1);	
						user.setRoomNumber(currentRoom.getRoomNumber());
					}
				}
			break;
			case 'S':
				if (currentRoom.getSouthRoom() != null)
				{
					if (currentRoom.getSouthRoom().getLocked() == true)
					{
						Key theKey = null;
						for(Item theItem: user.getInventory())
							if(theItem instanceof Key)
							{
								theKey = (Key)theItem;
								if(theKey.getLockNumber() == currentRoom.getSouthRoom().getRoomNumber())
								{
									System.out.println("You have unlocked the " + currentRoom.getSouthRoom().getName());
									currentRoom.getSouthRoom().setLocked(false);
								}
							}
						if (currentRoom.getSouthRoom().getLocked() == false)
							user.removeItem(theKey);
						else
							System.out.println("You must find the key to this area");
								
					}
					if (currentRoom.getSouthRoom().getLocked() == false)
					{
						currentRoom = world.getRoom(currentRoom.getSouthRoom().getRoomNumber()-1);
						user.setRoomNumber(currentRoom.getRoomNumber());
					}
				}
			break;
			case 'E':
				if (currentRoom.getEastRoom() != null)
				{
					if (currentRoom.getEastRoom().getLocked() == true)
					{
						Key theKey = null;
						for(Item theItem: user.getInventory())
							if(theItem instanceof Key)
							{
								theKey = (Key)theItem;
								if(theKey.getLockNumber() == currentRoom.getEastRoom().getRoomNumber())
								{
									System.out.println("You have unlocked the " + currentRoom.getEastRoom().getName());
									currentRoom.getEastRoom().setLocked(false);
								}
							}
						if (currentRoom.getEastRoom().getLocked() == false)
							user.removeItem(theKey);
						else
							System.out.println("You must find the key to this area");
								
					}
					if (currentRoom.getEastRoom().getLocked() == false)
					{
						currentRoom = world.getRoom(currentRoom.getEastRoom().getRoomNumber()-1);
						user.setRoomNumber(currentRoom.getRoomNumber());
					}
				}
			break;
			case 'W':
				if (currentRoom.getWestRoom() != null)
				{
					if (currentRoom.getWestRoom().getLocked() == true)
					{
						Key theKey = null;
						for(Item theItem: user.getInventory())
							if(theItem instanceof Key)
							{
								theKey = (Key)theItem;
								if(theKey.getLockNumber() == currentRoom.getWestRoom().getRoomNumber())
								{
									System.out.println("You have unlocked the " + currentRoom.getWestRoom().getName());
									currentRoom.getWestRoom().setLocked(false);
								}
							}
						if (currentRoom.getWestRoom().getLocked() == false)
							user.removeItem(theKey);
						else
							System.out.println("You must find the key to this area");
								
					}
					if (currentRoom.getWestRoom().getLocked() == false)
					{
						currentRoom = world.getRoom(currentRoom.getWestRoom().getRoomNumber()-1);
						user.setRoomNumber(currentRoom.getRoomNumber());
					}
				}
			break;
			case 'T':	
				int choice3 = 0;
				if (currentRoom.getCharactersSize() > 1)
				{
					do
					{
						for(int i = 0; i<currentRoom.getCharactersSize(); i++)
						{
							System.out.println("[" + (i+1) + "] " + currentRoom.getCharacter(i).getName());
						}
				
						System.out.print("\nYour Choice: ");
						choice3 = reader.readInt(1,currentRoom.getCharactersSize());
							actor = currentRoom.getCharacter((choice3 -1));
					}while(actor instanceof Monster == true);
				}	
				if(actor instanceof Trader)
				{
					Trader theTrader = (Trader)actor;
					int choice4 = theTrader.buyOrSell();
					if (choice4 == 1)
						theTrader.buyItem(theTrader.showInventory()-1, user);
					if (choice4 == 2)
						theTrader.sellItem(user.showInventory()-1, user);
				}
				else if(actor.getQuestsSize() == 0)
				{
					if (actor != null)
					{
						System.out.println(actor.getResponses());
						actor.setResponseCounter(actor.getResponseCounter()+1);
					}
				}	
				
				else
				{
					Quest quest = null;
					Quest theQuest = actor.getQuest();
					if (theQuest.getBegun() == true)
					{
						for(Quest output: user.getQuests())
							if (output.getName() == theQuest.getName())
								quest = output;
						if (quest != null)
						{
							if (quest.getComplete() == true)
							{
								System.out.println(quest.completedOutput());
								Item reward = quest.getReward();
								System.out.println("Congratulations on your new " + reward.getName() + " take is as payment for your work");
								System.out.println("You gained an experience point!");
								actor.removeQuest(quest);
								user.removeQuest(quest);
								user.setExperience(user.getExperience() + 1);											
								user.addItem(reward);
								if (reward.getName() == "Gold Star")
								{
									System.out.println("You have won the game!!");
									System.out.println(user);
									int end = toolkit.newMenu("Would you like to keep playing?","Yes","No");
									if (end == 2)
									{
										System.out.println("Goodbye, Thanks for playing! Your a true hero!");
										System.exit(0);
									}
									else
									{
										System.out.println("The world is yours now conqueror!");
									}
								}
							}
							else
							{
								System.out.println(quest.begunOutput());
							}
						}
					}
					else 
					{
						System.out.println(actor.getQuest().beginOutput());
						int menuChoice = toolkit.newMenu("Would you like to take this quest?","Yes","No");
						System.out.println();
						if (menuChoice ==1)
						{
							actor.getQuest().setBegun();
							user.addQuest(actor.getQuest());
						}
						else 
							System.out.println("\nToo weak I guess...");
					}
				}
				System.out.println();
				toolkit.promptEnter();				
				break;
				case 'A':
					int choice2 = 0;
					do
					{
						for (Character test: currentRoom.getCharacters())
						{
							if (test instanceof Monster)
								System.out.println("[" + (currentRoom.getCharacters().indexOf(test)+1) + "] " + currentRoom.getCharacter(currentRoom.getCharacters().indexOf(test)).getName());
						}
						System.out.print("\nYour Choice: ");
						choice2 = reader.readInt(1,currentRoom.getCharactersSize())-1;
						if (currentRoom.getCharacter(choice2) instanceof Monster)
							actor = currentRoom.getCharacter((choice2));	
						else
							System.out.println("Please select a valid target");
					}while(currentRoom.getCharacter(choice2) instanceof Monster == false);
					battle(user,actor);
				break;
				case 'I':
					if (currentRoom.getItems().size()<= 0)
					{
						System.out.println("No items here");
					}
					if (currentRoom.getItems().size() == 1)
					{
						for(Quest output: user.getQuests())
							if (output.getTarget() == currentRoom.getItems().get(0).getName())
								output.setComplete();
						item = currentRoom.getItem(currentRoom.getItems().get(0));
						user.addItem(item);
						if (item instanceof Weapon)
						{
							Weapon weapon = (Weapon)item;
							int choice0 = toolkit.newMenu("Would you like to equip this weapon?","Yes","No");
							if (choice0 == 1)
							{
								user.setEquippedWeapon(weapon);
							}
						}	
						if (item instanceof Armor)
						{
							Armor armor = (Armor)item;
							int choice0 = toolkit.newMenu("Would you like to equip this armor?","Yes","No");
							if (choice0 == 1)
							{
								user.setEquippedArmor(armor);
							}
						}
					}
					else
					{
						for(int i = 0; i<currentRoom.getItems().size(); i++)
							System.out.println("[" + (i+1) + "] " + currentRoom.getItems().get(i).getName());
						System.out.print("\nYour Choice: ");
						int userChoice = reader.readInt(1,currentRoom.getItems().size());
						item = currentRoom.getItem(currentRoom.getItems().get(userChoice -1));	
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
								user.setEquippedWeapon(weapon);
							}
						}
						if (item instanceof Armor)
						{
							Armor armor = (Armor)item;
							int choice0 = toolkit.newMenu("Would you like to equip this armor?","Yes","No");
							if (choice0 == 1)
							{
								user.setEquippedArmor(armor);
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
	/**
	 * Allows the game to battle the user and a selected enemy
	 * 
	 */
	public void battle(Player user, Character enemy)
	{
		int damage;
		int accuracy = 0;
		int rounds = 1;
		generator = new Random();
		System.out.println("\nGet ready for battle!");
		System.out.println(user.getName() + " vs. " + enemy.getName());
		do
		{
			String title = "Round " + rounds;
			int choice = toolkit.newMenu(title,"Attack","Inventory","Run Away");
			switch (choice)
			{
			case 1:
				for(int i = 0; i < 2; i++)
				{
					rounds++;
						if (i == 0)
						{
							damage = (generator.nextInt(enemy.getLevel()))+1;
							Attack theAttack = enemy.getEquippedWeapon().getAttack(0);
							if (enemy.getEquippedWeapon() != null)
							{
								theAttack = enemy.getEquippedWeapon().getAttack(generator.nextInt(enemy.getEquippedWeapon().getAttacksSize()));
								accuracy = generator.nextInt(12)+1+theAttack.getAccuracy()+enemy.getAccuracy();
								damage += generator.nextInt(theAttack.getDamage())+1;
							}
							damage += generator.nextInt(enemy.getStrength())+1;
							damage -= generator.nextInt(user.getEquippedArmor().getRating());
							System.out.println(user);
							if (accuracy > 6 && damage > 0)
							{
								user.setHealth(user.getHealth() - damage);
								System.out.println(enemy.getName() + " performed a " + theAttack.getName() + " with his " + enemy.getEquippedWeapon().getName() + " for " + damage + " damage. ");
								if (user.getHealth() < 0)
									user.setHealth(0);
								System.out.println(user.getName() + " has " + user.getHealth() + " health left.");
							}
							else 
								System.out.println(enemy.getName() + " missed his " + theAttack.getName());
						}
						if (user.getHealth() > 0)
						{
							if (i == 1)
							{
								damage = (generator.nextInt(user.getLevel()))+1;
								Attack theAttack = user.getEquippedWeapon().getAttack(0);
								if (user.getEquippedWeapon() != null)
								{
									System.out.println("Choose your attack\n");
									theAttack = user.getEquippedWeapon().getAttack(user.getEquippedWeapon().selectAttack());
									accuracy = (generator.nextInt(12))+1+theAttack.getAccuracy()+user.getAccuracy();
									damage += generator.nextInt(theAttack.getDamage())+1;
								}
								damage += generator.nextInt(user.getStrength())+1;
								damage -= generator.nextInt(enemy.getArmor().getRating());
								System.out.println(enemy);
								if (accuracy > 6 && damage > 0)
								{
									enemy.setHealth(enemy.getHealth() - damage);
									System.out.println(user.getName() + " performed a " + theAttack.getName() + " with his " + user.getEquippedWeapon().getName() + " for " + damage + " damage. ");
									if (enemy.getHealth() < 0)
										enemy.setHealth(0);	
									System.out.println(enemy.getName() + " has " + enemy.getHealth() + " health left.");
								}
								else 
									System.out.println(user.getName() + " missed his " + theAttack.getName());
							}
						}
				}
				if (user.getHealth() <= 0)
					gameOver();
				if (enemy.getHealth() <= 0)
				{
					String itemList = "";
					if (enemy.getInventorySize() > 0)
						for(Item newItem: enemy.getInventory())
						{
							currentRoom.setItem(newItem);
							itemList += newItem.getName() + ", ";
						}
					if (enemy.getEquippedWeapon() != null)
					{
						currentRoom.setItem(enemy.getEquippedWeapon());
						itemList+=enemy.getEquippedWeapon().getName()+ ", ";
					}
					if (enemy.getArmor() != null)
					{
						currentRoom.setItem(enemy.getArmor());
						itemList+=enemy.getArmor().getName()+ ", ";
					}
					
					user.setHealth(user.getMaxHealth());
					System.out.println("Great job killing " + enemy.getName() + " he dropped " + enemy.getCredits() + " coins and " + itemList);
					user.setExperience(user.getExperience() + 1);
					System.out.println("You have gained an experience point!");
					if(user.getExperience() % 2 == 0)
						user.levelUp();
					for(Quest output: user.getQuests())
					{
						if (output.getTarget() == enemy.getName())
						{
							output.setComplete();
						}
					}	
					user.setCredits(user.getCredits() + enemy.getCredits());
					currentRoom.removeCharacter(enemy);
					
					toolkit.promptEnter();
				}
			break;
			case 2:
				characterMenu();
			break;
			case 3:
				int escape = generator.nextInt(12)+1;
				if (escape > 6)
				{
					System.out.println("\nYou have escaped!\n");
					user.setHealth(user.getMaxHealth());
					enemy.setHealth(enemy.getMaxHealth());
					explore();
				}
				else
				{
					System.out.println(enemy.getName() + " has blocked your escape!\n");
					damage = (generator.nextInt(12)+1)/3;
					user.setHealth(user.getHealth() - damage);
					System.out.println(enemy.getName() + " hit " + user.getName() + " with his " + enemy.getEquippedWeapon().getName() + " for " + damage + " damage");
					if (user.getHealth() < 0)
						user.setHealth(0);
					System.out.println(user.getName() + " has " + user.getHealth() + " health remaining");
				}
					
			break;
			}
		}while(user.getHealth() > 0 && enemy.getHealth() > 0);
	}
	/**
	 * Runs when the user has no health. Allows you to start a new game.
	 * 
	 */
	public void gameOver()
	{
		System.out.println("You lose!");
		user = null;
		int userChoice = toolkit.newMenu("Would you like to play a new game?","Yes","No");
		if (userChoice == 1)
		{
			storage.loadUI("newUI");
			newGame();
		}
		else
			System.out.println("Goodbye, thanks for playing!");
	}
	/**
	 * Allows the user to change their name, save, load, and quit the game
	 * 
	 */
	public void options()
	{
		int choice = toolkit.newMenu("\nWelcome to the options","Change name","Save Game","Load Game", "Quit");
		switch (choice)
		{
			case 1:
				boolean loop = true;
				do
				{
					System.out.print("\nWhat would you like your new name to be? ");
					String newName = reader.readString();
					user.setName(newName);
					System.out.println("\nYour new name is: " + user.getName());
					int newChoice = toolkit.newMenu("\nAre you happy with your new name?","Yes","No");
					if (newChoice == 1)
					{
						loop = false;
						System.out.println("\nI think that was a good choice\n");
						toolkit.promptEnter();
					}		
				}while (loop == true);
					
			break;
			case 2:
				storage.storeUI(this,"Save");
				System.out.print("Save successful...");
				toolkit.promptEnter();
			break;
			case 3:
				UserInterface temp = storage.loadUI("Save");
				System.out.print("Load successful...");
				toolkit.promptEnter();
				temp.mainMenu();
			break;
			case 4:
				System.exit(0);
			break;
			
		}
	}
}