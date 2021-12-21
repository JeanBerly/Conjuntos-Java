package TP3;

public class ConjuntoElemento<T> extends Conjunto<T> {
    private final T valor;
    private final Conjunto<T> conjunto;
    public ConjuntoElemento(T elemento, Conjunto<T> conjunto) {
        this.valor = elemento;
        this.conjunto = conjunto;
    }
    @Override
    public Boolean contemElemento(T elemento) {
        return valor == elemento || conjunto.contemElemento(elemento);
    }
}
