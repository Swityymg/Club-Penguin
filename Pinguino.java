import greenfoot.*;

public class Pinguino extends Actor {
    private static final int VELOCIDAD = 6;
    private Puntos puntaje; 
    private int puntajeValor; 
    private int contadorObstaculos;

    public Pinguino() {
        puntaje = new Puntos();
        puntajeValor = 0; 
        contadorObstaculos = 0;
    }

    public void act() {
        if (Greenfoot.isKeyDown("left")) {
            setLocation(getX() - VELOCIDAD, getY());
        }

        if (Greenfoot.isKeyDown("right")) {
            setLocation(getX() + VELOCIDAD, getY());
        }
        
        verificarBordes();
        
        if (isTouching(Bolsa.class)) {
            Greenfoot.playSound("sonidoBolsa.wav");
            getWorld().removeObject(getOneIntersectingObject(Bolsa.class));
            puntaje.incrementarPuntaje(1);
            puntajeValor++; 
            actualizarTextoPuntaje(); 
        if (puntajeValor >= 10) {
                Greenfoot.setWorld(new Ganaste()); 
            }
        }
        if (isTouching(obstaculo.class)) {
            Greenfoot.playSound("peligro.wav");
            getWorld().removeObject(getOneIntersectingObject(obstaculo.class));
            puntaje.decrementarPuntaje(1);
            puntajeValor--; 
            actualizarTextoPuntaje();
            contadorObstaculos++;
        }
        if (contadorObstaculos >= 3) {
                Greenfoot.setWorld(new Perdiste()); 
            }
    }
    
    private void verificarBordes() {
        World world = getWorld();
        int x = getX();
        int y = getY();

        if (x <= getImage().getWidth() / 2) {
            setLocation(getImage().getWidth() / 2, y);
        }

        if (x >= world.getWidth() - getImage().getWidth() / 2) {
            setLocation(world.getWidth() - getImage().getWidth() / 2, y);
        }
    }
    
    private void actualizarTextoPuntaje() {
        getWorld().showText("Puntaje: " + puntajeValor, 60, 20); 
    }
}
