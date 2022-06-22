import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Green coloured candy
 * 
 * @author Jolie
 * @version June 2022
 */
public class Candy extends Actor
{
    /**
     * Act - do whatever the Candy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Sets the sizing and image on main world
        GreenfootImage candy = getImage();
        candy.scale(45,40);
        int x = getX();
        int y = getY();
        
        setLocation (x,y);
        
        MyWorld world = (MyWorld) getWorld();
    }
}
