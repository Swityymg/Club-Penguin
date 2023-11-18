import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class infoautor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class infoautor extends World
{

    /**
     * Constructor for objects of class infoautor.
     * 
     */
    public infoautor()
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
        regresar regresar = new regresar();
        addObject(regresar,449,272);
        regresar.setLocation(438,277);
    }
}
