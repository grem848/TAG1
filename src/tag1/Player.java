package tag1;

import java.io.Serializable;
import java.util.ArrayList;

public class Player implements Serializable
{

    private String firstName;
    private String lastName;
    private int health = 100;
    private int damage = 5;
    private int goldInv;
    private Weapon weapon;
    private ArrayList<Item> pInventory = new ArrayList();

    public Player(String firstName, String lastName, int goldInv)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.goldInv = goldInv;
    }



    
    public int getDamage()
    {
        return damage;
    }

    public void setDamage(int damage)
    {
        this.damage = damage;
    }
    
    public Weapon getWeapon()
    {
        return weapon;
    }

    public void setWeapon(Weapon weapon)
    {
        this.weapon = weapon;
    }
   
    public int getGoldInv()
    {
        return goldInv;
    }

    public void setGoldInv(int goldInv)
    {
        this.goldInv = goldInv;
    }

    public ArrayList<Item> getpInventory()
    {
        return pInventory;
    }

    public void setpInventory(ArrayList<Item> pInventory)
    {
        this.pInventory = pInventory;
    }
    
    public void setHealth(int health)
    {
        this.health = health;
    }

    public int getHealth()
    {
        return health;
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
