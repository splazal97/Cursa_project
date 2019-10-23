package com.company;

import java.util.Scanner;

public class Menu {

    void lanzarMenu() {
        Scanner sc = new Scanner(System.in);

        int a;
        while(true) {
            System.out.println("TORNEO: ");
            System.out.println("1.Configuració de la competició");
            System.out.println("2.Resultat/Palmarés/ClassificacióGeneral");
            System.out.println("3.Jugar");
            System.out.println("4.Acabar");
            System.out.println("Elige una opcion:");

            int opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    //CONFIGURACION COMPETICION
                    break;
                case 2:
                    //RESULTADO PALMARES CLASIFICACION GENERAL
                    break;
                case 3:
                    //JUGAR
                    break;
                case 4:
                    return;
            }
        }
    }
}
