package com.company;

import java.util.Scanner;

public class Vehiculos {

    Scanner scanner = new Scanner(System.in);
    int opcionVehiculo;
    String vehiculo = null;

    void elegirVehiculo(){
        System.out.println("Elige el tipo de vehiculo que quieres utilizar: ");
        System.out.println("1.Coche");
        System.out.println("2.Moto");
        System.out.println("3.Bicicleta");
        System.out.println("4.Camión");
        opcionVehiculo = scanner.nextInt();
        while(vehiculo==null){
            switch (opcionVehiculo) {
                case 1:
                    vehiculo = "Coche";
                    break;
                case 2:
                    vehiculo = "Moto";
                    break;
                case 3:
                    vehiculo = "Bicicleta";
                    break;
                case 4:
                    vehiculo = "Camión";
                    break;
                default:
                    System.out.println("Introduce un numero valido");
                    opcionVehiculo=scanner.nextInt();
            }
        }
        System.out.println("Ha elegido " + vehiculo);
    }
}
