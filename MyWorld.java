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
    public Enemy tracker;
    Label scoreLabel;
    /**
     * Constructor for objects of class MyWorld.
     */
    public MyWorld()
    {    
        // Create a new world with 400x700 cells with a cell size of 1x1 pixels.
        super(400, 700, 1, false); 
        
        // Add a fairy to the world
        Fairy f1 = new Fairy();
        addObject(f1, 200, 600);
        
        //Create a label to keep score
        scoreLabel = new Label(0, 40);
        addObject(scoreLabel, 50, 50);
        
        // Add a enemies to the world
        enemyRows();
    }
    
    public void act()
    {
        if (score < 200)
        {
            if (tracker.getY() >= 100)
           {
               enemyRows();
           }
        }
        else
        {
            winGame();
        }
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
    
    public void winGame()
    {
        Label winGameLabel = new Label("YOU WIN!", 72);
        addObject(winGameLabel, 200, 350);
    }
   
    /**
     * Add enemies by row
     */
    public void enemyRows()
    {
        Enemy et = new Enemy();
        addObject(et, -50, 0);
        tracker = et;
        Enemy e1 = new Enemy();
        addObject(e1, 50, 0);
        Enemy e2 = new Enemy();
        addObject(e2, 150, 0);
        Enemy e3 = new Enemy();
        addObject(e3, 250, 0);
        Enemy e4 = new Enemy();
        addObject(e4, 350, 0);
    }
    
}
