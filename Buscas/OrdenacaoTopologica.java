package Buscas;

import classes.Grafo;
import classes.Vertice;

public class OrdenacaoTopologica 
{

	
	public OrdenacaoTopologica() 
	{

	}
	
	
	public void Busca (Grafo g)
	{
		for(Vertice v: g.getConjuntoVertices())
		{
			if(v.getGrau() == 0 )
			{
			
				if(!v.isVisitado())
				{
					this.ordemTopo(v);
					
				}
			}
			
		}
	}
	
	
	private void ordemTopo(Vertice v) 
	{
        v.setVisitado(true);
        System.out.println(v);
        for(Vertice d : v.getlistaDiv())
        {
        	d.getlistaConv().remove(v); 
        }
        
	}
}
