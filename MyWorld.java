import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The main game world
 * 
 * @author Jolie
 * @version June 2022
 */
public class MyWorld extends World
{
    public int score = 0; 
    public Label scoreLabel = new Label (score, 100);
    private int bombSpawnTimer;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1, false); 
        
        //Our main pink blob character
        Character hi = new Character();
        addObject (hi, 300, 350);
        
        //Spawns the objects in the game
        spawnGummy();
        spawnBomb();
        spawnCandy();
        spawnPudding();
    
        addObject(scoreLabel, 50, 50);
        
    }
    
    /**
     * Spawns the yellow candy
     */
    
    public void spawnGummy()
    {
        int x = Greenfoot.getRandomNumber(600);
        int y = Greenfoot.getRandomNumber(400);
        
        Gummy qq = new Gummy();
        addObject(qq, x, y);
    }
    
    /**
     * Spawns the blue candy
     */
    public void spawnPudding()
    {
    
        int x = Greenfoot.getRandomNumber(600);
        int y = Greenfoot.getRandomNumber(400);
        
        Pudding boing = new Pudding();
        addObject(boing, x, y);
    
    }
    
    /**
     * Spawns the green candy
     */
    public void spawnCandy()
    {
        int x = Greenfoot.getRandomNumber(600);
        int y = Greenfoot.getRandomNumber(400);
        
        Candy sweet = new Candy();
        addObject(sweet, x, y);
    }

    /**
     * Spawns the bomb
     */
    public void spawnBomb()
    {
        int x = Greenfoot.getRandomNumber(600);
        int y = 0;
        
        Bomb gone = new Bomb();
        addObject(gone, x, y);

    }
    
    /**
     * Score increase interval when yellow candy is eaten
     */
    public void increaseScoreG()
    {
        score++;
        scoreLabel.setValue(score);
    }
    
    /**
     * Score increase interval when blue candy is eaten
     */
    public void increaseScoreP()
    {
        score+=2;
        scoreLabel.setValue(score);
    }
    
    /**
     * Score increase interval when green candy is eaten
     */
    public void increaseScoreC()
    {
        score+=3;
        scoreLabel.setValue(score);
    }
}
