package tag1;

import java.util.ArrayList;


public class Room
{

    private String description;
    private Room north, south, east, west;
    private Gold gold;
//    private ArrayList<Item> items;
    // arraylist med items

//    public ArrayList<Item> getItems()
//    {
//        return items;
//    }
//
//    public void setItems(ArrayList<Item> items)
//    {
//        this.items = items;
//    }
//
//    public Room(String description, ArrayList<Item> items)
//    {
//        this.description = description;
//        this.items = items;
//    }

    public Gold getGold()
    {
        return gold;
    }

    public void setGold(Gold gold)
    {
        this.gold = gold;
    }
    
    public Room(String description, Gold gold)
    {
        this.description = description;
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
