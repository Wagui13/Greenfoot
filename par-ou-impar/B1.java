import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class B1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class B1 extends Actor
{
    /**
     * Act - do whatever the B1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {               
        if(Greenfoot.mouseClicked(this) && Mundo.op.equals(""))
        {
            setLocation(167, 313);
            Mundo.num1 += "1";
        }
        else if(Greenfoot.mouseClicked(this) && !Mundo.op.equals(""))
        {
            setLocation(167, 313);
            Mundo.num2 += "1";
        }else {setLocation(165, 311);}
    }    
}
