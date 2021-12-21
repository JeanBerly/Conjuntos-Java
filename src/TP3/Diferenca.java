package TP3;

public class Diferenca<T> extends Conjunto<T> {
    private final Conjunto<T> conjunto1;
    private final Conjunto<T> conjunto2;
    public Diferenca(Conjunto<T> conj1, Conjunto<T> conj2){
        this.conjunto1 = conj1;
        this.conjunto2 = conj2;
    }
    @Override
    public Boolean contemElemento(T elemento) {
        return conjunto1.contemElemento(elemento) && !(conjunto2.contemElemento(elemento));
    }
}
