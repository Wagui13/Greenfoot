import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Mundo extends World
{
    public static String numero;    
    static String num1;
    static String op;
    static String num2;
    static int resposta;
    static String tela;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public Mundo()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(483, 600, 1); 
        
        addObject (new B1(), 165, 311);
        addObject (new B2(), 239, 311);
        addObject (new B3(), 313, 311);
        addObject (new B4(), 165, 357);
        addObject (new B5(), 239, 357);
        addObject (new B6(), 313, 357);
        addObject (new B7(), 165, 403);
        addObject (new B8(), 239, 403);
        addObject (new B9(), 313, 403);
        addObject (new B0(), 239, 454);
        addObject (new Resposta(), 277, 505);
        addObject (new C(), 168, 505);
        addObject (new Div(), 165, 441);
        addObject (new Som(), 313, 441);
        addObject (new Mult(), 165, 467);
        addObject (new Sub(), 313, 467);  

        numero = "0";
        num1 = "";
        num2 = "";
        op = "";
    }

    public void act()
    {        
        seTar();
        showText(tela, 180, 170);  
        showText(op, 140, 165);          
    }  

    public static void seTar()
    {
        if(Mundo.op.equals(""))
        {   
            numero = num1;
            tela = num1;                       
        }
        else
        {   
            numero = num2;
            tela = num2;
        }
    }
}
