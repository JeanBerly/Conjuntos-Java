package TP3;

public class Complemento<T> extends Conjunto<T> {
    private final Conjunto<T> conjunto;
    public Complemento(Conjunto<T> conj){
        this.conjunto = conj;
    }
    @Override
    public Boolean contemElemento(T elemento) {
        return !(conjunto.contemElemento(elemento));
    }
}
