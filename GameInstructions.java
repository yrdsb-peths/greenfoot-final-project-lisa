import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameInstructions here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameInstructions extends Actor
{
    //Add Game Instructions image from files
    GreenfootImage gameInstructions = new GreenfootImage("images/gameInstructions.png");
    
    /**
     * Constructor for GameInstructions
     */
    public GameInstructions()
    {
        //Set image and image size
        gameInstructions.scale(350, 350);
        setImage(gameInstructions);
    }
}
