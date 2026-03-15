package src;

public class NumerosPrimos {
    public static void main(String[] args) {
        
        int [] numerosPrimos = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29};

        System.out.println("Primeros 10 números primos:");

        for (int i = 0; i < numerosPrimos.length; i++) {
            System.out.print(numerosPrimos[i] + " " );
        }
    }
}
