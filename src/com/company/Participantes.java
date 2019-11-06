package com.company;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Participantes {
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();

    String nombrePiloto;
    ArrayList<String> pilotos = new ArrayList<String>();

    void añadirMiPiloto(){
        System.out.println("Introduce el nombre y apellido de tu piloto: ");
        nombrePiloto = scanner.nextLine();
        pilotos.add(nombrePiloto);
    }

    void añadirParticipantes(){
        System.out.println("Cuantos pilotos van a participar?");

        ArrayList<String> pilotos = new ArrayList<String >();
        Scanner scanner = new Scanner(System.in);
        String[] generarNombresAleatorios;
        int participantes = scanner.nextInt();

        String[] nombresAleatorios = new String[participantes];

        String[] nombres = { "Ruben", "Soraya", "Aleix", "Naiara", "Xavi", "Victor", "Raul", "Edgar",
                "Jordi", "Emma", "Joan", "Adri", "Carles", "Rafa", "Mario", "Dani", "Steven",
                "Enric", "Toni", "Lorena", "Raul"};
        String[] apellidos = { "Ordoñez", "Bravo", "Navarro", "Gutierrez", "Fernandez", "Inglada", "Carrion", "Garriga",
                "Cutilles", "Martinez", "Gandia", "Hernandez", "Jimenez", "Villarejo", "Herruzo", "Caravaca", "Gonzalez",
                "Quiñoa", "Callado", "Burgueño", "Casillas" };

        for (int i = 0; i < participantes; i++) {
            nombresAleatorios[i] = nombres[(int) (Math.floor(Math.random() * ((nombres.length - 1) - 0 + 1) + 0))] + " "
                    + apellidos[(int) (Math.floor(Math.random() * ((apellidos.length - 1) - 0 + 1) + 0))];
        }

        for (int i = 0; i < nombresAleatorios.length ; i++) {
            if(nombresAleatorios[i] != null){
                pilotos.add(nombresAleatorios[i]);
            }
        }
        System.out.println(pilotos);
    }

}
