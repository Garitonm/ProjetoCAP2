package Projeto;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		int i = 0;

		Estoque listaProdutos = new Estoque();

		listaProdutos.adiciona(new Produto("caneta", 2.5,1,2));

		listaProdutos.adiciona(new Produto("cola", 5.5,2,4));

		listaProdutos.adiciona(new Produto("borracha", 2.0,3,1));        

        while (true) {

        	Scanner numero = new Scanner(System.in);

    		System.out.println("deseja inserir algum produto (1 = Sim/ 0 = Não):  ");

            int n = numero.nextInt();

            if(n == 0) {
            	break;
            }

            else {
            	Scanner p = new Scanner(System.in);
        		System.out.println("digite o produto: ");
                String novo_produto = p.nextLine();

                
                System.out.println("digite o valor: ");
                Scanner v = new Scanner(System.in);
                double valor = v.nextDouble();


                System.out.println("digite o codigo: ");
                Scanner c = new Scanner(System.in);
                int codigo = c.nextInt();

                
                System.out.println("digite a quantidade: ");
                Scanner q = new Scanner(System.in);
                int quant = q.nextInt();

                listaProdutos.adiciona(new Produto(novo_produto,valor,codigo,quant));

                System.out.println("Produto adicionado!");
            }
        }

       
        while(true) {
        	Scanner esc = new Scanner(System.in);

    		System.out.println("Como você desejar exibir os Produtos:"

    				+ "\n Por produtos (1)"

    				+ "\n Por preço (2):"

    				+ "\n Por codigo(3):"

    				+ "\n Por quantidade (4):"

    				+ "\n Nenhuma (0):");

            int es = esc.nextInt();

            if(es == 0) {
            	break;
            }

            else if(es == 1) {

            	listaProdutos.imprimeOrdenado();
            }

            else if(es == 2) {

            	listaProdutos.imprimeOrdenadoPreco();
            }

            else if(es == 3) {

            	listaProdutos.imprimeOrdenadoCodigo();
            }

            else if(es == 4) {

            	listaProdutos.imprimeOrdenadoQuant();
            }
        }
	}
}
