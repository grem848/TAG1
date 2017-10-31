package tag1;

import java.io.Serializable;

public class Item implements Serializable
{
    private final String name;
    private final String description;

    public Item(String name, String description)
    {
        this.name = name;
        this.description = description;
    }

    public String getName()
    {
        return name;
    }

    public String getDescription()
    {
        return description;
    }
    
}
