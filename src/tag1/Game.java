package tag1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import textio.SysTextIO;
import textio.TextIO;

public class Game {
        Player player;
        Room rx = null; // Current room
        ArrayList<Room> rooms = new ArrayList<>();
        TextIO io = new TextIO(new SysTextIO());
        ArrayList<String> validDirections = new ArrayList<>();
        
    public Game() {


        io.put("Indtast navn");
        String name = io.get();
        System.out.println(name);

        io.put("Indtast køn");
        String gender = io.get();
        System.out.println(gender);
        player = new Player(name, gender);
        List<String> l = Arrays.asList(new String[]{"Go North", "Go West", "Go East", "Go South"});

        rooms.add(new Room("Start Room \nA long hallway, the door behind you is locked.\nThere is a door to the North."));
        rooms.add(new Room("A room with a painting"));
        rooms.add(new Room("The end"));

        rooms.get(0).setNorth(rooms.get(1));
        rooms.get(1).setSouth(rooms.get(0));
        rooms.get(1).setNorth(rooms.get(2));
        rooms.get(2).setSouth(rooms.get(1));

        rx = rooms.get(0);
        play();
    }
    
    public void play(){
        while(!rx.equals(rooms.get(2))){
            io.put(rx.getDescription());
            getValidDirections();
            int select = io.select("\nPick a direction to go\n", validDirections, "");
            System.out.println(select);
            
        }
        
    }

    private void getValidDirections() {

        if (!(rx.getSouth() == null)) {
            validDirections.add("South");
        }
        if (!(rx.getNorth() == null)) {
            validDirections.add("North");
        }
        if (!(rx.getEast() == null)) {
            validDirections.add("East");
        }
        if (!(rx.getWest() == null)) {
            validDirections.add("West");
        }
        
    }

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
