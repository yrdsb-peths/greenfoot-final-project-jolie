import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Blue coloured candy
 * 
 * @author Jolie
 * @version June 2022
 */
public class Pudding extends Actor
{
    /**
     * Act - do whatever the Pudding wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        GreenfootImage pudding = getImage();
        pudding.scale(45,40);
        int x = getX();
        int y = getY();
        
        setLocation (x,y);
        
        MyWorld world = (MyWorld) getWorld();
    }
}
