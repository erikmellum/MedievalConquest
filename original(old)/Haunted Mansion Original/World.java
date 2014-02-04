/**
 * World is a class created to hold all of the objects that will exist in the game world
 * It provides methods for setting and getting rooms.
 *
 * @author Erik Mellum
 * @version 1.0
 */
 
import java.io.Serializable;
import java.util.ArrayList;
public class World implements Serializable
{
	private Room[] roomList;
	private int totalRooms;
	private Player user;
	private Room room1;
	private Room room2;
	private Room room3;
	private Room room4;
	private Room room5;
	private Room room6;
	private Room room7;
	private Room room8;
	private Room room9;
	private Room room10;
	private Room room11;
	private Room room12;
	private Store room13;
	private Character character1;
	private Character character2;
	private Character character3;
	private Character character4;
	private Character character5;
	private Character character6;
	private Character character7;
	private Character character8;
	private Character character9;
	private Character character10;
	private Character character11;
	private Character character12;
	private Character character13;
	private Character character14;
	private Character character15;
	private Character character16;
	private Character character17;
	private Character character18;
	private Character character19;
	private Character character20;
	private Character character21;
	private Trader trader1;
	private Armor armor1;
	private Armor armor2;
	private Armor armor3;
	private Armor armor4;
	private Armor armor5;
	private Armor armor6;
	private Armor armor7;
	private Armor armor8;
	private Armor armor9;
	private Armor armor11;
	private Armor armor12;
	private Armor armor10;
	private Item item1;
	private Item item2;
	private Item item3;
	private Potion potion1;
	private Potion potion2;
	private Potion potion3;
	private Potion potion4;
	private Potion potion5;
	private Potion potion6;
	private Potion potion7;
	private Potion potion8;
	private Potion potion9;
	private Potion potion10;
	
