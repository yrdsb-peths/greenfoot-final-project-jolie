import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Character here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Character extends Actor
{
    GreenfootSound bubblePop = new GreenfootSound("sounds_QKTA234-pop.mp3"); 
    GreenfootImage[] idleRight = new GreenfootImage[4];
    GreenfootImage[] idleLeft = new GreenfootImage[4];
    private SimpleTimer timer;
    
    String facing = "right";
    
    public Character()
    {
        for (int i = 0; i < 4; i++)
        {
            idleRight[i] = new GreenfootImage("images/idle" + i + ".png");
            idleRight[i].scale(70,50);
        }
        for (int i = 0; i < 4; i++)
        {
            idleLeft[i] = new GreenfootImage ("images/idle" + i + ".png");
            idleLeft[i].mirrorHorizontally();
            idleLeft[i].scale(70,50);
        }
        timer = new SimpleTimer();
        timer.mark();
    }
    
    int imageIndex = 0;
    public void animateCharacter()
    {
        if (timer.millisElapsed() > 100)
        {
            {
                if (facing.equals("right"))
                {
                    setImage(idleRight[imageIndex]);
                    imageIndex = (imageIndex+1) % idleRight.length;
                }
                else
                {
                    setImage (idleLeft[imageIndex]);
                    imageIndex = (imageIndex+1) % idleRight.length;
                }
                timer.mark();
            }
        }
    }
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
            facing = "left";
        }
        if (Greenfoot.isKeyDown("d"))
        {
            setLocation (getX()+2, getY());
            facing = "right";
        }
        if (Greenfoot.isKeyDown("w"))
        {
            setLocation (getX(), getY()-2);
        }
        if (Greenfoot.isKeyDown("s"))
        {
            setLocation (getX(), getY()+2);
        }
        
        animateCharacter();
        eat();
        die();
    }
    public void eat()
    {
        if (isTouching(Gummy.class))
        {
            bubblePop.play();
            removeTouching(Gummy.class);
            MyWorld world = (MyWorld) getWorld();
            world.increaseScoreG();
            world.spawnGummy();
        }
        if (isTouching(Pudding.class))
        {
            bubblePop.play();
            removeTouching(Pudding.class);
            MyWorld world = (MyWorld) getWorld();
            world.increaseScoreP();
            world.spawnPudding();
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
