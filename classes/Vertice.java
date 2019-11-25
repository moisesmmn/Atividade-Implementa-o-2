package classes;

import java.util.ArrayList;


public class Vertice {

	private int numero;
    private ArrayList<Vertice> listaDiv = new ArrayList<Vertice>();
    private ArrayList<Vertice> listaConv = new ArrayList<Vertice>();
    private boolean visitado;
    private int grau;

    
    public Vertice(int numero, boolean visitado) {
        this.numero = numero;;
        this.visitado = visitado;
    }

    public ArrayList<Vertice> getlistaDiv() {
        return listaDiv;
    }

    public void setlistaDiv(ArrayList<Vertice> listaDiv) {
        this.listaDiv = listaDiv;
    }

    public ArrayList<Vertice> getlistaConv() {
        return listaConv;
    }

    public void setlistaConv(ArrayList<Vertice> listaConv) {
        this.listaDiv = listaConv;
    }
    public boolean isVisitado() {
        return visitado;
    }

    public void setVisitado(boolean visitado) {
        this.visitado = visitado;
    }

    public int getGrau () 
    {
    	this.grau = this.getlistaConv().size();
       return this.grau;
    }
    
    public void setGrau(int grau) {
    	
    	this.grau = grau;
    }
    
   @Override
public String toString() {
	
	return this.numero + "";
}
}
