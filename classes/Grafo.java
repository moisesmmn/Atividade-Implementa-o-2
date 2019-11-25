package classes;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

public class Grafo {

	    private Stack<Vertice> p;

	    private ArrayList<Vertice> conjuntoVertices;

	    public Grafo(ArrayList<Vertice> conjuntoVertices) 
	    {
	        this.conjuntoVertices = conjuntoVertices;
	    }


	    public ArrayList<Vertice> getConjuntoVertices() 
	    {
	        return conjuntoVertices;
	    }

	    public void setConjuntoVertices(ArrayList<Vertice> conjuntoVertices) 
	    {
	        this.conjuntoVertices = conjuntoVertices;
	    }
	    
	    public Vertice getRaiz ()
	    {
	        
	        return p.firstElement();
	    }
	    
}
