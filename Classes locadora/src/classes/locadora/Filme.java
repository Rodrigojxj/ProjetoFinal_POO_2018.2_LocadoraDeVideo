package classes.locadora;
public class Filme {
    int id_Filme;
    String titulo;
    String genero;
    int ano;
    String diretor;

    public Filme(int id_Filme, String titulo, String genero, int ano, String diretor) {
        this.id_Filme = id_Filme;
        this.titulo = titulo;
        this.genero = genero;
        this.ano = ano;
        this.diretor = diretor;
    }

    public int getId_Filme() {
        return id_Filme;
    }

    public void setId_Filme(int id_Filme) {
        this.id_Filme = id_Filme;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }   
}