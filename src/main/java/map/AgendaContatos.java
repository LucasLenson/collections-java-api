package main.java.map;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {

    private Map<String, Integer> agendaContatoMap;

    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone){
        agendaContatoMap.put(nome, telefone);
    }

    public void removerContato(String nome){
        if(!agendaContatoMap.isEmpty()){
            agendaContatoMap.remove(nome);
        }
    }

    public void exibirContatos(){
        System.out.println(agendaContatoMap);
    }

    public Integer pesquisarPorNome(String nome){
        Integer numeroPorNome = null;
        if(!agendaContatoMap.isEmpty()){
            numeroPorNome = agendaContatoMap.get(nome);
        }
        return numeroPorNome;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Lucas", 111111);
        agendaContatos.adicionarContato("Ana Julia", 222222);
        agendaContatos.adicionarContato("Banze", 333333);
        agendaContatos.adicionarContato("Fibo", 444444);

        System.out.println("Exibindo contatos: ");
        agendaContatos.exibirContatos();
        System.out.println();

        System.out.println("Exibindo contatos sem o Fibo: ");
        agendaContatos.removerContato("Fibo");
        agendaContatos.exibirContatos();
        System.out.println();


        System.out.println("Pesquisando por nome 'Lucas': ");
        Integer numeroPesquisa = agendaContatos.pesquisarPorNome("Lucas");
        System.out.println("Número de telefone de Lucas: " + numeroPesquisa);
        System.out.println();

        System.out.println("Pesquisando por nome inexistente: ");
        Integer numeroPesquisaNaoExistente = agendaContatos.pesquisarPorNome("Nome inexistente");
        System.out.println("Número de telefone de pessoa inexistente: " + numeroPesquisaNaoExistente);
    }
}
