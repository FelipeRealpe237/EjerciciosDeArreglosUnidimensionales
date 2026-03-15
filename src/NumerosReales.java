package src;

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

        System.out.println("Valores del arreglo:");

        for (int i = 0; i < numerosReales.length; i++) {
            System.out.print(numerosReales[i] + " ");
        }

        double promedio = suma / numerosReales.length;
        System.out.println("\nPromedio: " + promedio);

        System.out.println("Sumatoria: " + suma);
    }
}
