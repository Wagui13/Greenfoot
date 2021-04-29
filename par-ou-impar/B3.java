import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class B3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class B3 extends Actor
{
    /**
     * Act - do whatever the B3 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(Greenfoot.mouseClicked(this) && Mundo.op.equals(""))
        {
            setLocation(315, 313);
            Mundo.num1 += "3";
        }
        else if(Greenfoot.mouseClicked(this) && !Mundo.op.equals(""))
        {
            setLocation(315, 313);
            Mundo.num2 += "3";
        }else {setLocation(313, 311);}
    }    
}
