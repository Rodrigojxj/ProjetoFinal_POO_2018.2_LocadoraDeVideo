package classes.locadora;
public class Fornecedor extends endereco{
    int id_Fornecedor;
    String nome;
    String cnpj;
    String telefone;

    public Fornecedor(int id_Fornecedor, String nome, String cnpj, String telefone) {
        this.id_Fornecedor = id_Fornecedor;
        this.nome = nome;
        this.cnpj = cnpj;
        this.telefone = telefone;
    }

    public int getId_Fornecedor() {
        return id_Fornecedor;
    }

    public void setId_Fornecedor(int id_Fornecedor) {
        this.id_Fornecedor = id_Fornecedor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
