package main.java.list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    private List<Livro> livroList;

    public CatalogoLivros() {
        this.livroList = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
        livroList.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor) {
        List<Livro> livrosPorAutor = new ArrayList<>();
        for (Livro l : livroList) {
            if (l.getAutor().equalsIgnoreCase(autor)) {
                livrosPorAutor.add(l);
            }
        }
        if (livrosPorAutor.isEmpty()) {
            System.out.println("Nenhum livro encontrado para o autor: " + autor);
        } else {
        return livrosPorAutor;
        }
        return null;
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
        List<Livro> livrosPorIntervaloAnos = new ArrayList<>();
        for (Livro l : livroList) {
            if (l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal) {
                livrosPorIntervaloAnos.add(l);
            }
        }
        if (livrosPorIntervaloAnos.isEmpty()) {
            System.out.println("Nenhum livro encontrado no intervalo de anos: " + anoInicial + " - " + anoFinal);
        }else {
            return livrosPorIntervaloAnos;
        }
        return null;
    }

    public Livro pesquisarPorTitulo(String titulo) {
        for (Livro l : livroList) {
            if (l.getTitulo().equalsIgnoreCase(titulo)) {
                return l;
            }
        }
        System.out.println("Nenhum livro encontrado com o título: " + titulo);
        return null;
    }



    public static void main(String[] args) {

        CatalogoLivros catalogoLivros = new CatalogoLivros();

        catalogoLivros.adicionarLivro("Livro1", "autor1", 1950);
        catalogoLivros.adicionarLivro("Livro2", "autor2", 1960);
        catalogoLivros.adicionarLivro("Livro3", "autor3", 1970);
        catalogoLivros.adicionarLivro("Livro4", "autor4", 1980);

        System.out.println("Livros por autor: ");
        System.out.println(catalogoLivros.pesquisarPorAutor("autor1"));
        System.out.println();

        System.out.println("Autor inexistente: ");
        System.out.println(catalogoLivros.pesquisarPorAutor("nome inexistente"));
        System.out.println();

        System.out.println("Livros por intervalo de ano: ");
        System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(1960, 1970));
        System.out.println();

        System.out.println("Livros por intervalo de ano inexistente: ");
        System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(1940, 1943));
        System.out.println();

        System.out.println("Livro por titulo: ");
        System.out.println(catalogoLivros.pesquisarPorTitulo("Livro2"));
        System.out.println();

        System.out.println("Livro por titulo inexistente: ");
        System.out.println(catalogoLivros.pesquisarPorTitulo("Livro inexistente"));
    }


}


