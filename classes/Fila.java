package classes;

import java.util.LinkedList;

public class Fila<T> {
	
	LinkedList<T> lista = new LinkedList<T>();
    int tamanho =0;

    public void enfileirar(T elemento) {

        lista.add(elemento);
        this.tamanho++;
    }

    public T desenfileirar() {

        if(vazia()){

            return null;
        }

        this.tamanho--;
        return this.lista.removeFirst();
    }

    public T get(int indice){

        return this.get(indice);
    }

    public T primeiro() {

        return this.lista.getFirst();
    }

    public int tamanho() {


        return this.tamanho;
    }

    public boolean vazia() {


        return this.tamanho == 0;
    }

    public void limpar() {

        this.lista.clear();

        this.tamanho = 0;
    }

    public String toString() {

        return this.lista.toString();
    }

}
