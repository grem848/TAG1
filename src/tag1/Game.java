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
        ArrayList<String> validDirections = new ArrayList<>();
        
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
        rooms.add(new Room("Entrance \nA long hallway, the door behind you is locked.\nThere is a door to the North."));
        // Room 1
        rooms.add(new Room("A room with a painting"));
        // Room 2
        rooms.add(new Room("Winner winner chicken dinner!\nYou found the treasure room and won the game!"));
    }
    private void setDirections() 
    {
        // Room 0
        rooms.get(0).setNorth(rooms.get(1));
        // Room 1
        rooms.get(1).setSouth(rooms.get(0));
        rooms.get(1).setEast(rooms.get(2));
        rooms.get(1).setWest(rooms.get(?));
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
        while(!rx.equals(rooms.get(2)))
        {
            io.put(rx.getDescription());
            getValidDirections();
            int select = io.select("\n\nPick a direction to go\n", validDirections, "");
            System.out.println(select);
            goToRoom(select); // New
            chickenDinner(); // New
        }
        
    }


    private void goToRoom(int input) 
    { // New Method
        
            if (input == 0)
            {
                rx = rx.getNorth();
            }
            if (input == 1)
            {
                rx = rx.getSouth();
            }            
            if (input == 2)
            {
                rx = rx.getEast();
            }            
            if (input == 3)
            {
                rx = rx.getWest();
            }
            validDirections.clear();
    }
    
    private void chickenDinner() 
    { // New Method
        if (rx.equals(rooms.get(2)))
        {
            System.out.println(rooms.get(2).getDescription());
            System.out.println("\n(╯°□°）╯︵ ┻━┻");
            System.out.println("\nPress F6 to play again!");
            System.out.println("\n┬─┬﻿ ノ( ゜-゜ノ)\n");
        }
        
    }            
            
    private void getValidDirections() 
    {
        
        if (!(rx.getNorth() == null)) 
        {
            validDirections.add("Go North");
        }
        if (!(rx.getSouth() == null)) 
        {
            validDirections.add("Go South");
        }
        if (!(rx.getEast() == null)) 
        {
            validDirections.add("Go East");
        }
        if (!(rx.getWest() == null)) 
        {
            validDirections.add("Go West");
        }
        
    }

//    System.out.println(name + ", " + "ow you hit a wall!");
//    
//    if (!(System.in == Arrays.asList(0)))
//    {
//        System.out.println(name + ", " + "ow you hit a wall!");
//    }
}
