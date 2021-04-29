import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class B7 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class B7 extends Actor
{
    /**
     * Act - do whatever the B7 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(Greenfoot.mouseClicked(this) && Mundo.op.equals(""))
        {
            setLocation(167, 405);
            Mundo.num1 += "7";
        }
        else if(Greenfoot.mouseClicked(this) && !Mundo.op.equals(""))
        {
            setLocation(167, 405);
            Mundo.num2 += "7";
        }else {setLocation(165, 403);}
    }    
}
