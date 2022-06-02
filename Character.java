import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Character here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Character extends Actor
{
    /**
     * Act - do whatever the Character wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        if (Greenfoot.isKeyDown("a"))
        {
            setLocation (getX()-2, getY());
        }
        if (Greenfoot.isKeyDown("d"))
        {
            setLocation (getX()+2, getY());
        }
        if (Greenfoot.isKeyDown("w"))
        {
            setLocation (getX(), getY()-2);
        }
        if (Greenfoot.isKeyDown("s"))
        {
            setLocation (getX(), getY()+2);
        }
        
        eat();
        die();
    }
    
    public void eat()
    {
        if (isTouching(Gummy.class))
        {
            removeTouching(Gummy.class);
            MyWorld world = (MyWorld) getWorld();
            world.increaseScore();
            world.spawnGummy();
        }
    }
    
    public void die()
    {
        if (isTouching(Bomb.class))
        {
            removeTouching(Bomb.class);
            MyWorld world = (MyWorld) getWorld();
            
            world.gameOver();
        }
    }
}

