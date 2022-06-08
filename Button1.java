import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * A button to press and switch from Title Screen to Instructions Screen.
 * 
 * @author Lisa Zhao
 * @version June 3, 2022
 */
public class Button1 extends Actor
{
    //Add image from files
    GreenfootImage button1 = new GreenfootImage("images/instrucButton.png");
    
    /**
     * Constructor for the Button1 class
     */
    public Button1()
    {
        //Set image and image size
        button1.scale(200,60);
        setImage(button1);
    }
    
    /**
     * Act - do whatever the Button wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {       
        // Switch screens when clicked
        if (Greenfoot.mousePressed(this))
        {
            Greenfoot.setWorld (new Instructions());
        }
    }    
}
