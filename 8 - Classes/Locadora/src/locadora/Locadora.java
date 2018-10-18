package locadora;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Locadora {
    
    List<Filme> filmes = new ArrayList<>();
    Scanner scan = new Scanner(System.in);
    
    public boolean AddFilme(){
        Filme f = new Filme();
        System.out.println("\n[ADICIONAR FILME]\n");
        System.out.print("TÍTULO: ");
        f.setTitulo(scan.next());
        System.out.print("ANO DE LANÇAMENTO: ");
        f.setAno(scan.nextInt());
        System.out.print("GÊNERO: ");
        f.setGenero(scan.next());
        System.out.print("DIRETOR: ");
        f.setDiretor(scan.next());
        return filmes.add(f);
    }
    
    public void ListaFilmes(){
        for (Filme filme : filmes) {
            filme.ImprimeFilme();
        }
    }
    
    private boolean BuscaTitulo(String nome){
        for (Filme filmes : this.filmes) {
            if (filmes.getTitulo().equals(nome)) {
                return true;
            }
        }
        return false;
    }
    
    private boolean BuscaID(int id){
        for (Filme filmes : this.filmes) {
            if (filmes.getId() == id) {
                return true;
            }
        }
        return false;
    }
    
    public void BuscaFilme(){
        System.out.println("\n[PESQUISAR FILME]\n"
                + "Digite o título: ");
        String nome = scan.next();
        if (BuscaTitulo(nome)){
            for (int i = 0; i < filmes.size(); i++){
                if(filmes.get(i).getTitulo().equals(nome)){            
                   filmes.get(i).ImprimeFilme();
                }
            }   
        } else {
            System.out.println("Filme não encontrado");
        }
    }
    
    public boolean ExcluiFilme(){
        ListaFilmes();
        System.out.println("\n[REMOVER FILME]\n"
            + "Digite o id do filme:");
        int id = scan.nextInt();
        for(int i = 0; i < filmes.size(); i++){
            if (filmes.get(i).getId() == id){
                filmes.remove(i);
                System.out.println("\nFilme removido com sucesso!");
                return true;
            }
        }
        System.out.println("\nNão foi possível encontrar o filme ou removê-lo.");
        return false;
    }

    public void EditaFilme() {
        System.out.println("\nDigite o nome do filme: ");
        String nome = scan.next();
        if (BuscaTitulo(nome)){
            for (int i = 0; i < filmes.size(); i++){
                if(filmes.get(i).getTitulo().equals(nome)){            
                    filmes.get(i).ImprimeFilme();
                    System.out.println("[EDITAR FILME]\n\n");
                    System.out.print("TÍTULO: ");
                    filmes.get(i).setTitulo(scan.next());
                    System.out.print("ANO DE LANÇAMENTO: ");
                    filmes.get(i).setAno(scan.nextInt());
                    System.out.print("GÊNERO: ");
                    filmes.get(i).setGenero(scan.next());
                    System.out.print("DIRETOR: ");
                    filmes.get(i).setDiretor(scan.next());
                }
            }
            
        } else {
            System.out.println("Filme não encontrado");
        }
    }
}
