package Buscas;

import java.util.ArrayList;

import classes.Grafo;
import classes.Vertice;

public class Articulacao {

	ArrayList<Vertice> arvoreG = new ArrayList<Vertice>();
	
	
    public Articulacao() {
    	
    }
	
	public void Busca (Grafo g) 
	 {
		if(!this.arvoreG.isEmpty())
		{
			this.arvoreG.clear();
		}
		
		for (Vertice v : g.getConjuntoVertices())
		{
			if(!v.isVisitado())
				{
					this.buscaProfRec(v);
				}
			
		}
		
		if(!this.arvoreG.isEmpty())
		{
			System.out.println(" Arvore Geradora -------------------");
			for(int i =0; i < this.arvoreG.size(); i++)
			{
				System.out.println(" Posicao : " +(i+1) + " Vertice - " + this.arvoreG.get(i));
			}	
		}
		else
		{
			System.out.println("Esse grafo nao possui Articulacao");
		}
	 }
	 
	
    
    
    private void buscaProfRec(Vertice v)
    {
    	v.setVisitado(true);
    	this.arvoreG.add(v);
    	
    	for (Vertice k :  v.getlistaDiv())
    	{
    		if(!k.isVisitado())
    		{
    			this.buscaProfRec(k);
    		}
    	}
    	
    }

	 
 }
