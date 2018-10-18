package locadora;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Gerente extends Funcionario{
    /*public Gerente(String login, String senha, int cpf, String telefone, int rg) {
        super(login, senha, cpf, telefone, rg);
    }*/
    
    List<Funcionario> funcionarios = new ArrayList<>();
    Scanner scan = new Scanner(System.in);
    
    public boolean AddFunc(){
        Funcionario f = new Funcionario();
        System.out.println("\n[ADICIONAR FUNCIONARIO]\n");
        System.out.print("NOME: ");
        f.setNome(scan.next());
        System.out.print("CPF: ");
        f.setCpf(scan.nextInt());
        System.out.print("RG: ");
        f.setRg(scan.nextInt());
        System.out.print("TELEFONE: ");
        f.setTelefone(scan.next());
        return funcionarios.add(f);
    }
    
    public void ListaFunc(){
        for (Funcionario funcionario : funcionarios) {
            funcionario.ImprimeFunc();
        }
    }
    
    private boolean BuscaNome(String nome){
        for (Funcionario funcionarios : this.funcionarios) {
            if (funcionarios.getNome().equals(nome)) {
                return true;
            }
        }
        return false;
    }
    
    private boolean BuscaID(int id){
        for (Funcionario funcionarios : this.funcionarios) {
            if (funcionarios.getId_funcionario() == id) {
                return true;
            }
        }
        return false;
    }
    
    public void BuscaFuncionario(){
        System.out.println("\n[PESQUISAR FUNCIONARIO]\n"
                + "Digite o Id: ");
        int id = scan.nextInt();
        if (BuscaID(id)){
            for (int i = 0; i < funcionarios.size(); i++){
                if(funcionarios.get(i).getId_funcionario() == id){            
                   funcionarios.get(i).ImprimeFunc();
                }
            }   
        } else {
            System.out.println("Funcionario não encontrado");
        }
    }
    
    public boolean ExcluiFuncionario(){
        ListaClientes();
        System.out.println("\n[REMOVER FUNCIONARIO]\n"
            + "Digite o id do funcionario:");
        int id = scan.nextInt();
        for(int i = 0; i < funcionarios.size(); i++){
            if (funcionarios.get(i).getId_funcionario() == id){
                funcionarios.remove(i);
                System.out.println("\nFuncionario removido com sucesso!");
                return true;
            }
        }
        System.out.println("\nNão foi possível encontrar o funcionario ou removê-lo. =[");
        return false;
    }

    public void EditaFuncionario() {
        System.out.println("\nDigite o id do funcionario: ");
        int id = scan.nextInt();
        if (BuscaID(id)){
            for (int i = 0; i < funcionarios.size(); i++){
                if(funcionarios.get(i).getId_funcionario() == id){            
                    funcionarios.get(i).ImprimeFunc();
                    System.out.println("[EDITAR FUNCIONARIO]\n\n");
                    System.out.print("NOME: ");
                    funcionarios.get(i).setNome(scan.next());
                    System.out.print("CPF: ");
                    funcionarios.get(i).setCpf(scan.nextInt());
                    System.out.print("RG: ");
                    funcionarios.get(i).setRg(scan.nextInt());
                    System.out.print("Telefone: ");
                    funcionarios.get(i).setTelefone(scan.next());
                }
            }
            
        } else {
            System.out.println("Funcionario não encontrado");
        }
    }
    
    
    
    
    
    
    
    
    /*CRIAR OS METODOS DO GERENTE
    EXCLUIR FUNCIONARIO
    ALTERAR FUNCIONARIO
    CADASTRAR FUNCIONARIO
    */
    
}
