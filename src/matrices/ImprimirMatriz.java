package src.matrices;

/**
 * Clase encargada de imprimir matrices en consola.
 */
public class ImprimirMatriz {

    /**
     * Imprime una matriz en formato tabular.
     *
     * @param matriz matriz que se quiere imprimir
     */
    public void imprimir(int[][] matriz) {
        for (int[] fila : matriz) {
            for (int elemento : fila) {
                System.out.print(elemento + "\t");
            }
            System.out.println();
        }
    }
}


