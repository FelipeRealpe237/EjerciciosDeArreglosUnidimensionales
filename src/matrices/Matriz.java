package src.matrices;

import java.util.Scanner;

/**
 * Esta relacionada con la clase SumaMatriz y MultiplicarMatriz
 * Clase principal que pide al usuario el tamaño de las matrices, genera
 * matrices aleatorias, realiza la suma e imprime los resultados.
 *
 * @author Manuel
 */
public class Matriz {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir tamaño de las matrices
        System.out.print("Ingrese el número de filas: ");
        int filas = scanner.nextInt();

        System.out.print("Ingrese el número de columnas: ");
        int columnas = scanner.nextInt();

        // Crear matrices aleatorias
        AleatorioMatriz aleatorio = new AleatorioMatriz();
        int[][] matrizA = aleatorio.generarMatrizAleatoria(filas, columnas);
        int[][] matrizB = aleatorio.generarMatrizAleatoria(filas, columnas);

        // Instanciar clases
        SumaMatriz sumador = new SumaMatriz();
        ImprimirMatriz impresor = new ImprimirMatriz();
        MultiplicarMatriz multiplicador = new MultiplicarMatriz();

        // Realizar suma
        int[][] resultado = sumador.sumar(matrizA, matrizB);

        // Imprimir matrices
        System.out.println("\nMatriz A:");
        impresor.imprimir(matrizA);

        System.out.println("\nMatriz B:");
        impresor.imprimir(matrizB);

        System.out.println("\nResultado de la suma:");
        if (resultado != null) {
            impresor.imprimir(resultado);
        }
        
        // Multiplicar matrices (si es posible)
        if (columnas == filas) {
            System.out.println("Multiplicación de A * B:");
            int[][] producto = multiplicador.multiplicar(matrizA, matrizB);
            impresor.imprimir(producto);
        } else {
            System.out.println("No se puede multiplicar: número de columnas de A ≠ número de filas de B");
        }

        scanner.close();
    }

    
}

    

