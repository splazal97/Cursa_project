package com.company;

import java.util.Scanner;

public class Config_comp {
    Scanner scanner = new Scanner(System.in);
    Menu menu = new Menu();
    void menu() {
        Menu menu = new Menu();
        Circuito circuito = new Circuito();
        System.out.println("Nombre?");
        String nombre = scanner.next();
        while (true) {
            System.out.println("Configuracion de la competicion: ");
            System.out.println("1.Numero de participantes");
            System.out.println("2.Numero de carrereas");
            System.out.println("3.Tipo de vehículo");
            System.out.println("4.Menu principal");
            int opcion = scanner.nextInt();
            switch (opcion){
                case 1:
                    System.out.println("Cuantos pilotos van a participar?");
                    int participantes = scanner.nextInt();
                    break;
                case 2:
                    circuito.RandomCircuito();
                    break;
                case 3:
                    System.out.println("opcion 3");
                    break;
                case 4:
                    System.out.println("opcion 4");
                    return;
            }
        }
   }
}
