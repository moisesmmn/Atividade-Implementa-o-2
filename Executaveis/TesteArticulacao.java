package Executaveis;

import java.util.ArrayList;

import Buscas.Articulacao;
import classes.Grafo;
import classes.Vertice;

public class TesteArticulacao {

	public static void main(String[] args) 
	{
		
		/*
		 Criando Vertices.
		 */
		
		Vertice v1 = new Vertice(1,false);
		Vertice v2 = new Vertice(2,false);
		Vertice v3 = new Vertice(3,false);
		Vertice v4 = new Vertice(4,false);
		Vertice v5 = new Vertice(5,false);
		Vertice v6 = new Vertice(6,false);
		Vertice v7 = new Vertice(7,false);
		Vertice v8 = new Vertice(8,false);
		
		/*
		 Criando Lista de vertices Divergentes.
		 */
		
		ArrayList<Vertice> listaDiV1 = new ArrayList<Vertice>();
		ArrayList<Vertice> listaDiV2 = new ArrayList<Vertice>();
		ArrayList<Vertice> listaDiV3 = new ArrayList<Vertice>();
		ArrayList<Vertice> listaDiV4 = new ArrayList<Vertice>();
		ArrayList<Vertice> listaDiV5 = new ArrayList<Vertice>();
		ArrayList<Vertice> listaDiV6 = new ArrayList<Vertice>();
		ArrayList<Vertice> listaDiV7 = new ArrayList<Vertice>();
		ArrayList<Vertice> listaDiV8 = new ArrayList<Vertice>();
		
		/*
		 Adicionando Vertices e setando listas para respectivos vertices.
		 */
		
		listaDiV1.add(v2); listaDiV1.add(v3);
		listaDiV2.add(v1); listaDiV2.add(v4); listaDiV2.add(v5);
		listaDiV3.add(v1); listaDiV3.add(v4);
		listaDiV4.add(v2); listaDiV4.add(v3); listaDiV4.add(v5); listaDiV4.add(v6);
		listaDiV5.add(v2); listaDiV5.add(v4);
		listaDiV6.add(v4); listaDiV6.add(v7); listaDiV6.add(v8);
		listaDiV7.add(v6); listaDiV7.add(v8);
		listaDiV8.add(v6); listaDiV8.add(v7);
		
		v1.setlistaDiv(listaDiV1);  v2.setlistaDiv(listaDiV2);  v3.setlistaDiv(listaDiV3); v4.setlistaDiv(listaDiV4);
		v5.setlistaDiv(listaDiV5);  v6.setlistaDiv(listaDiV6);  v7.setlistaDiv(listaDiV7); v8.setlistaDiv(listaDiV8);
		
		
		/*
		 Criando conjuntos de vetices e instanciando um grafo.
		 */
		
        ArrayList<Vertice> conjuntoVertices = new ArrayList<Vertice>();
        
        conjuntoVertices.add(v1); conjuntoVertices.add(v2); conjuntoVertices.add(v3); conjuntoVertices.add(v4);
        conjuntoVertices.add(v5); conjuntoVertices.add(v6); conjuntoVertices.add(v7); conjuntoVertices.add(v8);
        
        Grafo grafo = new Grafo(conjuntoVertices);
        
        /*
		 Aplicando Articuala��o.
		 */
        
        Articulacao art = new Articulacao();
        
        art.Busca(grafo);
	}

}
