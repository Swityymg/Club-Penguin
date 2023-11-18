import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class instruccionesinfo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class instruccionesinfo extends World
{

    /**
     * Constructor for objects of class instruccionesinfo.
     * 
     */
    public instruccionesinfo()
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
        addObject(regresar,56,17);
    }
}
