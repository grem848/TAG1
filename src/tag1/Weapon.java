package tag1;

import java.io.Serializable;

public class Weapon extends Item implements Serializable
{
    int damage;

    public Weapon(int damage, String name, String description)
    {
        super(name, description);
        this.damage = damage;
    }

    public int getDamage()
    {
        return damage;
    }
}
