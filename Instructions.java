import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Instructions here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Instructions extends World
{
    Label instructions1 = new Label("Use w,a,s,d to move", 50);
    Label instructions2 = new Label("Eat the gummies", 50);
    Label instructions3 = new Label ("Yellow gummies are worth one point", 35);
    Label instructions4 = new Label ("blue gummies are worth two",35);
    Label instructions5 = new Label ("green gummies are worth three",35);
    Label instructions6 = new Label ("the more the gummy is worth,",35);
    Label instructions7 = new Label ("the more bombs it spawns",35);
    Label instructions8 = new Label("Avoid the bomb", 50);
    Label instructions9 = new Label ("Press space to start", 50);
    /**
     * Constructor for objects of class Instructions.
     * 
     */
    public Instructions()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        
        addObject (instructions1, getWidth()/2, 100);
        addObject (instructions2, getWidth()/2, 150);
        addObject (instructions3, getWidth()/2, 180);
        addObject (instructions4, getWidth()/2, 210);
        addObject (instructions5, getWidth()/2, 240);
        addObject (instructions6, getWidth()/2, 270);
        addObject (instructions7, getWidth()/2, 300);
        addObject (instructions8, getWidth()/2, 340);
        addObject (instructions9, getWidth()/2, 380);
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

