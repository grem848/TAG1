package tag1;

public class Item
{
    public String name;
    public int weight;
    public int value;
    public int durability;

    public Item(Item i)
    {
        this.name = i.name;
        this.weight = i.weight;
        this.value = i.value;
        this.durability = i.durability;
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
