package controller;

import model.ModelCliente;
import DAO.DAOCliente;
import java.util.ArrayList;
import model.ModelFilme;

/**
*
* @author Rodrigo
*/
public class ControllerCliente {

    private DAOCliente daoCliente = new DAOCliente();

    /**
    * Salva dados de Cliente
    * @param pModelCliente
    * return int
    */
    public int salvarClienteController(ModelCliente pModelCliente){
        return this.daoCliente.salvarClienteDAO(pModelCliente);
    }

    /**
    * Recupera Cliente
    * @param pIdCliente
    * return modelCliente
    */
    public ModelCliente getClienteController(int pIdCliente){
        return this.daoCliente.getClienteDAO(pIdCliente);
    }

    /**
    * Recupera uma lista de Clientes
    * 
    * return listamodelCliente
    */
    public ArrayList<ModelCliente> getListaClienteController(){
        return this.daoCliente.getListaClienteDAO();
    }

    /**
    * Atualiza dados do Cliente
    * @param pModelCliente
    * return boolean
    */
    public boolean atualizarClienteController(ModelCliente pModelCliente){
        return this.daoCliente.atualizarClienteDAO(pModelCliente);
    }

    /**
    * Exclui um Cliente
    * @param pIdCliente
    * return boolean
    */
    public boolean excluirClienteController(int pIdCliente){
        return this.daoCliente.excluirClienteDAO(pIdCliente);
    }

    public ModelFilme getFilmeController(int parseInt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}