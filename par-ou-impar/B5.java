import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class B5 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class B5 extends Actor
{
    /**
     * Act - do whatever the B5 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(Greenfoot.mouseClicked(this) && Mundo.op.equals(""))
        {
            setLocation(241, 359);
            Mundo.num1 += "5";
        }
        else if(Greenfoot.mouseClicked(this) && !Mundo.op.equals(""))
        {
            setLocation(241, 359);
            Mundo.num2 += "5";
        }else {setLocation(239, 357);}
    }    
}
