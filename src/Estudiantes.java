package src;

import java.util.Scanner;

public class Estudiantes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int [] edades = new int [10];
        double suma = 0;

        System.out.println("Ingrese 10 edades:");

        for (int i = 0; i < edades.length; i++) {
            edades[i] = scanner.nextInt();
            suma += edades[i];
        }
        double promedio = suma/edades.length;
        System.out.println("Promedio: "+ promedio);

        for (int i = 0; i < edades.length - 1; i++) {
            for (int j = 0; j < edades.length - 1 - i; j++) {
                
                if (edades[j] > edades[j + 1]) {
                    int temp = edades[j];
                    edades[j] = edades[j + 1];
                    edades[j + 1] = temp; 
                }
            }
        }
        double mediana = (edades[4] + edades[5]) / 2.0;
        System.out.println("Mediana: " + mediana);
    }
    
}
