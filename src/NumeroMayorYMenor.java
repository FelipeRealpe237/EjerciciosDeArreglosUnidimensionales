package src;

// Lea 10 números enteros, almacénelos en un arreglo y encuentre:

import java.util.Scanner;

public class NumeroMayorYMenor {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[10];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        // a) El número menor del arreglo.
        // b) El numero mayor del arreglo.

        int menor = numeros[0];
        int mayor = numeros[0];

        for (int i = 1; i < numeros.length; i++) {

            if (numeros[i] < menor) {
                menor = numeros[i];
            }

            if (numeros[i] > mayor) {
                mayor = numeros[i];
            }
        }

        System.out.println("Numero menor: " + menor);
        System.out.println("Numero mayor: " + mayor);

    }
}
