import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The screen that appears when the game ends 
 * Has options of playing again or exiting the game
 * 
 * @author Jolie 
 * @version June 2022
 */
public class EndScreen extends World
{
    /**
     * Constructor for objects of class EndScreen.
     * 
     */
    public EndScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
    }
    
    /**
     * Control options when game ends
     */
    public void act()
    {
        if(Greenfoot.isKeyDown("space"))
        {
            MyWorld gameWorld = new MyWorld();
            Greenfoot.setWorld(gameWorld);
        }
        if(Greenfoot.isKeyDown("backspace"))
        {
            TitleScreen beginning = new TitleScreen();
            Greenfoot.setWorld(beginning);
        }
    }
}
