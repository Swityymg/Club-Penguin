import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class obstaculo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class obstaculo extends Actor
{
    /**
     * Act - do whatever the obstaculo wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
     private static final int VELOCIDAD_CAIDA = 3;
    public void act()
    {
        setLocation(getX(), getY() + VELOCIDAD_CAIDA);

        if (getY() >= getWorld().getHeight() - getImage().getHeight() / 2) {
            getWorld().removeObject(this);
        }
    }
}
