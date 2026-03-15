package src;

public class NumerosPares {
    public static void main(String[] args) {
        
        int [] numerosPares = new int [100];

        for (int i = 0; i < numerosPares.length; i++) {
            numerosPares[i] = (i + 1) * 2;
        }

        System.out.println("=== Una sola línea ===");
        
        for (int i = 0; i < numerosPares.length; i++) {
            System.out.print(numerosPares[i] + " ");
        }

        System.out.println("\n=== 10 líneas de 10 números ===");
        
        for (int i = 0; i < numerosPares.length; i++) {
            
            System.out.print(numerosPares[i] + "\t");
            
            if ((i + 1) % 10 == 0)
                System.out.println();
        }
    }
}
