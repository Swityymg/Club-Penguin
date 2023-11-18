import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Perdiste here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Perdiste extends World
{

    /**
     * Constructor for objects of class Perdiste.
     * 
     */
    public Perdiste()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(490, 300, 1); 
        prepare();
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        jugar jugar = new jugar();
        addObject(jugar,243,206);
        jugar.setLocation(172,215);
        regresar regresar = new regresar();
        addObject(regresar,307,210);
    }
}
