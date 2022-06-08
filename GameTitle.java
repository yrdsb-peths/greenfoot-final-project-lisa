import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameTitle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameTitle extends Actor
{
    //Add image from files
    GreenfootImage gameTitle = new GreenfootImage("images/gameTitle.png");
    
    /**
     * Constructor for GameTitle
     */
    public GameTitle()
    {
        //Set image and image size
        gameTitle.scale(350, 100);
        setImage(gameTitle);
    }
}
