package locadora;

public class Fornecedor extends Endereco{
    private int id_Fornecedor;
    private String nome_forne;
    private String cnpj;
    private String telefone;

    public Fornecedor(int id_Fornecedor, String nome_forne, String cnpj, String telefone) {
        this.id_Fornecedor = id_Fornecedor;
        this.nome_forne = nome_forne;
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
        return nome_forne;
    }

    public void setNome(String nome_forne) {
        this.nome_forne = nome_forne;
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
