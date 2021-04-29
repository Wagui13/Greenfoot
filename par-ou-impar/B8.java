import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class B8 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class B8 extends Actor
{
    /**
     * Act - do whatever the B8 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(Greenfoot.mouseClicked(this) && Mundo.op.equals(""))
        {
            setLocation(241, 405);
            Mundo.num1 += "8";
        }
        else if(Greenfoot.mouseClicked(this) && !Mundo.op.equals(""))
        {
            setLocation(241, 405);
            Mundo.num2 += "8";
        }else {setLocation(239, 403);}
    }    
}
