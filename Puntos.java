/**
 * Write a description of class Puntos here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import greenfoot.*;

public class Puntos extends Actor {
    private int puntaje = 0; 

    public void act() {
        // No es necesario implementar nada aquí para la clase Puntos
    }

    public void incrementarPuntaje(int puntos) {
        puntaje += puntos;
    }

    public void decrementarPuntaje(int puntos) {
        puntaje -= puntos;
    }

    public int obtenerPuntaje() {
        return puntaje;
    }
}
