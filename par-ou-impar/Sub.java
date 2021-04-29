import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Sub here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Sub extends Actor
{
    /**
     * Act - do whatever the Sub wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(Greenfoot.mouseClicked(this))
        {
            setLocation(315, 469);
            Mundo.op = "-";
        }else{setLocation(313, 467);} 
    }    
}
