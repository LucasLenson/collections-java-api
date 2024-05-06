package main.java.set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {

    private Set<Convidado> convidadoSet;

    public ConjuntoConvidados() {
        this.convidadoSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite) {
        convidadoSet.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite){
        Convidado convidadoParaRemover = null;
        for(Convidado c : convidadoSet){
            if(c.getCodigoConvite() == codigoConvite){
                convidadoParaRemover = c;
                break;
            }
        }
        convidadoSet.remove(convidadoParaRemover);
    }

    public int contarConvidados() {
        return convidadoSet.size();
    }

    public void exibirConvidados(){
        System.out.println(convidadoSet);
    }

    public static void main(String[] args) {

        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();

        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidados dentro do set de convidados");

        conjuntoConvidados.adicionarConvidado("Lucas", 1111);
        conjuntoConvidados.adicionarConvidado("Ana Julia", 2222);
        conjuntoConvidados.adicionarConvidado("Banze", 3333);
        conjuntoConvidados.adicionarConvidado("Fibo", 4444);

        System.out.print("Convidados no set:");
        conjuntoConvidados.exibirConvidados();
        System.out.println();

        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidados dentro do set de convidados");
        System.out.println();

        conjuntoConvidados.removerConvidadoPorCodigoConvite(2222);
        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidados dentro do set de convidados apos a remocao");
        System.out.println();

        System.out.println("Convidados no conjunto apos a remocao: ");
        conjuntoConvidados.exibirConvidados();
    }

}
