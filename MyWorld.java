
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * MyWorld, the world the fairy lives in.
 * 
 * @author Lisa Zhao 
 * @version May 26, 2022
 */
public class MyWorld extends World
{
    public int score = 0;
    Label scoreLabel;
    /**
     * Constructor for objects of class MyWorld.
     */
    public MyWorld()
    {    
        // Create a new world with 400x700 cells with a cell size of 1x1 pixels.
        super(400, 700, 1); 
        
        // Add a fairy to the world
        Fairy f1 = new Fairy();
        addObject(f1, 200, 600);
        
        //Create a label to keep score
        scoreLabel = new Label(0, 40);
        addObject(scoreLabel, 50, 50);
        
        // Add a enemies to the world
        enemyRows();
    }
    
    /**
     * Increase score
     * Score is increase by 10 points every time an enemy is killed
     */
    public void increaseScore()
    {
        score+=10;
        scoreLabel.setValue(score);
    }
    
    /**
     * End the game and show "Game Over"
     */
    public void gameOver()
    {
        Label gameOverLabel = new Label("Game Over", 75);
        addObject(gameOverLabel, 200, 350);
    }
   
    /**
     * Add enemies by row
     */
    public void enemyRows()
    {
        Enemy e1 = new Enemy();
        addObject(e1, 50, 250);
        Enemy e2 = new Enemy();
        addObject(e2, 150, 250);
        Enemy e3 = new Enemy();
        addObject(e3, 250, 250);
        Enemy e4 = new Enemy();
        addObject(e4, 350, 250);
        Enemy e5 = new Enemy();
        addObject(e5, 50, 150);
        Enemy e6 = new Enemy();
        addObject(e6, 150, 150);
        Enemy e7 = new Enemy();
        addObject(e7, 250, 150);
        Enemy e8 = new Enemy();
        addObject(e8, 350, 150);
    }
}
