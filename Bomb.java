import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bomb here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bomb extends Actor
{
    /**
     * Act - do whatever the Bomb wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GreenfootImage[] idle = new GreenfootImage[5]; 
    public void act() 
    {
        // Add your action code here.
        int x = getX();
        int y = getY();
        
        setLocation (x,y);
        
        MyWorld world = (MyWorld) getWorld();
        
        animateBomb();
    }
    
    public void Character()
    {
        for (int i = 0; i < 5; i++)
        {
            idle[i] = new GreenfootImage("images/bomb" + i + ".png");
        }
    }
    int imageIndex = 0;
    public void animateBomb()
    {
        if (isTouching(Character.class))
        {
            setImage(idle[imageIndex]);
            imageIndex = (imageIndex+1) % idle.length;
        }
    }
}
