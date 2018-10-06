package classes.locadora;
public class Cliente extends Pessoa{
    int id_cliente;
    endereco endereco;

    public Cliente(int cpf, String telefone, int rg) {
        super(cpf, telefone, rg);
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public endereco getEndereco() {
        return endereco;
    }
    /*CRIAR METODOS DO CLIENTE
    CRIAR CADASTRO
    ALTERAR DADOS DO CADASTRO
    EXCLUIR CADASTRO
    */
}
