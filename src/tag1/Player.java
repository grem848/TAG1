
package tag1;

import java.io.Serializable;
import java.util.ArrayList;

public class Player implements Serializable
{
    private String firstName;
    private String lastName;
    private int health;
    private ArrayList<String> inventory;

    public ArrayList<String> getInventory() {
        return inventory;
    }

    public void setInventory(ArrayList<String> inventory) {
        this.inventory = inventory;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getHealth() {
        return health;
    }
    
    public Player(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.health = 100;
        this.inventory = new ArrayList<>();
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
    @Override
    public String toString()
    {
    return "\n\n*HIGH SCORE LIST*\n" + firstName + " "+ lastName + " gold here" + "\n*****************\n\n";
    }           
}
