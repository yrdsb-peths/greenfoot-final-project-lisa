import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Person here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fairy extends Actor
{
    /**
     * Act - do whatever the Person wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // move the person
        if (Greenfoot.isKeyDown("left")){
            move (-2);
        }
        if (Greenfoot.isKeyDown("right")){
            move (2);
        }
    }    
}
