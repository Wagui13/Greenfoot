import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Resposta here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Resposta extends Actor
{
    static float resp;
    /**
     * Act - do whatever the Resposta wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(Greenfoot.mouseClicked(this) && Mundo.op.equals("")){                       
           setLocation(279, 507);           
           
           float num = Integer.parseInt(Mundo.num1);
           num %= 2;   
           if(num == 0){                               
                getWorld().addObject(new Par(), 241, 204);
           }else{getWorld().addObject(new Impar(), 241, 204);}
        }            
        else if(Greenfoot.mouseClicked(this) && !Mundo.op.equals(""))
        {
           float num1 = Integer.parseInt(Mundo.num1);
           float num2 = Integer.parseInt(Mundo.num2);           
           Mundo.num2 = Calcular(num1, Mundo.op, num2);
            
           float num = Float.parseFloat(Calcular(num1, Mundo.op, num2));
           num %= 2;   
           if(num == 0){                               
                getWorld().addObject(new Par(), 241, 204);
           }else{getWorld().addObject(new Impar(), 241, 204);}                                        
        }
        else{setLocation(277, 505);}
    }    
    
    public static String Calcular(float num1, String op, float num2)
    {
        switch(op)
        {
            case "+": resp = num1 + num2; break;
            case "-": resp = num1 - num2; break;
            case "*": resp = num1 * num2; break;
            case "/": resp = num1 / num2; break;
        }
        return resp + "";
    }
    
    
    
}
