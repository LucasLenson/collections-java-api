package main.java.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompra {

    private List<Item> itemList;

    public CarrinhoDeCompra() {
        this.itemList = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        itemList.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome){
        List<Item> itensParaRemover = new ArrayList<>();
        if (!itemList.isEmpty()) {
        for(Item i : itemList){
            if(i.getNome().equalsIgnoreCase(nome)){
                itensParaRemover.add(i);
            }
        }
        itemList.removeAll(itensParaRemover);
    } else {
        System.out.println("Nao existem itens na lista.");
        }
    }

    public double calcularValorTotal(){
        double soma = 0.0;

        for(Item i : itemList){
            double valor = i.getPreco() * i.getQuantidade();
            soma += valor;
        }
        return soma;
    }

    public void exibirItens(){
        if (!itemList.isEmpty()) {
        System.out.println(itemList);
    } else {
            System.out.println("A lista esta vazia.");
        }
    }

    public static void main(String[] args) {

        CarrinhoDeCompra carrinho = new CarrinhoDeCompra();

        carrinho.adicionarItem("Leite", 20.0, 5);
        carrinho.adicionarItem("Ovos", 10.0, 7);
        carrinho.adicionarItem("Porrete", 5.0, 10);

        System.out.println("Todos os itens: ");
        carrinho.exibirItens();
        System.out.println("Valor total: " + carrinho.calcularValorTotal());

        carrinho.removerItem("Leite");

        System.out.println(" ");
        System.out.println("Após retirar todos o leite: ");
        carrinho.exibirItens();
        System.out.println("Valor total: " + carrinho.calcularValorTotal());

    }
}