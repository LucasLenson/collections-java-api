package main.java.set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {

    private Set<Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero){
        contatoSet.add(new Contato(nome, numero));
    }

    public void exibirContatos(){
        System.out.println(contatoSet);
    }

    public Set<Contato> pesquisarPorNome(String nome){
        Set<Contato> contatosPorNome = new HashSet<>();
        for (Contato c : contatoSet) {
            if(c.getNome().startsWith(nome)){
                contatosPorNome.add(c);
            }
        }
        return contatosPorNome;
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero) {
        Contato contatoAtualizado = null;
        for(Contato c : contatoSet){
            if (c.getNome().equalsIgnoreCase(nome)){
                c.setNumero(novoNumero);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }

    public static void main(String[] args) {

        AgendaContatos agendaContatos = new AgendaContatos();

        System.out.println("Lista vazia: ");
        agendaContatos.exibirContatos();

        agendaContatos.adicionarContato("Lucas", 11111111);
        agendaContatos.adicionarContato("Ana", 2222222);
        agendaContatos.adicionarContato("Ana Julia", 333333);
        agendaContatos.adicionarContato("Banze", 4444444);
        agendaContatos.adicionarContato("Fibo", 5555555);

        System.out.println("Lista com nomes: ");
        agendaContatos.exibirContatos();
        System.out.println();

        System.out.println("Pesquisa por 'Ana': ");
        System.out.println(agendaContatos.pesquisarPorNome("Ana"));
        System.out.println();

        Contato contatoAtualizado = agendaContatos.atualizarNumeroContato("Ana", 1234567);
        System.out.println("Contato atualizado: " + contatoAtualizado);
        System.out.println();

        System.out.println("Contatos na agenda após atualizacao:");
        agendaContatos.exibirContatos();
    }

}
