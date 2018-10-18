package locadora;

import java.util.Random;

public class Filme {
    private String Titulo;
    private String Genero;
    private String Diretor;
    private int Ano;
    private int Id;
    
    Random random = new Random();

    public Filme() {       
        this.Id = random.nextInt()%10000;
    }
    
    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String Genero) {
        this.Genero = Genero;
    }

    public String getDiretor() {
        return Diretor;
    }

    public void setDiretor(String Diretor) {
        this.Diretor = Diretor;
    }

    public int getAno() {
        return Ano;
    }

    public void setAno(int Ano) {
        this.Ano = Ano;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }
    
    public void ImprimeFilme(){
        System.out.println("Título: "+getTitulo()
                + "\t ID: "+getId()
                + "\nDiretor: "+getDiretor()
                + "\nAno de Lançamento: "+getAno()
                + "\nGênero: "+getGenero()
                + "\n");
    }
}
