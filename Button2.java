import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * A button to press and switch from Title Screen to the game.
 * 
 * @author Lisa Zhao
 * @version June 6, 2022
 */
public class Button2 extends Actor
{
    //Add image from files
    GreenfootImage startButton = new GreenfootImage("startButton.png");
    
    /**
     * Constructor
     */
    public Button2()
    {
        //Set image and image size
        startButton.scale(200,60);
        setImage(startButton);
    }
    
    /**
     * Act - do whatever the Button2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        //Switch screens pressed/clicked
        if (Greenfoot.mousePressed(this))
        {
            Greenfoot.setWorld (new MyWorld());
        }
    }
}
