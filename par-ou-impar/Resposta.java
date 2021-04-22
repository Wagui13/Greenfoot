import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Resposta here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Resposta extends Actor
{
    ParOuImpar butao;
    String a;
    String b;
    /**
     * Act - do whatever the Resposta wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(Greenfoot.isKeyDown("enter")){
           setLocation(243, 302);
           int num = Integer.parseInt(butao.r);
           num %= 2;            
           if(num == 0){
                b = "Par";                 
                getWorld().addObject(new Par(), 241, 300);
            }else{
                b = "Impar";
                getWorld().addObject(new Impar(), 241, 300);}
        }else{setLocation(241, 300);}
    }    
}
