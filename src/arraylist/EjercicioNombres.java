package src.arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class EjercicioNombres {

    public static void main(String[] args) {

        // Crear un ArrayList llamado nombres e inicializarlo con 5 nombres
        ArrayList<String> nombres = new ArrayList<>();

        nombres.add("Carlos");
        nombres.add("Ana");
        nombres.add("Luis");
        nombres.add("Pedro");
        nombres.add("Maria");

        System.out.println("ArrayList inicial:");
        System.out.println(nombres);


        // Imprimir usando for clásico
        System.out.println("\nImpresión usando bucle for clásico:");

        for (int i = 0; i < nombres.size(); i++) {
            System.out.println(nombres.get(i));
        }


        // Imprimir usando for-each
        System.out.println("\nImpresión usando bucle for-each:");

        for (String nombre : nombres) {
            System.out.println(nombre);
        }


        // Añadir un nuevo nombre en la posición 1
        nombres.add(1, "Sofia");

        System.out.println("\nDespués de agregar 'Sofia' en la posición 1:");
        System.out.println(nombres);


        // Eliminar el nombre en la posición 0 y mostrar el eliminado
        String nombreEliminado = nombres.remove(0);

        System.out.println("\nNombre eliminado en la posición 0:");
        System.out.println(nombreEliminado);

        System.out.println("Lista después de eliminar:");
        System.out.println(nombres);


        // Reemplazar el elemento en la posición 0
        nombres.set(0, "Jorge");

        System.out.println("\nLista después de reemplazar el elemento en la posición 0 con 'Jorge':");
        System.out.println(nombres);


        // Verificar si "Ana" está en el ArrayList
        System.out.println("\n¿El nombre 'Ana' está en la lista?");

        if (nombres.contains("Ana")) {
            System.out.println("Sí, el nombre Ana está en la lista");
        } else {
            System.out.println("No, el nombre Ana no está en la lista");
        }


        // Ordenar alfabéticamente
        Collections.sort(nombres);

        System.out.println("\nLista ordenada alfabéticamente:");
        System.out.println(nombres);


        // Ordenar de forma inversa
        Collections.sort(nombres, Collections.reverseOrder());

        System.out.println("\nLista ordenada de forma inversa:");
        System.out.println(nombres);


        // Crear una sublista con los primeros 3 elementos
        ArrayList<String> subLista = new ArrayList<>(nombres.subList(0, 3));

        System.out.println("\nSublista con los primeros 3 elementos:");
        System.out.println(subLista);


        // Convertir el ArrayList a arreglo String[]
        String[] arregloNombres = nombres.toArray(new String[0]);

        System.out.println("\nContenido del arreglo String[]:");

        for (String nombre : arregloNombres) {
            System.out.println(nombre);
        }


        // Obtener el elemento en la posición 1
        String elementoPosicionUno = nombres.get(1);

        System.out.println("\nElemento en la posición 1:");
        System.out.println(elementoPosicionUno);


        // Encontrar la última posición de un nombre
        int ultimaPosicionAna = nombres.lastIndexOf("Ana");

        System.out.println("\nÚltima posición del nombre 'Ana':");
        System.out.println(ultimaPosicionAna);

    }
}
