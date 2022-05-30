import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The bullet class, the powers the fairy uses to defeat enemies.
 * 
 * @author Lisa Zhao 
 * @version May 26, 2022
 */
public class Bullet extends Actor
{
    GreenfootImage bullet0 = new GreenfootImage("images/bullets/bullet0.png");
    
    public Bullet()
    {
        bullet0.scale(50,50);
        setImage(bullet0);    
    }
    
    /**
     * Make the bullet "kill" the enemy
     */
    public void kill()
    {
        if (isTouching(Enemy.class))
        {
            removeTouching(Enemy.class);
            MyWorld world = (MyWorld) getWorld();
            
            //increase score once an enemy is killed
            world.increaseScore();
            
            //remove the bullet once it has been used
            world.removeObject(this);
        }
    }
  
    /**
     * Act - do whatever the Bullet wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */ 
    public void act()
    {
        // Add your action code here.
        setLocation(getX(), getY()-5);
        
        //remove bullets once they touch the edge of the world
        if(getY() <= 0)
        {
            getWorld().removeObject(this);
        }
        else
        {
            //kill the enemies if the bullet is still in the world
            kill();
        }
    }
}
