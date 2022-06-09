import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The enemy our fairy must fight.
 * 
 * @author Lisa Zhao 
 * @version May 27, 2022
 */
public class Enemy extends Actor
{
    //Add images from files as an array to animate
    GreenfootImage[] idleEnemy = new GreenfootImage[10];
    
    //Add an animation timer to slow down animation
    SimpleTimer animationTimer = new SimpleTimer();
    
    //Add a speed int
    int speed = 1;
    /**
     * Constructor for the enemy class
     */
    public Enemy()
    {
        //No need for image mirroring as Enemy only moves down
        for (int i = 0; i < idleEnemy.length; i++)
        {
            idleEnemy[i] = new GreenfootImage("images/enemy1_idle/idle"+ i + ".png");
            idleEnemy[i].scale(80,80);
        }
        
        //Add/implement animation timer
        animationTimer.mark();
        
        //Set initial enemy image
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
     * The enemy will "kill" the fairy
     */
    public void kill()
    {
        MyWorld world = (MyWorld) getWorld();
        if (isTouching(Fairy.class) && world.score < 200)
        {
            //Remove the Fairy and end the game if the Fairy is "killed"
            removeTouching(Fairy.class);
            world.gameOver();
        }
    }
    
    /**
     * Act - do whatever the Enemy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        //Animate the enemy
        animateEnemy();
        
        //Enemy moves downwards
        int x = getX();
        int y = getY() + speed;
        setLocation(x, y);
        
        //"Kill" fairy
        kill();
        
        //Remove Enemy once it gets to the edge of the world
        if(getY() >= 690)
        {
            MyWorld world = (MyWorld) getWorld();
            world.removeObject(this);
        }
    }
    
    public void setSpeed(int spd)
    {
        speed = spd;
    }
}
