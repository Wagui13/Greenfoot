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
    ParOuImpar butao;
    ParOuImpar velo;
    public void act() 
    {        
        if(Greenfoot.isKeyDown("9")){
            setLocation(243, 302);
            velo.v++;
          if(velo.v == 4){
            butao.r += "9";
            velo.v = -4;         
          }
        }else{setLocation(241, 300);}
    }    
}
