package src.arraylist;

// 3. Crear un Arraylist de objetos Integer y realizar los siguientes ejercicios.

import java.util.ArrayList;

public class ObjetoInteger {

    public static void main(String[] args) {

        // a) Adicionar 6 datos (10,20,30,40,50,60) e imprimir la lista
        ArrayList<Integer> listaA = new ArrayList<>();

        listaA.add(10);
        listaA.add(20);
        listaA.add(30);
        listaA.add(40);
        listaA.add(50);
        listaA.add(60);

        System.out.println("a) Lista después de adicionar 10,20,30,40,50,60:");
        System.out.println(listaA);


        // b) Adicione 2 valores en posiciones específicas e imprima de nuevo
        listaA.add(1, 1000);
        listaA.add(3, 2000);

        System.out.println("\nb) Lista después de adicionar 1000 en la posición 1 y 2000 en la posición 3:");
        System.out.println(listaA);


        // c) Reemplace valores usando set e imprima
        listaA.set(0, 5000);
        listaA.set(2, 10000);

        System.out.println("\nc) Lista después de reemplazar posición 0 con 5000 y posición 2 con 10000:");
        System.out.println(listaA);


        // d) Imprimir la posición de la primera ocurrencia del valor 2000
        int primeraPosicion = listaA.indexOf(2000);

        System.out.println("\nd) La primera posición del valor 2000 es:");
        System.out.println(primeraPosicion);


        // e) Imprimir la posición de la última ocurrencia del valor 2000
        int ultimaPosicion = listaA.lastIndexOf(2000);

        System.out.println("\ne) La última posición del valor 2000 es:");
        System.out.println(ultimaPosicion);


        // f) Adicionar 2000 en la última posición
        listaA.add(2000);

        System.out.println("\nf) Lista después de adicionar 2000 en la última posición:");
        System.out.println(listaA);


        // g) Repetir las impresiones de las posiciones del valor 2000
        System.out.println("\ng) Nueva primera posición del valor 2000:");
        System.out.println(listaA.indexOf(2000));

        System.out.println("Nueva última posición del valor 2000:");
        System.out.println(listaA.lastIndexOf(2000));


        // h) Averiguar si el valor 40 está en el ArrayList y en qué posición
        System.out.println("\nh) Verificar si el valor 40 está en la lista:");

        if (listaA.contains(40)) {
            System.out.println("El valor 40 está en la posición: " + listaA.indexOf(40));
        } else {
            System.out.println("El valor 40 no se encuentra en la lista");
        }


        // i) Eliminar el valor que se encuentre en la posición 5
        listaA.remove(5);

        System.out.println("\ni) Lista después de eliminar el valor en la posición 5:");
        System.out.println(listaA);


        // j) Averiguar si la lista está vacía y cuantos elementos tiene
        System.out.println("\nj) Verificación de la lista:");

        if (listaA.isEmpty()) {
            System.out.println("La lista está vacía");
        } else {
            System.out.println("La lista no está vacía");
            System.out.println("Cantidad de elementos en la lista: " + listaA.size());
        }


        // k) Crear un segundo ArrayList llamado listaB con 111,222,333
        ArrayList<Integer> listaB = new ArrayList<>();

        listaB.add(111);
        listaB.add(222);
        listaB.add(333);

        System.out.println("\nk) Lista llamada listaB:");
        System.out.println(listaB);


        // l) Crear un tercer ArrayList llamado listaC con 77777 y 88888
        ArrayList<Integer> listaC = new ArrayList<>();

        listaC.add(77777);
        listaC.add(88888);

        System.out.println("\nl) Lista llamada listaC:");
        System.out.println(listaC);


        // m) Agregar a listaB los elementos de listaA y listaC
        listaB.addAll(listaA);
        listaB.addAll(listaC);

        System.out.println("\nm) Lista listaB después de agregar los elementos de listaA y listaC:");
        System.out.println(listaB);


        // n) Adicionar un nuevo valor 99999 a listaA
        listaA.add(99999);

        System.out.println("\nn) Lista listaA después de adicionar 99999:");
        System.out.println(listaA);


        // o) Borrar de listaB únicamente los elementos de listaA
        listaB.removeAll(listaA);

        System.out.println("\no) Lista listaB después de eliminar los elementos que están en listaA:");
        System.out.println(listaB);

        System.out.println("La lista listaA queda así:");
        System.out.println(listaA);


        // p) Borrar todos los elementos de listaA
        listaA.clear();

        System.out.println("\np) Lista listaA después de eliminar todos sus elementos:");
        System.out.println(listaA);

        System.out.println("¿La lista listaA está vacía?");
        System.out.println(listaA.isEmpty());
    }
}
