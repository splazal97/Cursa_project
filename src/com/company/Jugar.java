package com.company;


import java.util.Arrays;
import java.util.Scanner;

public class Jugar {
    public  void jugar() throws InterruptedException {
        Scanner scanner = new Scanner(System.in);

        int i;
        int max = 100;
        int min = 0;
        int op;
        int edat;

        System.out.print("Escribe el numero ded participantes: ");
        int corredors = scanner.nextInt();
        scanner.nextLine();

        Cursa[] cursa = new Cursa[corredors];

        for (i = 0; i < corredors; i++) {
            //Iniciem l'array
            cursa[i] = new Cursa();
            cursa[i].pilot = new Pilot();

            //Preguntem pel nom dels participants i els guardem
            System.out.print("Escribe el nombre del participante " + (i + 1) + ": ");
            String nom = scanner.nextLine();
            cursa[i].pilot.nom = nom;

            System.out.print("Escribe la edad del participante: ");
            edat = scanner.nextInt();
            scanner.nextLine();

            cursa[i].pilot.setEdat(edat);

            if (cursa[0].vehicle !=null){
                cursa[i].vehicle = cursa[0].vehicle;
            } else {
                //Preguntem pel vehicle
                do {
                    System.out.println("1 - Coche");
                    System.out.println("2 - Moto");
                    System.out.println("3 - Bici");
                    System.out.print("Elige vehicle: ");
                    op = scanner.nextInt();
                    scanner.nextLine();
                    if (op == 1) {
                        cursa[i].vehicle = "Coche";
                    } else if (op == 2) {
                        cursa[i].vehicle = "moto";
                    } else if (op == 3) {
                        cursa[i].vehicle = "bici";
                    } else {
                        System.out.println("Opcion no valida.");
                    }

                } while (op != 1 && op != 2 && op != 3); //Mentre que no posi una opcio valida, no pot sortir del bucle
            }

            System.out.print("Escribe el modelo " + cursa[i].vehicle + ": ");
            String model = scanner.nextLine();
            cursa[i].setModel(model);
        }

        //Preguntem com es diu la cursa
        System.out.print("Escribe el nombre de la carrera: ");
        String lloc = scanner.nextLine();



        System.out.println("La carrera " + lloc + " va a comenzar!");

        //Posem la informació del corredors i els seus temps
        for (i = 0; i < corredors; i++) {
            System.out.println("El participante " + (i + 1) + ": " + cursa[i].pilot.nom + ". Edat: " + cursa[i].pilot.getEdat());
            System.out.println("Participa con " + cursa[i].vehicle + ", modelo: " + cursa[i].getModel());
            //Fem el random per veure quant ha tardat
            cursa[i].temps = Math.floor(Math.random() * (max - min)) + min;
            System.out.println("Ha realizado la carrera en: " + cursa[i].temps);
            //Fem un sleep per a que es pugui llegir tota la informació
            Thread.sleep(4000);
        }

        //Ordenamos el array
        Arrays.sort(cursa);

        System.out.println("------ Podio ------");

        //Realizamos un bucle para listar los corredores
        for (i = 0; i < corredors; i++) {
            System.out.println((i + 1) + ". " + "Nombre:" + cursa[i].pilot.nom + "Tiempo: " + cursa[i].temps);
        }
        System.out.println("------------------");
    }


}
