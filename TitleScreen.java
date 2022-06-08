import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Title Screen for the game
 * 
 * @author Lisa Zhao
 * @version June 3, 2022
 */
public class TitleScreen extends World
{
    /**
     * Constructor for objects of class TitleScreen.
     * 
     */
    public TitleScreen()
    {    
        // Create a new world with 400x700 cells with a cell size of 1x1 pixels.
        super(400, 700, 1, false); 
        
        //Add game title
        GameTitle gameTitle = new GameTitle();
        addObject(gameTitle, 200, 350);
        
        //Add button to switch screen to Instructions screen
        Button1 instructionsButton = new Button1();
        addObject(instructionsButton, 200, 450);
        
        //Add button to switch screen to MyWorld (aka the game screen)
        Button2 startButton = new Button2();
        addObject(startButton, 200, 550);
        
    }
}
