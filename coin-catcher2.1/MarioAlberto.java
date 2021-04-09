import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MarioAlberto here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MarioAlberto extends Actor
{
    /**
     * Act - do whatever the MarioAlberto wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    int score = 0;
    public void act() 
    {
        if(Greenfoot.isKeyDown("w") || Greenfoot.isKeyDown("up")){
            setLocation(getX(), getY() - 4);
            if (hitPipe() == true || hitEdge() == true){
                setLocation(getX(), getY() + 4);
            }           
        } 

        if(Greenfoot.isKeyDown("S") || Greenfoot.isKeyDown("down")){
            setLocation(getX(), getY() + 4);
            if (hitPipe() == true || hitEdge() == true){
                setLocation(getX(), getY() - 4);
            }
        }

        if(Greenfoot.isKeyDown("A") || Greenfoot.isKeyDown("left")){
            setImage("MarioS2.png"); setLocation(getX() - 4, getY());
            if (hitPipe() == true || hitEdge() == true){
                setLocation(getX() + 4, getY());
            }
        }

        if(Greenfoot.isKeyDown("D") || Greenfoot.isKeyDown("right")){
            setImage("MarioS1.png"); setLocation(getX() + 4, getY());
            if (hitEdge() == true){
                setLocation(getX() - 4, getY());
            }   
        }
        
        if(Greenfoot.isKeyDown("A") && Greenfoot.isKeyDown("left")){
            setImage("MarioS2.png"); setLocation(getX() - 1, getY());
            if (hitPipe() == true){
                setLocation(getX() - 1, getY());
            }
            if (hitEdge() == true){
                setLocation(getX() + 2, getY());
            }  
            
        }  
        
        
        if(isTouching(Cloud.class) || (isTouching(Claudio.class))){
            getWorld().addObject(new GameOver(), getWorld().getWidth()/2, getWorld().getHeight()/2);
            Greenfoot.playSound("smb_mariodie.wav");
            Greenfoot.stop();
        }
        
             
        catchCoin();        
    }

    public void catchCoin(){
        if(isTouching(Coin.class))
        {
            removeTouching(Coin.class);
            Greenfoot.playSound("smb_coin.wav");
            score++;
                        
        }
        
        getWorld().showText("x" + score, 575, 20);
        
        if(score == 3){
            getWorld().addObject(new YouWin(), getWorld().getWidth()/2, getWorld().getHeight()/2);
            Greenfoot.playSound("smb_stage_clear.wav");
            Greenfoot.stop();            
        }
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
}
