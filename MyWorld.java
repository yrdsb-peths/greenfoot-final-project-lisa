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
    Label gameOverLabel = new Label("Game Over", 75);
    int level = 1;
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
        //Continuously add Enemy by row until the player "dies" or wins
        if (score <= 200)
        {
           //Add ne Enemy row once rows are 100 cells apart
            if (tracker.getY() >= 100)
           {
               //Add Enemy by row
               enemyRows();
           }
        }
        else
        {
            //Make the player win the game
            winGame();
        }
        
        //Allow the player to restart the game if "enter" is pressed
        if (Greenfoot.isKeyDown("enter"))
        {
            setScore(0);
            MyWorld restartScreen = new MyWorld();
            Greenfoot.setWorld(restartScreen);
        }
        
        //Allow the player to return to Title Screen if "backspace" is pressed
        if (Greenfoot.isKeyDown("backspace"))
        {
            TitleScreen titleScreen = new TitleScreen();
            Greenfoot.setWorld(titleScreen);
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
        if(score % 50 == 0)
        {
            level += 1;
        }
    }
    
    /**
     * End the game and show "Game Over"
     */
    public void gameOver()
    {
        addObject(gameOverLabel, 200, 350);
        Label startOverLabel = new Label("Press <enter> to try again!", 40);
        addObject(startOverLabel, 200, 400);
        Label homeScreenLabel = new Label("Press <backspace> to exit", 30);
        addObject(homeScreenLabel, 200, 450);
    }
    
    /**
     * End game and show "YOU WIN!"
     */
    public void winGame()
    {
        //If Fairy dies but gets enough points, "game over" disappears
        removeObject(gameOverLabel);
        
        //Swtich to end game screen
        Greenfoot.setWorld (new EndScreen());
    }
   
    /**
     * Add enemies by row
     */
    public void enemyRows()
    {
        //Create a tracker Enemy to track spacing between rows
        Enemy et = new Enemy();
        addObject(et, -500, 0);
        et.setSpeed(level);
        tracker = et;
        
        //Create a row of enemies
        Enemy e1 = new Enemy();
        e1.setSpeed(level);
        addObject(e1, 50, 0);
        Enemy e2 = new Enemy();
        e2.setSpeed(level);
        addObject(e2, 150, 0);
        Enemy e3 = new Enemy();
        e3.setSpeed(level);
        addObject(e3, 250, 0);
        Enemy e4 = new Enemy();
        e4.setSpeed(level);
        addObject(e4, 350, 0);
    } 
    
    /**
     * Set new score
     */
    public void setScore(int newScore)
    {
        score = newScore;
    }
}
