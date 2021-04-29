import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class B0 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class B0 extends Actor
{
    /**
     * Act - do whatever the B0 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(Greenfoot.mouseClicked(this) && Mundo.op.equals(""))
        {
            setLocation(241, 456);
            Mundo.num1 += "0";
        }
        else if(Greenfoot.mouseClicked(this) && !Mundo.op.equals(""))
        {
            setLocation(241, 456);
            Mundo.num2 += "0";
        }else{setLocation(239, 454);}
    }    
}
