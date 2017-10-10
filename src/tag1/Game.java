package tag1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import textio.SysTextIO;
import textio.TextIO;

public class Game 
{

    public Game() 
    {  
    TextIO io = new TextIO(new SysTextIO());
    
    
    io.put("Indtast navn");
    String name = io.get();
    System.out.println(name);
    System.out.println("hej");
    
    
    io.put("Indtast køn");
    String gender = io.get();
    System.out.println(gender);
    Player player = new Player(name, gender);
    List<String> l = Arrays.asList(new String[]{"Go North","Go West","Go East","Go South"});
    
    Room r1 = new Room("Start Room \nA long hallway, the door behind you is locked.\nThere is a door to the North.");
    Room r2 = new Room("A room with a painting");
    r1.setNorth(r2);
    r2.setSouth(r1);
    io.put(r1.getDescription());
    ArrayList<String> rooms = new ArrayList<>();
    
    
    if (!(r1.getSouth() == null ))
    {
        rooms.add("South");
//        System.out.println("You went South into the next room.\n");
//        System.out.println(r2.getDescription());
    }
    if (!(r1.getNorth() == null))
    {
        rooms.add("North");
//        System.out.println("You went North into the next room.\n");
//        System.out.println(r2.getDescription());
    }
    if (!(r1.getEast() == null))
    {
        rooms.add("East");
//        System.out.println("You went East into the next room.\n");
//        System.out.println(r2.getDescription());
    }
    if (!(r1.getWest() == null))
    {
        rooms.add("West");
//        System.out.println("You went West into the next room.\n");
//        System.out.println(r2.getDescription());
    }
    
    int select = io.select("\nPick a direction to go\n", rooms, "");
    System.out.println(select);


    
//    System.out.println(name + ", " + "ow you hit a wall!");

//    List<String> l = Arrays.asList(new String[]{"Go North","Go West","Go East","Go South"});
//    int select = io.select("Start Room \nA long hallway, the door behind you is locked.\nThere is a door to the North.", l,"");
//    System.out.println(select);
//    
//    if (!(System.in == Arrays.asList(0)))
//    {
//        System.out.println(name + ", " + "ow you hit a wall!");
//        io.select("Start Room \nA long hallway, the door behind you is locked.\nThere is a door to the North.", l,"");
//        System.out.println(select);
//    }
//    
//    io.select("Entrance \nA room with a football on the floor", l,"");
//    System.out.println(select);
    
    }
    
}
