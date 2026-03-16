package src.matrices;

// 2. Inicializar desde el programa una matriz de 3 por 5 con los primeros 15
// múltiplos de 3 e:

public class MultiplosTres {

    public static void main(String[] args) {

        int[][] matriz = new int[3][5];
        int numero = 3;

        // llenar matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = numero;
                numero += 3;
            }
        }

        // a)Imprimir la matriz en forma matricial.
        System.out.println("Matriz:");

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        // b) b)Realizar la sumatoria de todos los elementos de la matriz, realizando
        // el recorrido por filas.
        int sumaTotal = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                sumaTotal += matriz[i][j];
            }
        }

        System.out.println("Suma total: " + sumaTotal);

        // c) Realizar la sumatoria por filas de la matriz, imprimiendo después de
        // cada fila la correspondiente suma.
        for (int i = 0; i < matriz.length; i++) {

            int sumaFila = 0;

            for (int j = 0; j < matriz[i].length; j++) {
                sumaFila += matriz[i][j];
            }

            System.out.println("Suma fila " + i + ": " + sumaFila);
        }

        // d) Realizar la sumatoria por columnas de la matriz, imprimiendo después
        // de cada columna la correspondiente suma.
        for (int j = 0; j < matriz[0].length; j++) {

            int sumaColumna = 0;

            for (int i = 0; i < matriz.length; i++) {
                sumaColumna += matriz[i][j];
            }

            System.out.println("Suma columna " + j + ": " + sumaColumna);
        }

    }
}
