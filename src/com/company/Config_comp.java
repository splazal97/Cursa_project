package com.company;

import java.util.Scanner;

public class Config_comp {
    Scanner scanner = new Scanner(System.in);
    Menu menu = new Menu();
    void menu() {
        Menu menu = new Menu();
        System.out.println("Nombre?");
        String nombre = scanner.next();
        while (true) {
            System.out.println("Configuracion de la competicion: ");
            System.out.println("1.Numero de participantes");
            System.out.println("2.Numero de carrereas");
            System.out.println("3.Menu principal");
                        int opcion = scanner.nextInt();
            switch (opcion){
                case 1:
                    System.out.println("opcion 1");
                break;
                case 2:
                    System.out.println("opcion 2");
                    break;
                case 3:
                    menu.lanzarMenu();
                    break;
                case 4:
                    System.out.println("opcion4");
                    return;
            }
        }
   }
}
