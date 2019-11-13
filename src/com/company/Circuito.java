package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Circuito {
    Scanner scanner = new Scanner(System.in);
    ArrayList<String> circuito = new ArrayList<String>();
    void añadirCircuito() {
        System.out.println("Que circuitos se van a correr?(A,B,C,D,E,F,G,H,I,J) MAXIMO 5 CIRCUITOS");
        for (int i = 0; i <5 ; i++) {
            String opcion = scanner.next();
            circuito.add(opcion);
        }
     }
}
