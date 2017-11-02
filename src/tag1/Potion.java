package tag1;

import java.io.Serializable;

public class Potion extends Item implements Serializable
{
    int healthBonus;

    public Potion(int healthBonus, String name, String description)
    {
        super(name, description);
        this.healthBonus = healthBonus;
    }

    
    public int getHealthBonus()
    {
        return healthBonus;
    }
 
}
