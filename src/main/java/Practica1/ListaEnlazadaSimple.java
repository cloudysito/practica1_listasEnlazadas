package Practica1;

/**
 * Clase que representa una lista enlazada simple.
 *
 * @param <T> el tipo de dato que almacena la lista.
 */
public class ListaEnlazadaSimple<T> {
    private Nodo<T> inicial;
    private int contador;

    /**
     * Constructor que inicializa una lista vacía.
     */
    public ListaEnlazadaSimple() {
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
        nuevo.setSiguiente(inicial);
        inicial = nuevo;
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
        } else {
            Nodo<T> actual = inicial;
            while (actual.getSiguiente() != null) {
                actual = actual.getSiguiente();
            }
            actual.setSiguiente(nuevo);
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
        inicial = inicial.getSiguiente();
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
        if (inicial.getSiguiente() == null) {
            T dato = inicial.getDato();
            inicial = null;
            contador--;
            return dato;
        }
        Nodo<T> actual = inicial;
        while (actual.getSiguiente().getSiguiente() != null) {
            actual = actual.getSiguiente();
        }
        T dato = actual.getSiguiente().getDato();
        actual.setSiguiente(null);
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
        Nodo<T> actual = inicial;
        while (actual != null) {
            if (actual.getDato().equals(dato)) {
                return true;
            }
            actual = actual.getSiguiente();
        }
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
        StringBuilder sb = new StringBuilder();
        Nodo<T> actual = inicial;
        while (actual != null) {
            sb.append(actual.getDato()).append(" -> ");
            actual = actual.getSiguiente();
        }
        sb.append("null");
        return sb.toString();
    }
}