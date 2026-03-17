package src;

// Cálculo de Moda y Desviación Estándar

// 1. Lea las edades de 10 estudiantes y almacénelas en un arreglo de enteros.
// 2. Calcule y muestre:
    // 1.Promedio de las edades.
    // 2.Moda: Valor(es) que más se repite(n). Si todas las edades son únicas, indique "No hay moda".
    // 3.Desviación estándar (con dos decimales).
// 3. Lea los nombres y edades de 10 estudiantes, almacenándolos en dos arreglos paralelos (String[] nombres,
// int[] edades).
    // Permita al usuario elegir cómo ordenar los datos:
    // Opción 1: Ordenar por edad (ascendente).
    // Opción 2: Ordenar por nombre (orden alfabético).

// Muestre los arreglos ordenados, manteniendo la correspondencia entre nombres y edades.
import java.util.Scanner;

public class CalcularModaDesviacion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] edades = new int[10];   // arreglo para guardar las edades
        double suma = 0;

        // 1. Leer las edades
        System.out.println("Ingrese las edades de 10 estudiantes:");

        for (int i = 0; i < edades.length; i++) {
            System.out.print("Edad " + (i + 1) + ": ");
            edades[i] = scanner.nextInt();
            suma += edades[i];
        }

        // 2. Promedio
        double promedio = suma / edades.length;
        System.out.println("\nPromedio de edades: " + promedio);

        // 2. Moda
        boolean hayModa = false;
        int maximaFrecuencia = 1;

        for (int i = 0; i < edades.length; i++) {
            int contador = 0;

            for (int j = 0; j < edades.length; j++) {
                if (edades[i] == edades[j]) {
                    contador++;
                }
            }

            if (contador > maximaFrecuencia) {
                maximaFrecuencia = contador;
                hayModa = true;
            }
        }

        if (!hayModa) {
            System.out.println("Moda: No hay moda");
        } else {
            System.out.print("Moda: ");
            for (int i = 0; i < edades.length; i++) {

                int contador = 0;
                for (int j = 0; j < edades.length; j++) {
                    if (edades[i] == edades[j]) {
                        contador++;
                    }
                }

                if (contador == maximaFrecuencia) {
                    System.out.print(edades[i] + " ");
                }
            }
            System.out.println();
        }

        // 2. Desviación estándar
        double sumaCuadrados = 0;

        for (int i = 0; i < edades.length; i++) {
            sumaCuadrados += Math.pow(edades[i] - promedio, 2);
        }

        double desviacion = Math.sqrt(sumaCuadrados / edades.length);

        System.out.printf("Desviación estándar: %.2f\n", desviacion);

        // 3. Arreglos paralelos
        scanner.nextLine();

        String[] nombres = new String[10];
        int[] edades2 = new int[10];

        System.out.println("\nIngrese nombres y edades de 10 estudiantes:");

        for (int i = 0; i < nombres.length; i++) {

            System.out.print("Nombre: ");
            nombres[i] = scanner.nextLine();

            System.out.print("Edad: ");
            edades2[i] = scanner.nextInt();
            scanner.nextLine();
        }

        // Elegir tipo de orden
        System.out.println("\n1. Ordenar por edad");
        System.out.println("2. Ordenar por nombre");
        System.out.print("Elija una opción: ");
        int opcion = scanner.nextInt();

        // Ordenamiento
        for (int i = 0; i < nombres.length - 1; i++) {
            for (int j = 0; j < nombres.length - 1 - i; j++) {

                boolean cambiar = false;

                if (opcion == 1 && edades2[j] > edades2[j + 1]) {
                    cambiar = true;
                }

                if (opcion == 2 && nombres[j].compareTo(nombres[j + 1]) > 0) {
                    cambiar = true;
                }

                if (cambiar) {

                    int tempEdad = edades2[j];
                    edades2[j] = edades2[j + 1];
                    edades2[j + 1] = tempEdad;

                    String tempNombre = nombres[j];
                    nombres[j] = nombres[j + 1];
                    nombres[j + 1] = tempNombre;
                }
            }
        }

        // Mostrar resultados
        System.out.println("\nDatos ordenados:");

        for (int i = 0; i < nombres.length; i++) {
            System.out.println(nombres[i] + " - " + edades2[i]);
        }
    
    }
}
