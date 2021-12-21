package TP3;

public class ConjuntoVazio<T> extends Conjunto{
    public ConjuntoVazio(){}
    public Boolean contemElemento(Object elemento) {
        return false;
    }
}
