package javaPoo;

import java.util.ArrayList;
import java.util.List;

public class CadastroFilmes {
    private List<Filme> cadFilmes = new ArrayList<Filme>();

    public void addFilme(Filme filme){
        cadFilmes.add(filme);
    }

    public void removeFilme(Filme filme){
        cadFilmes.remove(filme);
    }

    public void printFilme(){
        for (Filme filme : cadFilmes) {
            System.out.println("Titulo: " + filme.getTitulo());
        }
    }

}
