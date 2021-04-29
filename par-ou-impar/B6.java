import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class B6 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class B6 extends Actor
{
    /**
     * Act - do whatever the B6 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(Greenfoot.mouseClicked(this) && Mundo.op.equals(""))
        {
            setLocation(315, 359);
            Mundo.num1 += "6";
        }
        else if(Greenfoot.mouseClicked(this) && !Mundo.op.equals(""))
        {
            setLocation(315, 359);
            Mundo.num2 += "6";
        }else {setLocation(313, 357);}
    }    
}
