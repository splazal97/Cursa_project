package com.company;

public class Palmares extends  Persona implements  Comparable<Palmares> {
    Pilot pilot;
    int puntuacion;

    @Override
    public int compareTo(Palmares palmares) {
        if(puntuacion == palmares.puntuacion){
        return 0;
        } else if (puntuacion > palmares.puntuacion){
            return  1;
        } else {
            return -1;
        }
    }
}
