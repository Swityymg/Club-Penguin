import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class juego extends World
{
    //poner quizas un contador de bolsas que atrape
    private int tiempoParaNuevaBolsa = 6;
    private int tiempoParaObstaculo= 7;
    private int puntos = 0;
    
    public juego()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(420, 265, 1); 
        prepare();
    }
    
    public void act()
    {    
        tiempoParaNuevaBolsa--;
        if (tiempoParaNuevaBolsa <= 0) {
            addObject(new Bolsa(), Greenfoot.getRandomNumber(getWidth()), 0);
            tiempoParaNuevaBolsa = Greenfoot.getRandomNumber(100) + 50; 
        }
        
        tiempoParaObstaculo--;
        if (tiempoParaObstaculo <= 0) {
            addObject(new obstaculo(), Greenfoot.getRandomNumber(getWidth()), 0);
            tiempoParaObstaculo = Greenfoot.getRandomNumber(100) + 50; 
        }
        
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Pinguino Pinguino = new Pinguino();
        addObject(Pinguino,350,199);
        Pinguino.setLocation(209,218);
    }
}
