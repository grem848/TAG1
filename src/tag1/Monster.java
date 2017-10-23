package tag1;

import java.util.ArrayList;

public class Monster {
    
    private String name;
    private int health;
    private int damage;
    private ArrayList<String> inventory;

    public Monster(String name, int health, int damage, ArrayList<String> inventory) {
        this.name = name;
        this.health = health;
        this.damage = damage;
        this.inventory = inventory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public ArrayList<String> getInventory() {
        return inventory;
    }

    public void setInventory(ArrayList<String> inventory) {
        this.inventory = inventory;
    }
    
    
}
