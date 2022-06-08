import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The Fairy, the hero of the game, controlled by the player.
 * 
 * @author Lisa Zhao 
 * @version May 26, 2022
 */
public class Fairy extends Actor
{
    //Add image from files - as an array to animate
    GreenfootImage[] idleRight = new GreenfootImage[7];
    GreenfootImage[] idleLeft = new GreenfootImage[7];
    
    //Direction the fairy is facing
    String facing = "right";
    
    //Add an animation timre to slow down the animation
    SimpleTimer animationTimer = new SimpleTimer();
    /**
     * Constructor for the fairy class
     */
    public Fairy()
    {
        for (int i = 0; i < idleRight.length; i++)
        {
            idleRight[i] = new GreenfootImage("images/fairy1_idle/1idle"+ i + ".png");
            idleRight[i].scale(150,150);
        }
        //Mirror the image when fairy is moving left
        for (int i = 0; i < idleLeft.length; i++)
        {
            idleLeft[i] = new GreenfootImage("images/fairy1_idle/1idle"+ i + ".png");
            idleLeft[i].mirrorHorizontally();
            idleLeft[i].scale(150,150);
        }
        
        //Add timer to slow down animation
        animationTimer.mark();
        
        //Set inital fairy image
        setImage(idleRight[0]);
    }
    
    int imageIndex = 0;
    /**
     * Animate the fairy
     */
    public void animateFairy()
    {
        //Slow down animation speed
        if (animationTimer.millisElapsed() < 200)
        {
            return;
        }
        
        animationTimer.mark();
        
        if (facing.equals("right"))
        {
            setImage(idleRight[imageIndex]);
            imageIndex = (imageIndex + 1) % idleRight.length;
        }
        else
        {
            setImage(idleLeft[imageIndex]);
            imageIndex = (imageIndex +1) % idleLeft.length;
        }
    }
    
    /**
     * Act - do whatever the Person wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Move the fairy
        if (Greenfoot.isKeyDown("left"))
        {
            move (-2);
            facing = "left";
        }
        if (Greenfoot.isKeyDown("right"))
        {
            move (2);
            facing = "right";
        }
        
        //Animate the fairy
        animateFairy();
        
        //Shoot a bullet/use powers if the space key is down
        //Do not allow continuous shooting by holding down the space key
        if("space".equals(Greenfoot.getKey()))
        {
            getWorld().addObject(new Bullet(), getX(), getY()-90);
        }
    }
}    
