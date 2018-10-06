package classes.locadora;
public class Funcionario extends Pessoa{
    String login;
    String senha;

    public Funcionario(int cpf, String telefone, int rg) {
        super(cpf, telefone, rg);
    }

    public Funcionario(String login, String senha, int cpf, String telefone, int rg) {
        super(cpf, telefone, rg);
        this.login = login;
        this.senha = senha;
    }

    public String getLogin() {
        return login;
    }

    public String getSenha() {
        return senha;
    }
}
    /*CRIAR METODOS DO FUNCIONARIO
    CADASTRAR/ALTERAR/EXCLUIR/BUSCAR CLIENTE
    FAZER LOGIN, CADASTRAR/ALTERAR/EXCLUIR/BUSCAR FILME
    */