	private Attack attack1;
	private Attack attack2;
	private Attack attack3;
	private Attack attack4;
	private Attack attack5;
	private Attack attack6;
	private Key key1;
	private Key key2;
	private Weapon weapon1;
	private Weapon weapon2;
	private Weapon weapon3;
	private Weapon weapon4;
	private Weapon weapon5;
	private Weapon weapon6;
	private Weapon weapon7;
	private Weapon weapon8;
	private Weapon weapon9;
	private Weapon weapon10;
	private Weapon weapon11;
	private Weapon weapon12;
	private Weapon weapon13;
	private ArrayList<Quest> quests;
	private Quest quest1;
	private Quest quest2;
	private Quest quest3;
	private Quest quest4;
	private Quest quest5;
	/**
	 * Default constructor.
	 * Runs create world method which runs creates user, items, characters, quests, and rooms of the world
	 */
	public World()
	{
		
		createWorld();
	}
	/**
	 * Called by the constructor to help build the items, quests, characters, and rooms of the world.
	 */
	private void createWorld()
	{
		user = new Player();		
		createItems();
		createQuests();
		createCharacters();
		createRooms();
	}
	/**
	 * Called by the constructor to help build the rooms of the world.
	 * This includes building the rooms, linking the rooms, adding the characters and items to the rooms.
	 */
	private void createRooms()
	{
		room1 = new Room("Entrance to Haunted Mansion","A wild eyed, crazy haired man stands by the entrance",null,null,null,null,1);
		room3 = new Room("Entry Hall","Filled with cobwebs and a spiraling staircase going up",null,null,null,null,3);
		room11 = new Room("Witches Labratory","A bubbling cauldron in the corner spews smoke",null,null,null,null,11);
		room10 = new Room("Skeleton's living area", "Skeletons and ghosts tormented by their very existence patrol the room",null,null,null,null,10);
		room5 = new Room("Vampire Hallow","Bats along the walls, and the palest looking sheep",null,null,null,null,5);
		room8 = new Room("Werewolf Den","Werewolves scratch and fight each other over the bones littering the area",null,null,null,null,8);
		room4 = new Room("Zombie Incubation Hall","Dead bodies infested with the zombie virus are scattered on the floor",null,null,null,null,4);
		room9 = new Room("Zombie graveyard","Tombstones and the smell of death",null,null,null,null,9);
		room7 = new Room("Room of the dead","Ghouls like this area of the house",null,null,null,null,7);
		room2 = new Room("Tall Tower","There were a lot of stairs to get up here",null,null,null,null,2);
		room12 = new Room("Wizards workshop","Scattered with books and vials",null,null,null,null,12);
		room13 = new Store();
		room6 = new Room("Basement","So dark you can barely see",null,null,null,null,6);
		room1.setSouthRoom(room3);
		room1.setItem(weapon1);
		room1.setItem(potion1);
		room1.setCharacter(character1);
		room1.setWestRoom(room13);
		room3.setCharacter(character14);
		room3.setCharacter(character5);
		room3.setItem(potion10);
		room2.setEastRoom(room3);
		room2.setSouthRoom(room5);
		room3.setNorthRoom(room1);
		room3.setSouthRoom(room6);
		room3.setEastRoom(room4);
		room3.setWestRoom(room2);
		room3.setItem(potion1);
		room3.setCharacter(character4);
		room4.setSouthRoom(room7);
		room4.setWestRoom(room3);
		room4.setCharacter(character2);
		room5.setNorthRoom(room2);
		room5.setSouthRoom(room8);
		room5.setEastRoom(room6);
		room5.setCharacter(character11);
		room6.setNorthRoom(room3);
		room6.setSouthRoom(room10);
		room6.setEastRoom(room7);
		room6.setWestRoom(room5);
		room6.setCharacter(character15);
		room7.setSouthRoom(room9);
		room7.setWestRoom(room6);
		room7.setNorthRoom(room4);
		room7.setCharacter(character6);
		room8.setEastRoom(room10);
		room8.setNorthRoom(room5);
		room8.setCharacter(character12);
		room8.setCharacter(character16);
		room8.setCharacter(character17);
		room10.setNorthRoom(room6);
		room10.setSouthRoom(room11);
		room10.setEastRoom(room9);
		room10.setWestRoom(room8);
		room10.setCharacter(character13);
		room10.setCharacter(character3);
		room9.setWestRoom(room10);
		room9.setNorthRoom(room7);
		room9.setCharacter(character7);
		room9.setCharacter(character8);
		room11.setCharacter(character10);
		room11.setSouthRoom(room12);
		room11.setNorthRoom(room10);
		room11.setLocked(true);
		room12.setNorthRoom(room11);
		room12.setCharacter(character9);
		room12.setLocked(true);
		room13.setEastRoom(room1);
		room13.setCharacter(character18);
		room13.setCharacter(character19);
		room2.setCharacter(character21);
		room5.setCharacter(character20);
		roomList = new Room[13];
		roomList[0] = room1;
		roomList[1] = room2;
		roomList[2] = room3;
		roomList[3] = room4;
		roomList[4] = room5;
		roomList[5] = room6;
		roomList[6] = room7;
		roomList[7] = room8;
		roomList[8] = room9;
		roomList[9] = room10;
		roomList[10] = room11;
		roomList[11] = room12;
		roomList[12] = room13;
		
	}
	/**
	 * Called by the constructor to help build the quests of the world.
	 */
	private void createQuests()
	{
		quests = new ArrayList<Quest>();
		quest1 = new Quest(1,"Haunted Mansion","Potion of Youth","Enter the mansion and find the potion, but don't drink it!","Alright you wanna be scared tonight? I have been researching this house for years... Theres something special inside the pits of that house. It's a potion... one said to restore your entire vitality. Supposedly it can bring one close to death back to life, it can give strength to the weak\n<The man peers crazily at you and whispers> It can even restore youth to the old.... Fetch me this potion, and you will be well rewarded! Watch out though, there might be some monsters waiting inside!","I thought you wanted to get that potion, what are you, a coward?","Great job making it through the mansion freak, now I'm gonna drink the potion!!!! <The old man uncorks the vial and swiftly swallows the contents> He cackles madly and suddenly turns green. His eyes roll into the back of his head and he falls over, stiff as a board. Good thing you didn't drink that poison!",item2);
		quest2 = new Quest(2,"Kill the skeleton","Skeleton","Find and kill the skeleton that took the ghosts armor!","I remember when I was an adventurer like yourself, up until the point when I got killed. And that damn skeleton that killed me still has my armor. Say... you can have it if you kill him for me, what do you say? It's just two rooms south of here!","Go find the skeleton with my armor!","Thanks for avenging my skeletal adversary",armor7);
		quest3 = new Quest(3,"Find the source of the zombie virus","Green fuzzy worm","I bet there is something causing all of these dead bodies to reanimate...","You have proven yourself to be more competent than myself, now lets see if you are more competent than the three others that passed through here tonight <The ghost points towards the two zombie corpses remaining from earlier> They were human earlier tonight, just like you. Now that you have some armor why don't you go and find the source of the zombie infection, it shouldn't be hard, just follow the trail of zombies to the graveyard!","The infection will get you if you die too you know, chomp, chomp and CHOMP!!!!","Hmmm no more zombies, I don't know how I feel about this!",key1);
		quest4 = new Quest(4,"Find the Witch","Witch","Find the Witch concocting deadly poisons from her cauldron","Now that we have taken care of the zombies we can focus on the real problem, there is a Witch brewing evil potions in this house, would you like to take her down? She should be south of the skeleton you killed for me","Dont waste time, she will kill us if you do!","Great job, Now I can give you the key to fight the dark Wizard",key2);
		quest5 = new Quest(5,"Kill the Dark Wizard","Dark Wizard","Remove the Dark Wizard. He is the blight of evil in this house","<The ghost is surrounded by piles of books> I havn't stopped pouring over ancient volumes since you left. Turns out that the Witch was brewing something for a Dark Wizard in this house. Now that you have the key you must go face him!","Go find the Dark Wizard","You did it!!! You are the most amazing adventurer in the history of this game!",item3);
	}
	/**
	 * Called by the constructor to help build the characters of the world.
	 */
	private void createCharacters()
	{
		String[] responses = {"Your tougher than you look","Come back next time we are in town"};
		character1 = new Character("Scary old man");
		character1.addQuest(quest1);
		character1.setResponses(responses);
		String[] responses1 = {"I'm gonna get ya!"};
		character2 = new Monster("Rotting Zombie",2,weapon2,armor1);
		character14 = new Monster("Dying Zombie",1,weapon1,armor6);
		character5 = new Monster("Frail Zombie",1,weapon2,armor1);
		character6 = new Monster("Fresh Zombie",2,weapon1,armor1);
		character18 = new Monster("Agile Zombie",2,weapon8,armor6);
		character15 = new Monster("Shadow",3,weapon9,armor4);
		character11 = new Monster("Starved Vampire",4,weapon9,armor6);
		character16 = new Monster("Werewolf",3,weapon7,armor6);
		character17 = new Monster("Werewolf cubs",2,weapon7,armor6);
		character21 = new Monster("Alien Life Form",13,weapon10,armor12);
		character20 = new Monster("Grim Reaper",11,weapon11,armor8);
		character12 = new Monster("Alpha Werewolf",4,weapon7,armor6);
		character7 = new Monster("Strong Zombie",3,weapon4,armor3);
		character8 = new Monster("Ultra Zombie",5,weapon11,armor10);
		character9 = new Monster("Dark Wizard",8,weapon6,armor5);
		character18 = new Monster("Balrog",12,weapon11,armor11);
		character19 = new Monster("Goblin King",15,weapon3,armor11);
		character10 = new Monster("Witch",6,weapon5,armor8);
		character3 = new Monster("Skeleton",1,weapon2,armor1);
		character13 = new Monster("Burly Skeleton",5,weapon3,armor2);
		character4 = new Character("Friendly Ghost");
		character4.addQuest(quest2);
		character4.addQuest(quest3);
		character4.addQuest(quest4);
		character4.addQuest(quest5);
		character5.setItem(armor1);
		character4.setItem(potion3);
		character6.setItem(potion4);
		character7.setItem(potion5);
		character8.setItem(potion6);
		character9.setItem(potion7);
		character10.setItem(potion8);
		character11.setItem(potion9);;
		character9.setItem(potion2);
		character8.setItem(item1);
		trader1 = new Trader();
		trader1.setItem(weapon10);
		trader1.setItem(armor9);
	}
	/**
	 * Called by the constructor to help build the items of the world.
	 */
	private void createItems()
	{;
		potion1 = new Potion();
		potion3 = new Potion();
		potion4 = new Potion();
		potion5 = new Potion();
		potion6 = new Potion();
		potion7 = new Potion();
		potion8 = new Potion();
		potion9 = new Potion();
		potion10 = new Potion();
		potion2 = new Potion("Potion of Youth","The source of power in this game","experience",50,1000);
		armor1 = new Armor("Clothes","Don't provide much protection",1,1);
		armor3 = new Armor("Rusty bronze chestplate","This is heavy and uncomfortable to wear",5,2);
		armor4 = new Armor("Hydrogen link chestplate","Doesn't actually protect you much",11,2);
		armor2 = new Armor("Bone Armor","Stronger than you would think",12,3);
		armor5 = new Armor("Wizard Robes","Make you much stronger with magic",55,8);
		armor6 = new Armor("Tattered Rags","This is just gross",1,1);
		armor8 = new Armor("Enchanted Shawl","Imbues the hags with smellyness",55,5);
		armor7 = new Armor("Leather Armor","This suit is made from animals",25,3);
		armor10 = new Armor("Flesh Armor","This suit of armor is made from rotting meat",1,5);
		armor11 = new Armor("Burly Armor","This suit of armor is strong!",551,10);
		armor12 = new Armor("Space suit","Wow!",5551,15);
		armor9 = new Armor("Iron Armor","This is gonna give some serious protection!",100,8);
		key1 = new Key(11);
		key2 = new Key(12);
		weapon1 = new Weapon("Chewed bone","Good for whacking",1,1,12,"Strong lunge","Swing","Parry");
		weapon2 = new Weapon("Rusty Dagger","The blade is still sharp",5,3,4,"Heavy swing","Slice","Precise stab");
		weapon3 = new Weapon("Iron Sword","Slices right through dead flesh",15,5,6,"Power Stab","Armslice","Accurate swing");
		weapon4 = new Weapon("Lead Wrench","Good for whackin'",15,4,7,"Heavy swing","Attack","Aimed Hit");
		weapon7 = new Weapon("Bloody Claws","These will slice your throat if your not careful'",15,4,7,"Throat Rip","Arm slash","Scatch");
		weapon8 = new Weapon("Dripping Fangs","Good for sucking blood",15,5,7,"Throat bite","Puncture","Bite");
		weapon11 = new Weapon("Bone Longsword","This was once a huge femur",115,11,3,"Shatter","Slice","Cut");
		weapon12 = new Weapon("Magic Sceptre","This was once a huge femur",115,17,3,"Electrocute","Mind wipe","Stab");
		weapon5 = new Weapon("Magic Broomstick","Pretty useless overall",25,5,11,"Slap","Swat","Swipe");
		weapon6 = new Weapon("Evil Wand","Has a mind of its own!",415,8,7,"Fireball","Frost","Electric charge");
		weapon9 = new Weapon("Conjured Blade","Summoned from the nether world",55,6,7,"Shadow Stab","Cut","Scratch");
		weapon10 = new Weapon("Energy Blaster","Good for killing anything",10000,20,10,"Obliterate","Focus Ray","Energy Blast");
		item1 = new Item("Green fuzzy worm","Eats right through dead bodies and controls them",1);
		item2 = new Item("Gold Star","You get it for winning :)",12000);
		item3 = new Item("Gold Nugget","You get it for winning :)",10000);
	}
	/**
	 * Allows you to get the room from the worlds array of rooms
	 * @param index the index of the room you will be retrieving
	 */
	public Room getRoom(int index)
	{
		return roomList[index];
	}
	/**
	 * Allows you to get the user that was created in the room
	 * @return user the user created by the constructor
	 */
	public Player getUser()
	{
		return user;
	}
}
/*
REQUIREMENTS

a class representing the game "world" -- this class will have:

    an array of "rooms" that the player can explore
    the method(s) required to construct the "world" -- all of the code needed to create the "rooms", add "items" and "characters" to them, and add the "rooms" to the array will be in the "world" class
    a method to retrieve the "start room" so that the user interface class can get the game started
*/