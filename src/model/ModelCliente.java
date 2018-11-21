package model;
/**
*
* @author Rodrigo
*/
public class ModelCliente {

    private int idCliente;
    private String cliNome;
    private String cliCidade;
    private String cliUf;
    private String cliEndereco;
    private String cliBairro;
    private String cliCep;
    private String cliCelular;
    private String cliCpf;

    /**
    * Construtor
    */
    public ModelCliente(){}

    /**
    * seta o valor de idCliente
    * @param pIdCliente
    */
    public void setIdCliente(int pIdCliente){
        this.idCliente = pIdCliente;
    }
    /**
    * return pk_idCliente
    */
    public int getIdCliente(){
        return this.idCliente;
    }

    /**
    * seta o valor de cliNome
    * @param pCliNome
    */
    public void setCliNome(String pCliNome){
        this.cliNome = pCliNome;
    }
    /**
    * return cliNome
    */
    public String getCliNome(){
        return this.cliNome;
    }

    /**
    * seta o valor de cliCidade
    * @param pCliCidade
    */
    public void setCliCidade(String pCliCidade){
        this.cliCidade = pCliCidade;
    }
    /**
    * return cliCidade
    */
    public String getCliCidade(){
        return this.cliCidade;
    }

    /**
    * seta o valor de cliUf
    * @param pCliUf
    */
    public void setCliUf(String pCliUf){
        this.cliUf = pCliUf;
    }
    /**
    * return cliUf
    */
    public String getCliUf(){
        return this.cliUf;
    }

    /**
    * seta o valor de cliEndereco
    * @param pCliEndereco
    */
    public void setCliEndereco(String pCliEndereco){
        this.cliEndereco = pCliEndereco;
    }
    /**
    * return cliEndereco
    */
    public String getCliEndereco(){
        return this.cliEndereco;
    }

    /**
    * seta o valor de cliBairro
    * @param pCliBairro
    */
    public void setCliBairro(String pCliBairro){
        this.cliBairro = pCliBairro;
    }
    /**
    * return cliBairro
    */
    public String getCliBairro(){
        return this.cliBairro;
    }

    /**
    * seta o valor de cliCep
    * @param pCliCep
    */
    public void setCliCep(String pCliCep){
        this.cliCep = pCliCep;
    }
    /**
    * return cliCep
    */
    public String getCliCep(){
        return this.cliCep;
    }

    /**
    * seta o valor de cliCelular
    * @param pCliCelular
    */
    public void setCliCelular(String pCliCelular){
        this.cliCelular = pCliCelular;
    }
    /**
    * return cliCelular
    */
    public String getCliCelular(){
        return this.cliCelular;
    }

    /**
    * seta o valor de cliCpf
    * @param pCliCpf
    */
    public void setCliCpf(String pCliCpf){
        this.cliCpf = pCliCpf;
    }
    /**
    * return cliCpf
    */
    public String getCliCpf(){
        return this.cliCpf;
    }

    /**
     * Devolve todos os dados do cliente
     * @return 
     */
    @Override
    public String toString(){
        return "ModelCliente {" + "::idCliente = " + this.idCliente + "::cliNome = " + this.cliNome + "::cliCidade = " + this.cliCidade + "::cliUf = " + this.cliUf + "::cliEndereco = " + this.cliEndereco + "::cliBairro = " + this.cliBairro + "::cliCep = " + this.cliCep + "::cliCelular = " + this.cliCelular + "::cliCpf = " + this.cliCpf +  "}";
    }
}