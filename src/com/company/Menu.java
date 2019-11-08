package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

    void lanzarMenu() {
        Scanner sc = new Scanner(System.in);
        Config_comp config_comp = new Config_comp();
        Jugar jugar = new Jugar();
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
                    config_comp.menu();
                    break;
                case 2:
                    //RESULTADO PALMARES CLASIFICACION GENERAL
                    break;
                case 3:
                    jugar.carrera();
                    //aqui se pasa un parametro de la array list de participantes nose como
                    break;
                case 4:
                    return;
            }
        }
    }
}
