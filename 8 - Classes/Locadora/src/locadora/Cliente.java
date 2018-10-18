package locadora;

import java.util.Random;

public class Cliente extends Pessoa{
    private int id_cliente;
    private Endereco endereco;

    /*public Cliente(int cpf, String telefone, int rg) {
        super(cpf, telefone, rg);
    }*/
    
    Random random = new Random();
    
    public Cliente() {       
        this.id_cliente = random.nextInt()%10000;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public Endereco getEndereco() {
        return endereco;
    }
    
    public Cliente alteraCpfCliente(Cliente c, int cpf) {
    	c.cpf = cpf;
    	return c;
    }
    
    public Cliente alteraRgCliente(Cliente c, int rg) {
    	c.rg = rg;
    	return c;
    }
    
    public Cliente alteraTelefoneCliente(Cliente c, String telefone) {
    	c.telefone = telefone;
    	return c;
    }
    
    public Cliente alteraNomeCliente(Cliente c, String nome) {
    	c.nome = nome;
    	return c;
    }
    
    public void ImprimeCliente(){
        System.out.println("Nome: "+getNome()
                + "\t ID: "+getId_cliente()
                + "\nCPF: "+getCpf()
                + "\nRG: "+getRg()
                + "\nTelefone: "+getTelefone()
                + "\n");
    }
}
