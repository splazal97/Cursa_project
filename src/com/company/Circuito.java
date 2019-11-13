package com.company;

import java.util.Scanner;

public class Circuito {
    Scanner scanner = new Scanner(System.in);
    void RandomCircuito() {
        System.out.println("Cuantos circuitos se van a correr?");
        int circuitos = scanner.nextInt();
        char[] nombreCircuito = {'A','B','C','D','E','F','G','H','I','J'};
        char[] nca = new char[circuitos];

        for (int i = 0; i <=circuitos ; i++) {
            nca[i] = nombreCircuito[(int)(Math.random()*10)];
            System.out.println(nca[i]);
            }
     }
}
