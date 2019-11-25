package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Menu {

    void lanzarMenu() throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        Jugar jugar = new Jugar();
        int a;
        while (true) {
            System.out.println("TORNEO: ");
            System.out.println("1.Configurar y jugar");
            System.out.println("2.Resultat/Palmarés/ClassificacióGeneral");
            System.out.println("3.Acabar");
            System.out.println("Elige una opcion:");

            int opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    jugar.jugar();
                    break;
                case 2:
                    //RESULTADO PALMARES CLASIFICACION GENERAL
                    break;
                case 3:
                    break;
                case 4:
                    return;
            }
        }
    }
}

