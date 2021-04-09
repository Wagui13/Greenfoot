import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class EasterEgg here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EasterEgg extends Actor
{
    /**
     * Act - do whatever the EasterEgg wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(isTouching(MarioAlberto.class)){
         removeTouching(MarioAlberto.class);
         Greenfoot.playSound("smb_powerup.wav");
         getWorld().addObject(new MarioAberto(), 6, 80);
        }
    }    
}
