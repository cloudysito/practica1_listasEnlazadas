package Practica1;

/**
 *
 * Clase principal que prueba la lista enlazada simple.
 */
public class Main {

    public static void main(String[] args) {
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
    }
}