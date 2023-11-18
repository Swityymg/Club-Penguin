import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ganaste here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ganaste extends World
{

    /**
     * Constructor for objects of class Ganaste.
     * 
     */
    public Ganaste()
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
        addObject(jugar,197,246);
        regresar regresar = new regresar();
        addObject(regresar,321,250);
        jugar.setLocation(177,252);
        regresar.setLocation(294,248);
    }
}
