import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MarioAberto here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MarioAberto extends Actor
{
    /**
     * Act - do whatever the MarioAberto wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int score = 0;
    public void act() 
    {
        if(Greenfoot.isKeyDown("w") || Greenfoot.isKeyDown("up")){
            setImage("PerdaoWiu.png"); setLocation(getX(), getY() - 4);
            if (hitPipe() == true || hitEdge() == true){
                setLocation(getX(), getY() + 4);
            }           
        } 

        if(Greenfoot.isKeyDown("S") || Greenfoot.isKeyDown("down")){
            setImage("PerdaoWiu.png"); setLocation(getX(), getY() + 4);
            if (hitPipe() == true || hitEdge() == true){
                setLocation(getX(), getY() - 4);
            }
        }

        if(Greenfoot.isKeyDown("A") || Greenfoot.isKeyDown("left")){
            setImage("PerdaoWiu.png"); setLocation(getX() - 4, getY());
            if (hitPipe() == true || hitEdge() == true){
                setLocation(getX() + 4, getY());
            }
        }

        if(Greenfoot.isKeyDown("D") || Greenfoot.isKeyDown("right")){
            setImage("PerdaoWiu.png"); setLocation(getX() + 4, getY());
            if (hitEdge() == true){
                setLocation(getX() - 4, getY());
            }   
        }

        removeTouching(Claudio.class);
        removeTouching(Cloud.class);
        catchCoin();
    }    

    public boolean hitPipe(){
        if(isTouching(Pipe.class)){
            return true;
        }else {return false;}
    } 

    public boolean hitEdge(){
        if (isAtEdge()){
            return true;
        }else {return false;}
    }

    public void catchCoin(){
        getWorld().showText("x" + score, 575, 20);
        if(isTouching(Coin.class))
        {
            removeTouching(Coin.class);
            Greenfoot.playSound("smb_coin.wav");
            score++;            
        }

        if(isTouching(Coin1.class))
        {
            removeTouching(Coin1.class);
            getWorld().addObject(new YouWin(), getWorld().getWidth()/2, getWorld().getHeight()/2);
            Greenfoot.playSound("smb_world_clear.wav");
            
            Greenfoot.stop();           
        }

        
    }
}
