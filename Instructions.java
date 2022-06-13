import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The Instructions Screen, display instructions and tell the story.
 * 
 * @author Lisa Zhao
 * @version June 7, 2022
 */
public class Instructions extends World
{
    /**
     * Constructor for objects of class Instructions.
     */
    public Instructions()
    {    
        // Create a new world with 400x700 cells with a cell size of 1x1 pixels.
        super(400, 700, 1, false); 
        
        //Add instructions image to Instructions screen
        GameInstructions gameInstructions = new GameInstructions();
        addObject(gameInstructions, 200, 300);
      
        //Add button to switch to MyWorld (aka the game screen)
        Button2 startButton = new Button2();
        addObject(startButton, 200, 550);
    }
}
