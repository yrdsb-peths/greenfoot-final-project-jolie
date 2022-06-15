import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The initial game start screen
 * Has the options of starting the game or reviewing instructions
 * 
 * @author Jolie
 * @version June 2022
 */
public class TitleScreen extends World
{
    
    /**
     * Constructor for objects of class TitleScreen.
     * 
     */
    public TitleScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
    }
    
    /**
     * Options of starting the game or reviewing instructions
     */
    public void act()
    {
        if(Greenfoot.isKeyDown("space"))
        {
            MyWorld gameWorld = new MyWorld();
            Greenfoot.setWorld(gameWorld);
        }
        if(Greenfoot.isKeyDown("i"))
        {
            Instructions help = new Instructions();
            Greenfoot.setWorld(help);
        }
    }
}
