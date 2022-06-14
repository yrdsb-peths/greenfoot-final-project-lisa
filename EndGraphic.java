import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class EndGraphic here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EndGraphic extends Actor
{
    //Add the End Game graphic from images
    GreenfootImage endGraphic = new GreenfootImage("images/endGame.png");
    
    /**
     * Constructor
     */
    public EndGraphic()
    {
        //Set image and image size
        endGraphic.scale(350,350);
        setImage(endGraphic);
    }
}
