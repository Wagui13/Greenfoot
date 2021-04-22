import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ParOuImpar extends World
{
    public static String r;
    public static byte v;
    
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public ParOuImpar()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(483, 600, 1);          
                        
        addObject(new B0(), 241, 300);
        addObject(new B1(), 241, 300);
        addObject(new B2(), 241, 300);
        addObject(new B3(), 241, 300);
        addObject(new B4(), 241, 300);
        addObject(new B5(), 241, 300);
        addObject(new B6(), 241, 300);
        addObject(new B7(), 241, 300);
        addObject(new B8(), 241, 300);
        addObject(new B9(), 241, 300);
        addObject(new Resposta(), 241, 300);
        r = "";
        v = 0;
    }

    public void act(){        
        showText("" + r, 180, 201);        
    }
}
