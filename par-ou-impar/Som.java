import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Som here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Som extends Actor
{
    /**
     * Act - do whatever the Som wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(Greenfoot.mouseClicked(this))
        {
            setLocation(315, 443);
            Mundo.op = "+";
        }else{setLocation(313, 441);} 
    }    
}
