package tag1;


public class Room
{

    private String description;
    private Room north, south, east, west;
    private int gold;
    private Weapon weapon;
    private Potion potion;

    public Room(String description, Weapon weapon)
    {
        this.description = description;
        this.weapon = weapon;
    }

    public Room(String description, Potion potion)
    {
        this.description = description;
        this.potion = potion;
    }
    
    public Room(String description, int gold)
    {
        this.description = description;
        this.gold = gold;
    }

    public Room(String description)
    {
        this.description = description;
    }

    public Weapon getWeapon()
    {
        return weapon;
    }

    public void setWeapon(Weapon weapon)
    {
        this.weapon = weapon;
    }

    public Potion getPotion()
    {
        return potion;
    }
    
    
    public int getGold()
    {
        return gold;
    }

    public void setGold(int gold)
    {
        this.gold = gold;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public Room getNorth()
    {
        return north;
    }

    public void setNorth(Room north)
    {
        this.north = north;
    }

    public Room getSouth()
    {
        return south;
    }

    public void setSouth(Room south)
    {
        this.south = south;
    }

    public Room getEast()
    {
        return east;
    }

    public void setEast(Room east)
    {
        this.east = east;
    }

    public Room getWest()
    {
        return west;
    }

    public void setWest(Room west)
    {
        this.west = west;
    }

}
