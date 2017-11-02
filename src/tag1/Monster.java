package tag1;

import java.util.ArrayList;

public class Monster
{

    private String name;
    private int health;
    private int damage;
    private boolean mobAlive = true;
    private int goldInv;
    
    public Monster(String name, int health, int damage, int goldInv)
    {
        this.name = name;
        this.health = health;
        this.damage = damage;
        this.goldInv = goldInv;
    }

    public int getGoldInv()
    {
        return goldInv;
    }

    public void setGoldInv(int goldInv)
    {
        this.goldInv = goldInv;
    }
    
    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getHealth()
    {
        return health;
    }

    public void setHealth(int health)
    {
        this.health = health;
    }

    public int getDamage()
    {
        return damage;
    }

    public void setDamage(int damage)
    {
        this.damage = damage;
    }

    public boolean isMobAlive()
    {
        return mobAlive;
    }

    public void setMobAlive(boolean mobAlive)
    {
        this.mobAlive = mobAlive;
    }
    
}
