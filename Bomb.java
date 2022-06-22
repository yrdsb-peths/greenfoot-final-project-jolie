import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The bomb falls and the character must avoid it 
 * 
 * @author Jolie
 * @version June 2022
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
        // Sets the sizing and image on main world and disappears at bottom
        int x = getX();
        int y = getY();
        setLocation (x, y+ (Greenfoot.getRandomNumber(6)));
        
        MyWorld world = (MyWorld) getWorld();
        if (getY() >= world.getHeight())
        {
            world.removeObject(this);
        }
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
