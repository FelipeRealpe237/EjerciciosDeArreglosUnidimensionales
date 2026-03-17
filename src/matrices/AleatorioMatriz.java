package src.matrices;

import java.util.Random;
public class AleatorioMatriz {
    /**
     * Genera una matriz con valores aleatorios entre 0 y 9.
     *
     * @param filas número de filas de la matriz
     * @param columnas número de columnas de la matriz
     * @return matriz generada con números aleatorios
     */   
    public int[][] generarMatrizAleatoria(int filas, int columnas) {
        Random random = new Random();
        int[][] matriz = new int[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = random.nextInt(10); // valores entre 0 y 9
            }
        }
        return matriz;
    }
}

