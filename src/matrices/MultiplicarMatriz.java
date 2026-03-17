package src.matrices;

public class MultiplicarMatriz {
    /**
     * Multiplica dos matrices si sus dimensiones son compatibles.
     * @param matrizA primera matriz
     * @param matrizB segunda matriz
     * @return matriz resultante de la multiplicación
     */
    public int[][] multiplicar(int[][] matrizA, int[][] matrizB) {
        int filasA = matrizA.length;
        int columnasA = matrizA[0].length;
        int filasB = matrizB.length;
        int columnasB = matrizB[0].length;

        if (columnasA != filasB) {
            System.out.println("No se puede multiplicar: columnas de A ≠ filas de B");
            return null;
        }

        int[][] resultado = new int[filasA][columnasB];

        for (int i = 0; i < filasA; i++) {
            for (int j = 0; j < columnasB; j++) {
                for (int k = 0; k < columnasA; k++) {
                    resultado[i][j] += matrizA[i][k] * matrizB[k][j];
                }
            }
        }

        return resultado;
    }
}
    


