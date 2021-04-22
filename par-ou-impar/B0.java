import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class B0 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class B0 extends Actor
{
    /**
     * Act - do whatever the B0 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    ParOuImpar butao;
    public void act() 
    {
        if(Greenfoot.isKeyDown("0"))
        {
           butao.r = "0";
        }
    }    
}
