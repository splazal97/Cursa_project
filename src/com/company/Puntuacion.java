package com.company;

public class Puntuacion extends Persona implements Comparable<Puntuacion> {
    Pilot pilot;
    int puntuacion;

    @Override
    public int compareTo(Puntuacion puntuacion) {
        if(puntuacion == puntuacion.puntuacion) {
            return 0;
        } else if (puntuacion > puntuacion.puntuacion) {
            return 1;
        } else {
            return -1;
        }
    }
}
