package Projeto;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Produto implements Comparable<Produto>{
	private String nome;

	private double preco;

	private int codigo;

	private int quant; 

	public Produto(String nome, double preco, int codigo,int quant) {
		this.nome = nome;

		this.preco = preco;

		this.codigo = codigo;

		this.quant = quant;
	}

	public int getQuant() {

		return quant;

	}

	public void setQuant(int quant) {

		this.quant = quant;

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public int getCodigo() {
		return codigo;
	}
	
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	@Override
	public int compareTo(Produto o) {		

		return this.getNome().compareTo(o.getNome());
	}

	
}