package Practica1;

/**
 * Clase que representa una lista doblemente enlazada circular.
 *
 * @param <T> el tipo de dato que almacena la lista.
 */
public class ListaDoblementeEnlazadaCircular<T> {
    private Nodo<T> inicial;
    private int contador;

    /**
     * Constructor que inicializa una lista vacía.
     */
    public ListaDoblementeEnlazadaCircular() {
        this.inicial = null;
        this.contador = 0;
    }

    /**
     * Verifica si la lista está vacía.
     *
     * @return true si la lista está vacía, false en caso contrario.
     */
    public boolean isEmpty() {
        return inicial == null;
    }

    /**
     * Obtiene el tamaño de la lista.
     *
     * @return el número de elementos en la lista.
     */
    public int size() {
        return contador;
    }

    /**
     * Agrega un elemento al inicio de la lista.
     *
     * @param dato el dato a agregar.
     */
    public void addFirst(T dato) {
        Nodo<T> nuevo = new Nodo<>(dato);
        if (isEmpty()) {
            inicial = nuevo;
            inicial.setSiguiente(inicial);
            inicial.setAnterior(inicial);
        } else {
            Nodo<T> ultimo = inicial.getAnterior();
            nuevo.setSiguiente(inicial);
            nuevo.setAnterior(ultimo);
            inicial.setAnterior(nuevo);
            ultimo.setSiguiente(nuevo);
            inicial = nuevo;
        }
        contador++;
    }

    /**
     * Agrega un elemento al final de la lista.
     *
     * @param dato el dato a agregar.
     */
    public void addLast(T dato) {
        Nodo<T> nuevo = new Nodo<>(dato);
        if (isEmpty()) {
            inicial = nuevo;
            inicial.setSiguiente(inicial);
            inicial.setAnterior(inicial);
        } else {
            Nodo<T> ultimo = inicial.getAnterior();
            nuevo.setSiguiente(inicial);
            nuevo.setAnterior(ultimo);
            ultimo.setSiguiente(nuevo);
            inicial.setAnterior(nuevo);
        }
        contador++;
    }

    /**
     * Elimina y retorna el primer elemento de la lista.
     *
     * @return el primer elemento de la lista, o null si la lista está vacía.
     */
    public T removeFirst() {
        if (isEmpty()) {
            return null;
        }
        T dato = inicial.getDato();
        if (inicial.getSiguiente() == inicial) {
            inicial = null;
        } else {
            Nodo<T> ultimo = inicial.getAnterior();
            inicial = inicial.getSiguiente();
            inicial.setAnterior(ultimo);
            ultimo.setSiguiente(inicial);
        }
        contador--;
        return dato;
    }

    /**
     * Elimina y retorna el último elemento de la lista.
     *
     * @return el último elemento de la lista, o null si la lista está vacía.
     */
    public T removeLast() {
        if (isEmpty()) {
            return null;
        }
        Nodo<T> ultimo = inicial.getAnterior();
        T dato = ultimo.getDato();
        if (ultimo == inicial) {
            inicial = null;
        } else {
            Nodo<T> penultimo = ultimo.getAnterior();
            penultimo.setSiguiente(inicial);
            inicial.setAnterior(penultimo);
        }
        contador--;
        return dato;
    }

    /**
     * Verifica si la lista contiene un elemento específico.
     *
     * @param dato el dato a buscar.
     * @return true si la lista contiene el dato, false en caso contrario.
     */
    public boolean contains(T dato) {
        if (isEmpty()) {
            return false;
        }
        Nodo<T> actual = inicial;
        do {
            if (actual.getDato().equals(dato)) {
                return true;
            }
            actual = actual.getSiguiente();
        } while (actual != inicial);
        return false;
    }

    /**
     * Obtiene el elemento en una posición específica de la lista.
     *
     * @param index la posición del elemento a obtener.
     * @return el elemento en la posición especificada, o null si el índice es inválido.
     */
    public T getElement(int index) {
        if (index < 0 || index >= contador) {
            return null;
        }
        Nodo<T> actual = inicial;
        for (int i = 0; i < index; i++) {
            actual = actual.getSiguiente();
        }
        return actual.getDato();
    }

    /**
     * Elimina todos los elementos de la lista.
     */
    public void clear() {
        inicial = null;
        contador = 0;
    }

    /**
     * Retorna una representación en cadena de la lista.
     *
     * @return una cadena que representa la lista.
     */
    @Override
    public String toString() {
        if (isEmpty()) {
            return "null";
        }
        StringBuilder sb = new StringBuilder();
        Nodo<T> actual = inicial;
        do {
            sb.append(actual.getDato()).append(" <-> ");
            actual = actual.getSiguiente();
        } while (actual != inicial);
        sb.append("(circular)");
        return sb.toString();
    }
}
