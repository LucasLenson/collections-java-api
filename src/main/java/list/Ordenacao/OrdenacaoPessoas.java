package main.java.list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {
    private List<Pessoa> pessoaList;

    public OrdenacaoPessoas() {
        this.pessoaList = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura) {
        pessoaList.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarPorIdade() {
        List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);
        if (!pessoaList.isEmpty()) {
            Collections.sort(pessoasPorIdade);
            return pessoasPorIdade;
        } else {
            throw new RuntimeException("Lista vazia.");
        }
    }

    public List<Pessoa> ordenarPorAltura() {
        List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoaList);
        if (!pessoaList.isEmpty()) {
            Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
            return pessoasPorAltura;
        } else {
            throw new RuntimeException("Lista vazia.");
        }
    }

    public static void main(String[] args) {
        OrdenacaoPessoas ordenacaoPessoas = new OrdenacaoPessoas();


        ordenacaoPessoas.adicionarPessoa("Lucas", 30, 1.78);
        ordenacaoPessoas.adicionarPessoa("Julia", 5, 1.80);
        ordenacaoPessoas.adicionarPessoa("Banze", 40, 1.60);
        ordenacaoPessoas.adicionarPessoa("Fibo", 18, 1.55);

        System.out.println("Lista completa: ");
        System.out.println(ordenacaoPessoas.pessoaList);

        System.out.println("Lista ordenada por idade usando comparable: ");
        System.out.println(ordenacaoPessoas.ordenarPorIdade());

        System.out.println("Lista ordenada por altura usando comparator: ");
        System.out.println(ordenacaoPessoas.ordenarPorAltura());
    }
}