package main.java.set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {

    private Set<Produto> produtoSet;

    public CadastroProdutos() {
        this.produtoSet = new HashSet<>();
    }

    public void adicionarProduto(String nome, long cod, double preco, int quantidade) {
        produtoSet.add(new Produto(nome, cod, preco, quantidade));
    }

    public Set<Produto> exibirProdutosPorNome() {
        Set<Produto> produtosPorNome = new TreeSet<>(produtoSet);
        return produtosPorNome;
    }

    public Set<Produto> exibirProdutosPorPreco() {
        Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
        produtosPorPreco.addAll(produtoSet);
        return produtosPorPreco;
    }


    public static void main(String[] args) {
        CadastroProdutos cadastroProdutos = new CadastroProdutos();

        cadastroProdutos.adicionarProduto("Leite", 11 ,100d, 1);
        cadastroProdutos.adicionarProduto("Ovos", 22, 200d, 2);
        cadastroProdutos.adicionarProduto("Porrete", 33, 300d, 3);
        cadastroProdutos.adicionarProduto("Azeite", 44, 400d, 4);

        System.out.println("Lista de produtos: ");
        System.out.println(cadastroProdutos.produtoSet);
        System.out.println();

        System.out.println("Ordenados por nome (Comparable): ");
        System.out.println(cadastroProdutos.exibirProdutosPorNome());
        System.out.println();

        System.out.println("Ordenados por preco (Comparator): ");
        System.out.println(cadastroProdutos.exibirProdutosPorPreco());
        System.out.println();
    }

}
