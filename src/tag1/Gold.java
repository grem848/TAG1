package tag1;

public class Gold extends Item
{
    String name;
    int weight;
    int value;
    int durability;

    public Gold(String name, int weight, int value, int durability)
    {
        this.name = name;
        this.weight = weight;
        this.value = value;
        this.durability = durability;
    }

    @Override
    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    @Override
    public int getWeight()
    {
        return weight;
    }

    public void setWeight(int weight)
    {
        this.weight = weight;
    }

    @Override
    public int getValue()
    {
        return value;
    }

    public void setValue(int value)
    {
        this.value = value;
    }

    @Override
    public int getDurability()
    {
        return durability;
    }

    @Override
    public void setDurability(int durability)
    {
        this.durability = durability;
    }
    
}
