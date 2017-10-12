package tag1;

import java.util.ArrayList;
import textio.SysTextIO;
import textio.*;

public class Game 
{
        Player player;
        Room rx = null; // Current room
        TextIO io = new TextIO(new SysTextIO());
        ArrayList<Room> rooms = new ArrayList<>();
        ArrayList<String> validDirections = new ArrayList<>();
        public static final String NORTH = "Go North";
        public static final String SOUTH = "Go South";
        public static final String EAST = "Go East";
        public static final String WEST = "Go West";
        
        
    public Game() 
    {
        io.put("\n***********************\n* The Haunted Mansion *\n***********************\n\n");
        io.put("Type in your name:");
        String name = io.get();
        System.out.println(name);

        io.put("Type in your gender:");
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
        rooms.add(new Room("\n********************\n* Mansion Entrance *\n********************\n\n"
                + "You enter the mansion and step into a small dark room.\n"
                + "You hear the door close behind you, then you hear a loud\n"
                + "*CLICK*\n"
                + "The door you came from is now locked."));
        // Room 1             
        rooms.add(new Room("\n*****************\n* Entrance Hall *\n*****************\n\n"
                + "The entrance hall is so big you could fit 1000 pigs in it.\n"
                + "The black stone walls used to be lit with torches, but\n"
                + "it looks like they all burned out years ago.\n"
                + "The corners of the entrance hall are covered in spider web."));
        // Room 2
        rooms.add(new Room("\n*******************\n* Eastern Hallway *\n*******************\n\n"
                + "The eastern hallway is wide like the river\n"
                + "that cuts through the landscape outside the mansion.\n"
                + "The hallway walls are filled with paintings of faded\n"
                + "and crackled images, it is almost impossible to make out\n"
                + "what the paintings used to portray."));
        // Room 3
        rooms.add(new Room("\n***************\n* Dining Room *\n***************\n\n"
                + "The dining room seems to have been an impressive dining room once\n"
                + "but years of neglect have taken its toll on the interior.\n"
                + "In the middle of the room stands a long oak table,\n"
                + "the table is set but the tableware is completely covered in dust"));
        // Room 4
        rooms.add(new Room("\n************\n* Basement *\n************\n\n"
                + "A dense cruel stench of death fills the air, as the creaks door opens.\n"
                + "The basement is barely more than a crawl space,\n"
                + "you have to bow your head down just to walk in there."));
        // Room 5
        rooms.add(new Room("\n***********\n* Kitchen *\n***********\n\n"
                + "The kitchen is a very dark room, the only thing visible is\n"
                + "the thick layer of dust on the old kitchen appliances.\n"
                + "A foul smell surrounds the old fridge, left opened for\n"
                + "what looks like many years."));
        // Room 6
        rooms.add(new Room("\n**************\n* Great Hall *\n**************\n\n"
                + "The great hall is the biggest room in the mansion.\n"
                + "Built into the northern wall is a huge decorated fireplace.\n"));
        // Room 7
        rooms.add(new Room("\n***************\n* Trophy Room *\n***************\n\n"
                + "The walls in the trophy room are full of hunting trophies.\n"
                + "In the southern end of the room there is a table\n"
                + "with a small crimson container on it.\n"
                + "You open the container and you find a small golden statue!\n"
                + "\n+++++++++++++++++++++++++++++++++++++++++++++++++\n"
                + "*************************************************\n"
                + "* YOU HAVE FOUND THE TREASURE, CONGRATULATIONS! *\n"
                + "*************************************************\n"
                + "+++++++++++++++++++++++++++++++++++++++++++++++++"));
        // Room 8
        rooms.add(new Room("\n***********\n* Library *\n***********\n\n"
                + "The library looks like it's the oldest room in the mansion.\n"
                + "A few books and pages lies scattered across the floor.\n"));
        // Room 9
        rooms.add(new Room("\n***************\n* Hidden Room *\n***************\n\n"
                + "As you enter the hidden room you step in something sticky\n"
                + "You examine the sticky substance and soon you realize\n"
                + "that it's a pool of blood and guts!\n"
                + "What could have made this mess?"));
        // Room 10
        rooms.add(new Room("\n***********\n* Bedroom *\n***********\n\n"
                + "In the bedroom stands a large bed full of dust\n"
                + "the last thing that slept there was probably a spider."));
        // Room 11
        rooms.add(new Room("\n****************\n* Storage Room *\n****************\n\n"
                + "The storage room is full of old crates and barrels.\n"
                + "You begin to wonder what they might contain."));
        // Room 12
        rooms.add(new Room("\n**********\n* Garden *\n**********\n\n"
                + "The garden is a cold and dark place.\n"
                + "The gardens edge is guarded by a tall fence, leaving you no escape.\n"
                + "The atmosphere has an eerie feeling."));
        // Room 13
        rooms.add(new Room("\n**************\n* Laboratory *\n**************\n\n"
                + "The laboratory is equipped with old sophisticated tools\n"
                + "and shelfs full of jars with dead rats inside a greenish liquid."));
        // Room 14        
        rooms.add(new Room("\n*******************\n* Western Hallway *\n*******************\n\n"
                + "The western hallway is narrow with a floor of slate grey tiles\n"
                + "and walls of the same colour.\n"));
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
            setCurrentRoom(select, validDirections);
            winGame();
        }
        
    }


    private void setCurrentRoom(int input, ArrayList<String> validDirections1)  
    {
        switch(validDirections1.get(input)){
            case NORTH:  rx = rx.getNorth(); break;
            case SOUTH: rx = rx.getSouth(); break;
            case EAST: rx = rx.getEast(); break;
            case WEST: rx = rx.getWest(); break;
            default: //ignore
        }
            validDirections.clear();
    }
    
    private void winGame() 
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

}
