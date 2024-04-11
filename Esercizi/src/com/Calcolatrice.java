package com;


import java.util.Scanner;

public class Calcolatrice {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Benvenuto nella calcolatrice!");
        System.out.println("Inserisci il primo numero:");
        double numero1 = scanner.nextDouble();

        System.out.println("Inserisci il secondo numero:");
        double numero2 = scanner.nextDouble();

        System.out.println("Scegli l'operazione:");
        System.out.println("1. Addizione");
        System.out.println("2. Sottrazione");
        System.out.println("3. Moltiplicazione");
        System.out.println("4. Divisione");
        int scelta = scanner.nextInt();

        double risultato = 0;

        switch (scelta) {
            case 1:
                risultato = numero1 + numero2;
                break;
            case 2:
                risultato = numero1 - numero2;
                break;
            case 3:
                risultato = numero1 * numero2;
                break;
            case 4:
                if (numero2 != 0) {
                    risultato = numero1 / numero2;
                } else {
                    System.out.println("Impossibile dividere per zero.");
                    return;
                }
                break;
            default:
                System.out.println("Scelta non valida.");
                return;
        }

        System.out.println("Il risultato è: " + risultato);
    }
}
