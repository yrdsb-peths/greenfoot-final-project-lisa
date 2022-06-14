import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Title Screen for the game
 * 
 * @author Lisa Zhao
 * @version June 3, 2022
 */
public class TitleScreen extends World
{
    GreenfootSound backgroundMusic = new GreenfootSound("backgroundMusic.wav");
    /**
     * Constructor for objects of class TitleScreen.
     * 
     */
    public TitleScreen()
    {    
        // Create a new world with 400x700 cells with a cell size of 1x1 pixels.
        super(400, 700, 1); 
        
        //Add game title
        GameTitle gameTitle = new GameTitle();
        addObject(gameTitle, 200, 350);
        
        //Add a Fairy on the Title Screen
        prepare();
        
        //Add button to switch screen to Instructions screen
        Button1 instructionsButton = new Button1();
        addObject(instructionsButton, 200, 480);
        
        //Add button to switch screen to MyWorld (aka the game screen)
        Button2 startButton = new Button2();
        addObject(startButton, 200, 550);
        
    }
    
    public void act()
    {
        backgroundMusic.play();
    }
    
    //Prepare a Fairy on the Title Screen
    public void prepare()
    {
        Fairy f1 = new Fairy();
        addObject(f1, 200, 150);
    }
}
