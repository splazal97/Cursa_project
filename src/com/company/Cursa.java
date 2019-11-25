package com.company;

public class Cursa extends Vehicle implements Comparable<Cursa> {
    Pilot pilot;
    double temps;

    @Override
    public int compareTo(Cursa cursa) {
        if(temps == cursa.temps) {
            return 0;
        } else if (temps > cursa.temps) {
            return 1;
        } else {
            return -1;
        }
    }
}