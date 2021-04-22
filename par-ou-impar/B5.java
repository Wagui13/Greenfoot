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
    ParOuImpar butao;
    ParOuImpar velo;
    public void act() 
    {
        if(Greenfoot.isKeyDown("5")){
          setLocation(243, 302);
          velo.v++;
          if(velo.v == 4){
            butao.r += "5";
            velo.v = -4;         
          }
        }else{setLocation(241, 300);}
    }    
}
