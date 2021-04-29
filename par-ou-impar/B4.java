import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class B4 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class B4 extends Actor
{
    /**
     * Act - do whatever the B4 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(Greenfoot.mouseClicked(this) && Mundo.op.equals(""))
        {
            setLocation(167, 359);
            Mundo.num1 += "4";
        }
        else if(Greenfoot.mouseClicked(this) && !Mundo.op.equals(""))
        {
            setLocation(167, 359);
            Mundo.num2 += "4";
        }else {setLocation(165, 357);}
    }    
}
