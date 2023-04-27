package Projeto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Estoque {
	private ArrayList<Produto> produtos;
	
	public Estoque() {
		// TODO Auto-generated constructor stub
		produtos = new ArrayList<Produto>();
	}

	public void adiciona(Produto p) {
		produtos.add(p);
	}

	public void listaProdutos() {
		for (Produto prod : produtos) {

			System.out.println("Nome: "+prod.getNome());

			System.out.println("Preço: "+prod.getPreco());

			System.out.println("Código: "+prod.getCodigo());
		
			System.out.println("Quantidade: "+prod.getQuant());

			System.out.println("---------");
		}
	}
	
	public void imprimeOrdenado() {
		Collections.sort(produtos);

		listaProdutos();
	}
	
	public void imprimeOrdenadoPreco() {
	    
		Collections.sort(produtos, new Comparator<Produto>() {
	        public int compare(Produto p1, Produto p2) {
	            return Double.compare(p1.getPreco(), p2.getPreco());
	        }
	    });
		listaProdutos();
	}

	public void imprimeOrdenadoCodigo() {
		Collections.sort(produtos, new Comparator<Produto>() {
	        public int compare(Produto p1, Produto p2) {
	            return Integer.compare(p1.getCodigo(), p2.getCodigo());
	        }
	    });
		listaProdutos();
	}

	public void imprimeOrdenadoQuant() {
	    Collections.sort(produtos, new Comparator<Produto>() {
	        public int compare(Produto p1, Produto p2) {
	            return Integer.compare(p1.getQuant(), p2.getQuant());
	        }
	    });
	    listaProdutos();
	}
	}



