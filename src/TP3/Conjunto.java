package TP3;

public abstract class Conjunto<T>{
    public abstract Boolean contemElemento(T elemento);
    Conjunto<T> adicionarElemento(T elemento){
        if (contemElemento(elemento)){
            System.out.println("Elemento já existe.");
            return this;
        }
        return new ConjuntoElemento<T>(elemento, this);
    }
    Conjunto<T> uniao(Conjunto<T> conjunto){
        return new Uniao<>(this, conjunto);
    }
    Conjunto<T> intersecao(Conjunto<T> conjunto){
        return new Intersecao<>(this, conjunto);
    }
    Conjunto<T> diferenca(Conjunto<T> conjunto){
        return new Diferenca<>(this, conjunto);
    }
    Conjunto<T> complemento(){
        return new Complemento<>(this);
    }
}

