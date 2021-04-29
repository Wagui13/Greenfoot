import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
  
/**
 * Write a description of class B9 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class B9 extends Actor
{
    /**
     * Act - do whatever the B9 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(Greenfoot.mouseClicked(this) && Mundo.op.equals(""))
        {
            setLocation(315, 405);
            Mundo.num1 += "9";
        }
        else if(Greenfoot.mouseClicked(this) && !Mundo.op.equals(""))
        {
            setLocation(315, 405);
            Mundo.num2 += "9";
        }else {setLocation(313, 403);}
    }    
}
