import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TitleScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TitleScreen extends World
{
    Label titleLabel = new Label("Gummy", 100);
    Label bottomLabel = new Label ("Press space to begin", 50);
    Label instructionLabel = new Label ("Press 'i' for instructions", 50);
    /**
     * Constructor for objects of class TitleScreen.
     * 
     */
    public TitleScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        
        addObject (titleLabel, getWidth()/2, 150);
        addObject (bottomLabel, getWidth()/2, 230);
        addObject (instructionLabel, getWidth()/2, 300);
    }
    
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
