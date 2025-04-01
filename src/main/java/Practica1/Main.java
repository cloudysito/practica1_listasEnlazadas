package Practica1;

/**
 *
 * Clase principal que prueba la lista enlazada simple.
 */
public class Main {

    public static void main(String[] args) {
        // Prueba de la lista enlazada simple
        ListaEnlazadaSimple<Integer> lista = new ListaEnlazadaSimple<>();

        lista.addFirst(1);
        lista.addLast(2);
        lista.addLast(3);
        System.out.println("Lista despues de agregar los elementos: " + lista);

        lista.removeFirst();
        System.out.println("Lista despues de eliminar el primer elemento: " + lista);

        lista.removeLast();
        System.out.println("Lista despues de eliminar el ultimo elemento: " + lista);

        System.out.println("La lista contiene el numero 2: " + lista.contains(2));
        System.out.println("Elemento en el índice 0: " + lista.getElement(0));

        lista.clear();
        System.out.println("Lista despues de borrar todos los datos: " + lista);

        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();

        // Prueba de la lista doblemente enlazada
        ListaDoblementeEnlazada<Integer> lista2 = new ListaDoblementeEnlazada<>();
        lista2.addFirst(1);
        lista2.addLast(2);
        lista2.addLast(3);

        System.out.println("Lista doblemente enlazada despues de agregar los elementos: " + lista2);
        lista2.removeFirst();

        System.out.println("Lista doblemente enlazada despues de eliminar el primer elemento: " + lista2);
        lista2.removeLast();

        System.out.println("Lista doblemente enlazada despues de eliminar el ultimo elemento: " + lista2);
        System.out.println("La lista doblemente enlazada contiene el numero 2: " + lista2.contains(2));
        System.out.println("Elemento en el índice 0 de la lista doblemente enlazada: " + lista2.getElement(0));
        lista2.clear();

        System.out.println("Lista doblemente enlazada despues de borrar todos los datos: " + lista2);

        System.out.println("");
        System.out.println("--------------------------------\n");

        // Prueba de la lista enlazada circular
        ListaEnlazadaCircular<Integer> lista3 = new ListaEnlazadaCircular<>();
        lista3.addFirst(1);
        lista3.addLast(2);
        lista3.addLast(3);

        System.out.println("Lista circular despues de agregar los elementos: " + lista3);
        lista3.removeFirst();

        System.out.println("Lista circular despues de eliminar el primer elemento: " + lista3);
        lista3.removeLast();

        System.out.println("Lista circular despues de eliminar el ultimo elemento: " + lista3);
        System.out.println("La lista circular contiene el numero 2: " + lista3.contains(2));
        System.out.println("Elemento en el índice 0 de la lista circular: " + lista3.getElement(0));
        lista3.clear();

        System.out.println("Lista circular despues de borrar todos los datos: " + lista3);
        System.out.println("La lista circular esta vacia: " + lista3.isEmpty());
        System.out.println("El tamaño de la lista circular es: " + lista3.size());

        System.out.println("");
        System.out.println("--------------------------------\n");

        // Prueba de la lista doblemente enlazada circular
        ListaDoblementeEnlazadaCircular<Integer> lista4 = new ListaDoblementeEnlazadaCircular<>();
        lista4.addFirst(1);
        lista4.addLast(2);
        lista4.addLast(3);

        System.out.println("Lista doblemente circular despues de agregar los elementos: " + lista4);
        lista4.removeFirst();

        System.out.println("Lista doblemente circular despues de eliminar el primer elemento: " + lista4);
        lista4.removeLast();

        System.out.println("Lista doblemente circular despues de eliminar el ultimo elemento: " + lista4);
        System.out.println("La lista doblemente circular contiene el numero 2: " + lista4.contains(2));
        System.out.println("Elemento en el índice 0 de la lista doblemente circular: " + lista4.getElement(0));
        lista4.clear();

        System.out.println("Lista doblemente circular despues de borrar todos los datos: " + lista4);
        System.out.println("La lista doblemente circular esta vacia: " + lista4.isEmpty());
        System.out.println("El tamaño de la lista doblemente circular es: " + lista4.size());

    }
}