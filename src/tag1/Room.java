package tag1;

import java.util.ArrayList;

public class Room
{

    private String description;
    private Room north, south, east, west;
    private ArrayList<Gold> gold;

    public ArrayList<Gold> getGold()
    {
        return gold;
    }

    public void setGold(ArrayList<Gold> gold)
    {
        this.gold = gold;
    }
    
    public Room(String description)
    {
        this.description = description;
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
