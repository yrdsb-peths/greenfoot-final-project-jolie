import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    public int score = 0; 
    public Label scoreLabel = new Label (score, 100);
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        
        Character hi = new Character();
        addObject (hi, 300, 350);
        
        spawnGummy();
        spawnBomb();
        spawnPudding();
        
        addObject(scoreLabel, 50, 50);
        
    }
    
    public void spawnGummy()
    {
        int x = Greenfoot.getRandomNumber(600);
        int y = Greenfoot.getRandomNumber(400);
        
        Gummy qq = new Gummy();
        addObject(qq, x, y);
    }
    public void spawnBomb()
    {
        int x = Greenfoot.getRandomNumber(600);
        int y = Greenfoot.getRandomNumber(400);
        
        Bomb gone = new Bomb();
        addObject(gone, x, y);

    }
    public void spawnPudding()
    {
        int x = Greenfoot.getRandomNumber(600);
        int y = Greenfoot.getRandomNumber(400);
        
        Pudding boing = new Pudding();
        addObject(boing, x, y);

    }
    public void increaseScoreG()
    {
        score++;
        scoreLabel.setValue(score);
    }
    public void increaseScoreP()
    {
        score+=2;
        scoreLabel.setValue(score);
    }
    public void gameOver()
    {
        Label gameOverLabel = new Label ("Game over!" , 100);
        addObject (gameOverLabel, 300, 200);
    }
}
