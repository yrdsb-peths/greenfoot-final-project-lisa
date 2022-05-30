import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The enemy our fairy must fight.
 * 
 * @author Lisa Zhao 
 * @version May 27, 2022
 */
public class Enemy extends Actor
{
    GreenfootImage[] idleEnemy = new GreenfootImage[10];
    SimpleTimer animationTimer = new SimpleTimer();
    /**
     * Constructor for the enemy class
     */
    public Enemy()
    {
        for (int i = 0; i < idleEnemy.length; i++)
        {
            idleEnemy[i] = new GreenfootImage("images/enemy1_idle/idle"+ i + ".png");
            idleEnemy[i].scale(80,80);
        }
        
        animationTimer.mark();
        
        //set initial enemy image
        setImage(idleEnemy[0]);
    }
    
    int imageIndex = 0;
    /**
     * Animate the enemy
     */
    public void animateEnemy()
    {
        if (animationTimer.millisElapsed() < 100)
        {
            return;
        }
        
        animationTimer.mark();
        
        setImage(idleEnemy[imageIndex]);
        imageIndex = (imageIndex + 1) % idleEnemy.length;
    }
    
    /**
     * The enemy will kill the fairy
     */
    public void kill()
    {
        if (isTouching(Fairy.class))
        {
            removeTouching(Fairy.class);
            MyWorld world = (MyWorld) getWorld();
            world.gameOver();
        }
    }
    
    /**
     * Act - do whatever the Enemy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public void act() 
    {
        //animate the enemy
        animateEnemy();
        
        //enemy moves downwards
        setLocation(getX(), getY()+1);
        
        //kill fairy
        kill();
        
        //add and respawn enemies
        
        //remove enemy once it gets to the edge of the world
        if(getY() >= 690)
        {
            MyWorld world = (MyWorld) getWorld();
            world.removeObject(this);
        }
    }
}
