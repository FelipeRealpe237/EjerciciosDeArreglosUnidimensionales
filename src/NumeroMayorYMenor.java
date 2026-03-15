package src;

import java.util.Scanner;

public class NumeroMayorYMenor {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[10];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = sc.nextInt();
        }

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

        sc.close();
    }
}
