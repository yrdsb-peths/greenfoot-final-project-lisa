import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The End Screen of the Game
 * 
 * @author Lisa Zhao
 * @version June 13, 2022
 */
public class EndScreen extends World
{
    Label scoreLabel;
    /**
     * Constructor for objects of class EndScreen.
     * 
     */
    public EndScreen()
    {    
        // Create a new world with 400x700 cells with a cell size of 1x1 pixels.
        super(400, 700, 1); 
        
        //Show player's final score (score is 200 because player wins game at 200 points)
        scoreLabel = new Label(200, 80);
        addObject(scoreLabel, 200, 100);
        
        //Add game title
        GameTitle gameTitle = new GameTitle();
        addObject(gameTitle, 200, 200);
        
        //Add end game graphic
        EndGraphic endGraphic = new EndGraphic();
        addObject(endGraphic, 200, 450);
    }
    
    public void act()
    {
        //Allow the player to return to Title Screen if "backspace" is pressed
        if (Greenfoot.isKeyDown("backspace"))
        {
            TitleScreen titleScreen = new TitleScreen();
            Greenfoot.setWorld(titleScreen);
        }
    }
}
