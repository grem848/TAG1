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

        rooms.add(new Room("Entrance \nA long hallway, the door behind you is locked.\nThere is a door to the North."));
        rooms.add(new Room("A room with a painting"));
        rooms.add(new Room("Winner winner chicken dinner!\nYou found the treasure room and won the game!"));

        rooms.get(0).setNorth(rooms.get(1));
        rooms.get(1).setSouth(rooms.get(0));
        rooms.get(1).setNorth(rooms.get(2));
        rooms.get(2).setSouth(rooms.get(1));

        rx = rooms.get(0);
        play();
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
