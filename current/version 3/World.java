import java.util.*;
protected GameList<String, GameList> world;
protected GameList<String, Character> characters;
protected GameList<String, Item> items;
protected GameList<String, Stat> stats;
protected GameList<String, Ability> abilities;
protected GameList<String, Effect> effects;
protected GameList<String, Modification> modifications;
protected GameList<String, Quest> quests;
protected GameList<String, Room> rooms;
protected GameList<String, Tile> tiles;
protected GameList<String, Response> responses;
public class World 
{
    public World()
    {
        world = new GameList<String, GameList>();
        characters = new GameList<String, Character>();
        items = new GameList<String, Item>();
        stats = new GameList<String, Stat>();
        abilities = new GameList<String, Ability>();
        effects = new GameList<String, Effect>();
        modifications = new GameList<String, Modification>();
        quests = new GameList<String, Quest>();
        rooms = new GameList<String, Room>();
        tiles = new GameList<String, Tile>();
        responses = new GameList<String, Response>();
        buildItems();
        buildCharacters();
        buildStats();
        buildAbilities();
        buildEffects();
        buildModifications();
        buildQuests();
        buildRooms();
        buildTiles();
        buildResponses();
    }
    public void buildItems()
    {
    }
    public void buildCharacters()
    {
    }
    public void buildStats()
    {
    }
    public void buildAbilities()
    {
    }
    public void buildEffects()
    {
    }
    public void buildModifications()
    {
    }
    public void buildQuests()
    {
    }
    public void buildRooms()
    {
    }
    public void buildTiles()
    {
    }
    public void buildResponses()
    {
    }
}
