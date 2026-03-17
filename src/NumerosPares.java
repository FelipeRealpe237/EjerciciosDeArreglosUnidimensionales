package src;

//2.Inicializar por programa un arreglo con los 100 primeros números pares e imprimirlo

public class NumerosPares {
    public static void main(String[] args) {
        
        int [] numerosPares = new int [100];

        for (int i = 0; i < numerosPares.length; i++) {
            numerosPares[i] = (i + 1) * 2;
        }

        // a)En una sola línea.
        System.out.println("=== Una sola línea ===");
        
        for (int i = 0; i < numerosPares.length; i++) {
            System.out.print(numerosPares[i] + " ");
        }

        // b)En 10 líneas de 10 números pares

        System.out.println("\n=== 10 líneas de 10 números ===");
        
        for (int i = 0; i < numerosPares.length; i++) {
            
            System.out.print(numerosPares[i] + "\t");
            
            if ((i + 1) % 10 == 0)
                System.out.println();
        }
    }
}
