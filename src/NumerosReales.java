package src;

// 3. Inicializar un arreglo con 5 números reales que se leen desde teclado y:

import java.util.Scanner;

public class NumerosReales {
    public static void main(String[] args) {

        double[] numerosReales = new double[5];
        double suma = 0;

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese 5 numeros reales:");
        
        for (int i = 0; i < numerosReales.length; i++) {
            numerosReales[i] = scanner.nextDouble();
            suma += numerosReales[i];
        }

        // a) Imprima el arreglo con los valores leídos.
        System.out.println("Valores del arreglo:");

        for (int i = 0; i < numerosReales.length; i++) {
            System.out.print(numerosReales[i] + " ");
        }

        // b) Calcule el promedio.
        double promedio = suma / numerosReales.length;
        System.out.println("\nPromedio: " + promedio);

        // c) Calcule la sumatoria de los elementos del arreglo.
        System.out.println("Sumatoria: " + suma);
    }
}
