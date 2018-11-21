package DAO;

import model.ModelCliente;
import conexoes.ConexaoMySql;
import java.util.ArrayList;
/**
*
* @author Rodrigo
*/
public class DAOCliente extends ConexaoMySql {

    /**
    * Grava Cliente
    * @param pModelCliente
    * return int
    */
    public int salvarClienteDAO(ModelCliente pModelCliente){
        try {
            this.conectar();
            return this.insertSQL(
                "INSERT INTO tbl_cliente ("
                    + "pk_id_cliente,"
                    + "cli_nome,"
                    + "cli_cidade,"
                    + "cli_uf,"
                    + "cli_endereco,"
                    + "cli_bairro,"
                    + "cli_cep,"
                    + "cli_celular,"
                    + "cli_cpf"
                + ") VALUES ("
                    + "'" + pModelCliente.getIdCliente() + "',"
                    + "'" + pModelCliente.getCliNome() + "',"
                    + "'" + pModelCliente.getCliCidade() + "',"
                    + "'" + pModelCliente.getCliUf() + "',"
                    + "'" + pModelCliente.getCliEndereco() + "',"
                    + "'" + pModelCliente.getCliBairro() + "',"
                    + "'" + pModelCliente.getCliCep() + "',"
                    + "'" + pModelCliente.getCliCelular() + "',"
                    + "'" + pModelCliente.getCliCpf() + "'"
                + ");"
            );
        }catch(Exception e){
            e.printStackTrace();
            return 0;
        }finally{
            this.fecharConexao();
        }
    }

    /**
    * Recupera Cliente
    * @param pIdCliente
    * return modelCliente
    */
    public ModelCliente getClienteDAO(int pIdCliente){
        ModelCliente modelCliente = new ModelCliente();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "pk_id_cliente,"
                    + "cli_nome,"
                    + "cli_cidade,"
                    + "cli_uf,"
                    + "cli_endereco,"
                    + "cli_bairro,"
                    + "cli_cep,"
                    + "cli_celular,"
                    + "cli_cpf"
                 + " FROM"
                     + " tbl_cliente"
                 + " WHERE"
                     + " pk_id_cliente = '" + pIdCliente + "'"
                + ";"
            );

            while(this.getResultSet().next()){
                modelCliente.setIdCliente(this.getResultSet().getInt(1));
                modelCliente.setCliNome(this.getResultSet().getString(2));
                modelCliente.setCliCidade(this.getResultSet().getString(3));
                modelCliente.setCliUf(this.getResultSet().getString(4));
                modelCliente.setCliEndereco(this.getResultSet().getString(5));
                modelCliente.setCliBairro(this.getResultSet().getString(6));
                modelCliente.setCliCep(this.getResultSet().getString(7));
                modelCliente.setCliCelular(this.getResultSet().getString(8));
                modelCliente.setCliCpf(this.getResultSet().getString(9));
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return modelCliente;
    }

    /**
    * Recupera uma lista de Cliente
    * 
    * return listamodelCliente
    */
    public ArrayList<ModelCliente> getListaClienteDAO(){
        ArrayList<ModelCliente> listamodelCliente = new ArrayList();
        ModelCliente modelCliente = new ModelCliente();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "pk_id_cliente,"
                    + "cli_nome,"
                    + "cli_cidade,"
                    + "cli_uf,"
                    + "cli_endereco,"
                    + "cli_bairro,"
                    + "cli_cep,"
                    + "cli_celular,"
                    + "cli_cpf"
                 + " FROM"
                     + " tbl_cliente"
                + ";"
            );

            while(this.getResultSet().next()){
                modelCliente = new ModelCliente();
                modelCliente.setIdCliente(this.getResultSet().getInt(1));
                modelCliente.setCliNome(this.getResultSet().getString(2));
                modelCliente.setCliCidade(this.getResultSet().getString(3));
                modelCliente.setCliUf(this.getResultSet().getString(4));
                modelCliente.setCliEndereco(this.getResultSet().getString(5));
                modelCliente.setCliBairro(this.getResultSet().getString(6));
                modelCliente.setCliCep(this.getResultSet().getString(7));
                modelCliente.setCliCelular(this.getResultSet().getString(8));
                modelCliente.setCliCpf(this.getResultSet().getString(9));
                listamodelCliente.add(modelCliente);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return listamodelCliente;
    }

    /**
    * Atualiza Cliente
    * @param pModelCliente
    * return boolean
    */
    public boolean atualizarClienteDAO(ModelCliente pModelCliente){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "UPDATE tbl_cliente SET "
                    + "pk_id_cliente = '" + pModelCliente.getIdCliente() + "',"
                    + "cli_nome = '" + pModelCliente.getCliNome() + "',"
                    + "cli_cidade = '" + pModelCliente.getCliCidade() + "',"
                    + "cli_uf = '" + pModelCliente.getCliUf() + "',"
                    + "cli_endereco = '" + pModelCliente.getCliEndereco() + "',"
                    + "cli_bairro = '" + pModelCliente.getCliBairro() + "',"
                    + "cli_cep = '" + pModelCliente.getCliCep() + "',"
                    + "cli_celular = '" + pModelCliente.getCliCelular() + "',"
                    + "cli_cpf = '" + pModelCliente.getCliCpf() + "'"
                + " WHERE "
                    + "pk_id_cliente = '" + pModelCliente.getIdCliente() + "'"
                + ";"
            );
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }finally{
            this.fecharConexao();
        }
    }

    /**
    * Exclui Cliente
    * @param pIdCliente
    * return boolean
    */
    public boolean excluirClienteDAO(int pIdCliente){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "DELETE FROM tbl_cliente "
                + " WHERE "
                    + "pk_id_cliente = '" + pIdCliente + "'"
                + ";"
            );
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }finally{
            this.fecharConexao();
        }
    }
}