package src.matrices;

/**
 * Clase encargada de realizar operaciones de suma con matrices.
 */
public class SumaMatriz {

    /**
     * Suma dos matrices del mismo tamaño.
     *
     * @param matrizA primera matriz que se va a sumar
     * @param matrizB segunda matriz que se va a sumar
     * @return una nueva matriz que contiene la suma de matrizA y matrizB; si no
     * tienen el mismo tamaño, retorna null
     */
    public int[][] sumar(int[][] matrizA, int[][] matrizB) {
        if (!tienenMismoTamano(matrizA, matrizB)) {
            System.out.println("️ Las matrices no tienen el mismo tamaño. No se pueden sumar.");
            return null;
        }
        // throw new IllegalArgumentException
        /*
        public int[][] sumar(int[][] matrizA, int[][] matrizB) {
    if (!tienenMismoTamano(matrizA, matrizB)) {
        throw new IllegalArgumentException("Las matrices no tienen el mismo tamaño. No se pueden sumar.");
    }   

    return resultado;
}
        */

        int filas = matrizA.length;
        int columnas = matrizA[0].length;
        int[][] resultado = new int[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                resultado[i][j] = matrizA[i][j] + matrizB[i][j];
            }
        }
        return resultado;
    }

    /**
     * Verifica si dos matrices tienen el mismo tamaño.
     *
     * @param matrizA primera matriz
     * @param matrizB segunda matriz
     * @return true si tienen el mismo tamaño, false en caso contrario
     */
    private boolean tienenMismoTamano(int[][] matrizA, int[][] matrizB) {
        return matrizA.length == matrizB.length
                && matrizA[0].length == matrizB[0].length;
    }
}

