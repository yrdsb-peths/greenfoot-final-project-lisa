import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Title Screen for the game
 * 
 * @author Lisa Zhao
 * @version June 3, 2022
 */
public class TitleScreen extends World
{
    Label titleLabel = new Label ("Game Title TBD", 55);
    /**
     * Constructor for objects of class TitleScreen.
     * 
     */
    public TitleScreen()
    {    
        // Create a new world with 400x700 cells with a cell size of 1x1 pixels.
        super(400, 700, 1, false); 
        addObject(titleLabel, 200, 350);
        
        Button1 instructionsButton = new Button1();
        addObject(instructionsButton, 200, 450);
        
        Button2 startButton = new Button2();
        addObject(startButton, 200, 550);
        
    }
}
