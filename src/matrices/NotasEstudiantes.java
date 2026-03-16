package src.matrices;

// 3.Inicializar una matriz de 2 por 5 con las notas de 10 estudiantes y
// realizar:

public class NotasEstudiantes {

    public static void main(String[] args) {

        int[][] notas = {
            {4, 3, 5, 2, 4},
            {3, 4, 5, 3, 4}
        };

        // a)La impresión en forma matricial.
        System.out.println("Notas:");

        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < notas[i].length; j++) {
                System.out.print(notas[i][j] + " ");
            }
            System.out.println();
        }

        // b)Encontrar el promedio de notas de los estudiantes.
        int suma = 0;
        int total = 0;

        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < notas[i].length; j++) {
                suma += notas[i][j];
                total++;
            }
        }

        double promedio = (double) suma / total;

        System.out.println("Promedio: " + promedio);

        // c)Encontrar la nota mayor.
        int mayor = notas[0][0];

        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < notas[i].length; j++) {

                if (notas[i][j] > mayor) {
                    mayor = notas[i][j];
                }

            }
        }

        System.out.println("Nota mayor: " + mayor);

    }
}
