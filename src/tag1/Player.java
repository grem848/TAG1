package tag1;

import java.io.Serializable;
import java.util.ArrayList;

public class Player implements Serializable
{

    private String firstName;
    private String lastName;
    private int health;
    private int goldInv;
    ArrayList<Player> players;

    public int getGoldInv()
    {
        return goldInv;
    }

    public void setGoldInv(int goldInv)
    {
        this.goldInv = goldInv;
    }
    private ArrayList<Item> inventory;
    public ArrayList<Item> getInventory()
    {
        return inventory;
    }

    public void setInventory(ArrayList<Item> inventory)
    {
        this.inventory = inventory;
    }

    public void setHealth(int health)
    {
        this.health = health;
    }

    public int getHealth()
    {
        return health;
    }

    public Player(String firstName, String lastName)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.health = 100;
        this.inventory = new ArrayList<>();
    }

    public String getFirstName()
    {
        return firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    @Override
    public String toString()
    {
        return firstName + " " + lastName + " : Gold: " + goldInv + "\n";
    }

}
