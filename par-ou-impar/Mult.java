import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Mult here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Mult extends Actor
{
    /**
     * Act - do whatever the Mult wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(Greenfoot.mouseClicked(this))
        {
            setLocation(167, 469);
            Mundo.op = "*";
        }else{setLocation(165, 467);} 
    }    
}
