import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 400x600 cells with a cell size of 1x1 pixels.
        super(400, 700, 1); 
        Fairy f1 = new Fairy();
        addObject(f1, 200, 610);
    }
}
