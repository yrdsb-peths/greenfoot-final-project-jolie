import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Instructions here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Instructions extends World
{
    Label instructions1 = new Label("Use w,a,s,d to move", 70);
    Label instructions2 = new Label("Eat the gummies", 70);
    Label instructions3 = new Label ("Yellow gummies are worth one point", 40);
    Label instructions4 = new Label ("and blue gummies are worth two",40);
    Label instructions5 = new Label("Avoid the bomb", 70);
    /**
     * Constructor for objects of class Instructions.
     * 
     */
    public Instructions()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        
        addObject (instructions1, getWidth()/2, 100);
        addObject (instructions2, getWidth()/2, 170);
        addObject (instructions3, getWidth()/2, 220);
        addObject (instructions4, getWidth()/2, 260);
        addObject (instructions5, getWidth()/2, 310);
    }
    
    public void act()
    {
        if(Greenfoot.isKeyDown("space"))
        {
            MyWorld gameWorld = new MyWorld();
            Greenfoot.setWorld(gameWorld);
        }
    }
}

