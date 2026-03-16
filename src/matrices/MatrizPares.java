package src.matrices;

// 1.Inicializar con los primeros números pares una matriz de 3 filas por 2
// columnas directamente e imprimir los elementos de la matriz en forma
// matricial.

public class MatrizPares {
    public static void main(String[] args) {

        int[][] matriz = {
            {2, 4},
            {6, 8},
            {10, 12}
        };

        System.out.println("Matriz:");

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}