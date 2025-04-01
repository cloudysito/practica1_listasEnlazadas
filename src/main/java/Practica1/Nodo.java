package Practica1;

/**
 * Clase que representa un nodo en una lista enlazada simple.
 *
 * @param <T> el tipo de dato que almacena el nodo.
 */
public class Nodo<T> {
    private T dato;
    private Nodo<T> anterior;
    private Nodo<T> siguiente;

    /**
     * Constructor que inicializa el nodo con un dato.
     *
     * @param dato el dato a almacenar en el nodo.
     */
    public Nodo(T dato) {
        this.dato = dato;
        this.siguiente = null;
    }

    /**
     * Obtiene el dato almacenado en el nodo.
     *
     * @return el dato almacenado en el nodo.
     */
    public T getDato() {
        return dato;
    }

    /**
     * Establece el dato del nodo.
     *
     * @param dato el dato a establecer en el nodo.
     */
    public void setDato(T dato) {
        this.dato = dato;
    }

    public Nodo<T> getAnterior() {
        return anterior;
    }

    /**
     * Establece el nodo anterior en la lista.
     *
     * @param anterior el nodo a establecer como anterior.
     */
    public void setAnterior(Nodo<T> anterior) {
        this.anterior = anterior;
    }


    /**
     * Obtiene el siguiente nodo en la lista.
     *
     * @return el siguiente nodo en la lista.
     */
    public Nodo<T> getSiguiente() {
        return siguiente;
    }

    /**
     * Establece el siguiente nodo en la lista.
     *
     * @param siguiente el nodo a establecer como siguiente.
     */
    public void setSiguiente(Nodo<T> siguiente) {
        this.siguiente = siguiente;
    }
}
