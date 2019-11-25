package Buscas;

import java.util.ArrayList;

import classes.Grafo;
import classes.Vertice;

public class FortementeConexo {

	ArrayList<Vertice> posOrdem;
	
	public FortementeConexo()
	{

	}
	
	
	public void Busca (Grafo g) 
	{
		
		for (Vertice v:g.getConjuntoVertices())
		{
			if(!v.isVisitado())
			{
				this.buscaProfRec(v);
			}
		}
		
	}
	
	
	private void buscaProfRec (Vertice v)
	{
		v.setVisitado(true);
		this.posOrdem.add(v);
		
		for(Vertice a : v.getlistaDiv())
		{
			if (!a.isVisitado())
			{
				this.buscaProfRec(a);
			}
			
		}
		
		Busca(this.gerarGrafOposto());
	}
	
	private Grafo gerarGrafOposto () 
	{
	   for(Vertice v : this.posOrdem)
	   {
		   ArrayList<Vertice> aux = v.getlistaDiv();
		   v.setlistaDiv(v.getlistaConv());
		   v.setlistaConv(aux);
	   }
	   
	   Grafo novoGraf = new Grafo(this.posOrdem);
	   
	   return novoGraf;
	}
	
}
