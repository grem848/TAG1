/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tag1;

import java.io.IOException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import textio.*;

/**
 *
 * @author Andreas Heick Laptop
 */
public class GameTest
{
    Monster monster = new Monster("Erik", 1000, 2500, 200);
    Player player = new Player("Bob", "Bobsen", 200);
    Room rx = null;
    Room mrx = null;
    TextIO io = null;
    
    public GameTest()
    {
        
    }
    
    @BeforeClass
    public static void setUpClass()
    {
        
    }
    
    @AfterClass
    public static void tearDownClass()
    {
        
    }
   
    @After
    public void tearDown()
    {
        
    }

    @Test
    public void testPlayerWins() throws IOException, ClassNotFoundException 
    {
        new Game().combat(rx, mrx, io, player, monster);
    }
}
