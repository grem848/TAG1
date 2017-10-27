package tag1;

public class Item
{
    public String name;
    public int weight;
    public int value;
    public int durability;

    public Item()
    {
        this.name = name;
        this.weight = weight;
        this.value = value;
        this.durability = durability;
    }

    public String getName()
    {
        return name;
    }

    public int getWeight()
    {
        return weight;
    }

    public int getValue()
    {
        return value;
    }

    public int getDurability()
    {
        return durability;
    }

    public void setDurability(int durability)
    {
        this.durability = durability;
    }
    
}
