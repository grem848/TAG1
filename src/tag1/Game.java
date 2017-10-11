package tag1;

import java.util.ArrayList;
import textio.SysTextIO;
import textio.*;

public class Game 
{
        Player player;
        Room rx = null; // Current room
        ArrayList<Room> rooms = new ArrayList<>();
        TextIO io = new TextIO(new SysTextIO());
        ArrayList<String> validDirections = new ArrayList<>(4);
        public static final String NORTH = "Go North";
        public static final String SOUTH = "Go South";
        public static final String EAST = "Go East";
        public static final String WEST = "Go West";
        
        
    public Game() 
    {


        io.put("Indtast navn");
        String name = io.get();
        System.out.println(name);

        io.put("Indtast køn");
        String gender = io.get();
        System.out.println(gender);
        player = new Player(name, gender);

        newRoom();

        setDirections();

        rx = rooms.get(0);
        play();
    }
    
    private void newRoom() 
    {
        // Room 0
        rooms.add(new Room("\n*Mansion Entrance*\nThe entrance is a small dark room with a locked door to the south."));
        // Room 1
        rooms.add(new Room("\n*Entrance Hall*\nThe entrance hall is so big you can fit 1000 pigs in it.\n"
                + "The black stone walls used to be lit with torches that burned out years ago,\n"
                + "and the ceiling is covered in spider web"));
        // Room 2
        rooms.add(new Room("\n*The Eastern Hallway*\nThe eastern hallway is wide and straight like the old canal that cuts through the nearby city.\n"
                + "The hallway is filled with paintings with faded and crackled images,\n it is almost impossible to make out what they used to portray."));
        // Room 3
        rooms.add(new Room("\n*The Dining Room*\nThe dining room had once been an impressive dining room\n"
                + "but years of neglect had taken its toll on the interior."
                + "In the middle of the room stands a long oak tablesome of the food was still on table."));
        // Room 4
        rooms.add(new Room("4The basement was barely more than crawl space,"
                + " you had to hang your head low just to walk in there. There was a crul stench of death."));
        // Room 5
        rooms.add(new Room("5the kitchen  was a very dark room, the only thing"
                + " visible was the layer of dust on the old kitchen machine. the smell came from the rot mad."));
        // Room 6
        rooms.add(new Room("6the great hall, was the biggeste room in the house,"
                + " with a long wooden table and a few old chairs."));
        // Room 7
        rooms.add(new Room("7You have found the treasure, congratulations!\n"));
        // Room 8
        rooms.add(new Room("8the library was probely the oldest thing in the hole house."
                + " the books were imposible to read probely becauseof the age? or maybe something else?"));
        // Room 9
        rooms.add(new Room("9in the hidden room you not could have believed it if not for all of the blood."
                + " How can so much blood come from one body? The skin told of a messy story...."));
        // Room 10
        rooms.add(new Room("10in the bedroom stood a big bed, with a lot of dust, the last"
                + " one who had slept there was probably a spider."));
        // Room 11
        rooms.add(new Room("11the storage room was filled with old wooden boxes God knows what was in."));
        // Room 12
        rooms.add(new Room("12the outside was cold and dark with a faul mood in the air."));
        // Room 13
        rooms.add(new Room("13the laboratory was equipped with old sophisticated tools of old science,"
                + " the things that could have happenden here , was indescribably..."));
        // Room 14        
        rooms.add(new Room("14The hallway is narrow, and has as much personality"
                + " as the rest of the house, the floor  is slate grey and the walls."));
    }
    private void setDirections() 
    {
        // Room 0
        rooms.get(0).setNorth(rooms.get(1));
        // Room 1
        rooms.get(1).setSouth(rooms.get(0));
        rooms.get(1).setEast(rooms.get(2));
        rooms.get(1).setWest(rooms.get(14));
        // Room 2
        rooms.get(2).setNorth(rooms.get(3));
        rooms.get(2).setWest(rooms.get(1));
        // Room 3
        rooms.get(3).setNorth(rooms.get(5));
        rooms.get(3).setSouth(rooms.get(2));
        rooms.get(3).setEast(rooms.get(4));
        // Room 4
        rooms.get(4).setWest(rooms.get(3));
        // Room 5
        rooms.get(5).setSouth(rooms.get(3));
        rooms.get(5).setWest(rooms.get(6));
        // Room 6
        rooms.get(6).setSouth(rooms.get(7));
        rooms.get(6).setEast(rooms.get(5));
        rooms.get(6).setWest(rooms.get(8));
        // Room 7
        rooms.get(7).setNorth(rooms.get(6));
        // Room 8
        rooms.get(8).setNorth(rooms.get(9));        
        rooms.get(8).setSouth(rooms.get(10));        
        rooms.get(8).setEast(rooms.get(6));
        // Room 9      
        rooms.get(9).setSouth(rooms.get(8));
        // Room 10
        rooms.get(10).setNorth(rooms.get(8));        
        rooms.get(10).setSouth(rooms.get(14));        
        rooms.get(10).setWest(rooms.get(11));
        // Room 11       
        rooms.get(11).setSouth(rooms.get(12));        
        rooms.get(11).setEast(rooms.get(10));
        // Room 12
        rooms.get(12).setNorth(rooms.get(11));        
        rooms.get(12).setSouth(rooms.get(13));        
        rooms.get(12).setEast(rooms.get(14));
        // Room 13
        rooms.get(13).setNorth(rooms.get(12));                      
        // Room 14
        rooms.get(14).setNorth(rooms.get(10));             
        rooms.get(14).setEast(rooms.get(1));
        rooms.get(14).setWest(rooms.get(12));
        
    }


    
    public void play()
    {
        while(!rx.equals(rooms.get(7)))
        {
            io.put(rx.getDescription());
            getValidDirections();
            int select = io.select("\n\nPick a direction to go\n", validDirections, "");
            System.out.println(select);
            goToRoom(select, validDirections);
            chickenDinner();
        }
        
    }


    private void goToRoom(int input, ArrayList<String> validDirections1)  
    {
        // input++;
        switch(validDirections1.get(input)){
            case NORTH:  rx = rx.getNorth(); break;
            case SOUTH: rx = rx.getSouth(); break;
            case EAST: rx = rx.getEast(); break;
            case WEST: rx = rx.getWest(); break;
            default: //ignore
        }
            validDirections.clear();
    }
    
    private void chickenDinner() 
    {
        if (rx.equals(rooms.get(7)))
        {
            System.out.println(rooms.get(7).getDescription());
            System.out.println("\n(╯°□°）╯︵ ┻━┻");
            System.out.println("\nPress F6 to play again!");
            System.out.println("\n┬─┬﻿ ノ( ゜-゜ノ)\n");
        }
        
    }            
            
    private void getValidDirections() 
    {
        
        if (!(rx.getNorth() == null)) 
        {
            validDirections.add(NORTH);
        }
        if (!(rx.getSouth() == null)) 
        {
            validDirections.add(SOUTH);
        }
        if (!(rx.getEast() == null)) 
        {
            validDirections.add(EAST);
        }
        if (!(rx.getWest() == null)) 
        {
            validDirections.add(WEST);
        }
        
    }

//    System.out.println(name + ", " + "ow you hit a wall!");
//    
//    if (!(System.in == Arrays.asList(0)))
//    {
//        System.out.println(name + ", " + "ow you hit a wall!");
//    }
}
