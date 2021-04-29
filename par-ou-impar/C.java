import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Igual here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class C extends Actor
{
    /**
     * Act - do whatever the Igual wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(Greenfoot.mouseClicked(this)){
          setLocation(170, 507);
          Mundo.numero = "0";
          Mundo.num1 = "";
          Mundo.num2 = "";
          Mundo.op = "";
          getWorld().removeObjects(getWorld().getObjects(Impar.class));
          getWorld().removeObjects(getWorld().getObjects(Par.class));
        }else{setLocation(168, 505);}       
    }    
    
    
}
