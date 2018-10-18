package locadora;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Funcionario extends Pessoa{
    private String login;
    private String senha;
    private int id_funcionario;
    
    List<Cliente> clientes = new ArrayList<>();
    Scanner scan = new Scanner(System.in);

    /*public Funcionario(String login, String senha, int cpf, String telefone, int rg) {
        super(cpf, telefone, rg);
        this.login = login;
        this.senha = senha;
    }*/
    
    public boolean autentica(String login, String senha) {
   	if(!this.getLogin().equals(login)) {
    		System.out.println("Login incorreto, tente novamente!");
    		return false;
    	}
    	if(!this.getSenha().equals(senha)) {
    		System.out.println("Senha incorreta, tente novamente!");
			return false;
		}
    	return true;
    }
    
    public boolean AddCliente(){
        Cliente c = new Cliente();
        System.out.println("\n[ADICIONAR CLIENTE]\n");
        System.out.print("NOME: ");
        c.setNome(scan.next());
        System.out.print("CPF: ");
        c.setCpf(scan.nextInt());
        System.out.print("RG: ");
        c.setRg(scan.nextInt());
        System.out.print("TELEFONE: ");
        c.setTelefone(scan.next());
        return clientes.add(c);
    }
    
    public void ListaClientes(){
        for (Cliente cliente : clientes) {
            cliente.ImprimeCliente();
        }
    }
    
    private boolean BuscaNome(String nome){
        for (Cliente clientes : this.clientes) {
            if (clientes.getNome().equals(nome)) {
                return true;
            }
        }
        return false;
    }
    
    private boolean BuscaID(int id){
        for (Cliente clientes : this.clientes) {
            if (clientes.getId_cliente() == id) {
                return true;
            }
        }
        return false;
    }
    
    public void BuscaCliente(){
        System.out.println("\n[PESQUISAR CLIENTE]\n"
                + "Digite o Id: ");
        int id = scan.nextInt();
        if (BuscaID(id)){
            for (int i = 0; i < clientes.size(); i++){
                if(clientes.get(i).getId_cliente() == id){            
                   clientes.get(i).ImprimeCliente();
                }
            }   
        } else {
            System.out.println("Cliente não encontrado");
        }
    }
    
    public boolean ExcluiCliente(){
        ListaClientes();
        System.out.println("\n[REMOVER CLIENTE]\n"
            + "Digite o id do cliente:");
        int id = scan.nextInt();
        for(int i = 0; i < clientes.size(); i++){
            if (clientes.get(i).getId_cliente() == id){
                clientes.remove(i);
                System.out.println("\nCliente removido com sucesso!");
                return true;
            }
        }
        System.out.println("\nNão foi possível encontrar o cliente ou removê-lo. =[");
        return false;
    }

    public void EditaCliente() {
        System.out.println("\nDigite o id do cliente: ");
        int id = scan.nextInt();
        if (BuscaID(id)){
            for (int i = 0; i < clientes.size(); i++){
                if(clientes.get(i).getId_cliente() == id){            
                    clientes.get(i).ImprimeCliente();
                    System.out.println("[EDITAR CLIENTE]\n\n");
                    System.out.print("NOME: ");
                    clientes.get(i).setNome(scan.next());
                    System.out.print("CPF: ");
                    clientes.get(i).setCpf(scan.nextInt());
                    System.out.print("RG: ");
                    clientes.get(i).setRg(scan.nextInt());
                    System.out.print("Telefone: ");
                    clientes.get(i).setTelefone(scan.next());
                }
            }
            
        } else {
            System.out.println("Cliente não encontrado");
        }
    }
    
    
    public String getLogin() {
        return login;
    }

    public String getSenha() {
        return senha;
    }
    
    public void setLogin(String login) {
    	this.login = login;
    }
    
    public void setSenha(String senha) {
    	this.senha = senha;
    }
    
    Random random = new Random();
    
    public Funcionario() {       
        this.id_funcionario = random.nextInt()%10000;
    }

    public int getId_funcionario() {
        return id_funcionario;
    }

    public void setId_funcionario(int id_funcionario) {
        this.id_funcionario = id_funcionario;
    }
    
    public void ImprimeFunc(){
        System.out.println("Nome: "+getNome()
                + "\nCPF: "+getCpf()
                + "\nRG: "+getRg()
                + "\nTelefone: "+getTelefone()
                + "\n");
    }

   
}
