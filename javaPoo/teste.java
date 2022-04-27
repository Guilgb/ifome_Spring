package javaPoo;

public class teste {
    public static void main(String[] args) {
        Filme avengers = new Filme();
        avengers.setTitulo("Avenges");
        avengers.setCategoria("Ação");
        avengers.setDuracao(200);
        avengers.setPreco(20);

        CadastroFilmes cadFilme = new CadastroFilmes();
        cadFilme.addFilme(avengers);

    }
}
