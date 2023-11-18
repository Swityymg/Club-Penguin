import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(420, 265, 1); 
        prepare();
    }
    public void act(){
        //Greenfoot.playSound("soundtrack.mp3");
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        jugar jugar = new jugar();
        addObject(jugar,350,199);
        instrucciones instrucciones = new instrucciones();
        addObject(instrucciones,346,238);
        jugar.setLocation(375,188);
        jugar.setLocation(352,200);
        instrucciones.setLocation(323,240);
        autor autor = new autor();
        addObject(autor,66,26);
        instrucciones.setLocation(328,238);
        autor.setLocation(29,22);
        autor.setLocation(114,32);
        instrucciones.setLocation(392,241);
        instrucciones.setLocation(276,241);
        instrucciones.setLocation(391,230);
        instrucciones.setLocation(307,237);
        autor.setLocation(103,36);
        instrucciones.setLocation(377,242);
        instrucciones.setLocation(310,246);
        instrucciones.setLocation(352,237);
        instrucciones.setLocation(335,240);
        instrucciones.setLocation(389,244);
        instrucciones.setLocation(342,239);
        jugar.setLocation(112,150);
        autor.setLocation(352,89);
        instrucciones.setLocation(348,208);
        autor.setLocation(360,243);
        jugar.setLocation(107,38);
        instrucciones.setLocation(378,202);
        autor.setLocation(369,242);
        jugar.setLocation(105,18);
        jugar.setLocation(66,26);
        instrucciones.setLocation(356,214);
        autor.setLocation(350,242);
        instrucciones.setLocation(355,194);
        regresar regresar = new regresar();
        addObject(regresar,89,217);
        regresar.setLocation(62,243);
        instrucciones.setLocation(325,203);
        autor.setLocation(331,233);
        autor.setLocation(332,239);
        instrucciones.setLocation(388,198);
        autor.setLocation(390,250);
        instrucciones.setLocation(360,202);
        instrucciones.setLocation(343,204);
        autor.setLocation(334,245);
        autor.setLocation(876,219);
        regresar.setLocation(118,298);
        regresar.setLocation(103,242);
        regresar.setLocation(553,287);
        instrucciones.setLocation(352,210);
        removeObject(instrucciones);
        removeObject(autor);
        removeObject(regresar);
        addObject(instrucciones,355,240);
        addObject(autor,50,22);
        autor.setLocation(112,25);
        jugar.setLocation(361,192);
        jugar.setLocation(311,207);
        jugar.setLocation(386,200);
        autor.setLocation(118,37);
        jugar.setLocation(280,172);
        removeObject(jugar);
        addObject(jugar,347,194);
        jugar.setLocation(352,194);
    }
}
