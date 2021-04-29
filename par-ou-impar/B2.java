import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class B2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class B2 extends Actor
{
    /**
     * Act - do whatever the B2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(Greenfoot.mouseClicked(this) && Mundo.op.equals(""))
        {
            setLocation(241, 313);
            Mundo.num1 += "2";
        }
        else if(Greenfoot.mouseClicked(this) && !Mundo.op.equals(""))
        {
            setLocation(241, 313);
            Mundo.num2 += "2";
        }else {setLocation(239, 311);}
    }    
}
