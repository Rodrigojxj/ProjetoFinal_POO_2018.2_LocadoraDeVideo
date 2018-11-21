package controller;

import model.ModelUsuario;
import DAO.DAOUsuario;
import java.util.ArrayList;

/**
*
* @author Rodrigo
*/
public class ControllerUsuario {

    private DAOUsuario daoUsuario = new DAOUsuario();

    /**
    * Salva dados do Usuario
    * @param pModelUsuario
    * return int
    */
    public int salvarUsuarioController(ModelUsuario pModelUsuario){
        return this.daoUsuario.salvarUsuarioDAO(pModelUsuario);
    }

    /**
    * Recupera Usuario
    * @param pIdUsuario
    * return ModelUsuario
    */
    public ModelUsuario getUsuarioController(int pIdUsuario){
        return this.daoUsuario.getUsuarioDAO(pIdUsuario);
    }

    /**
    * Recupera uma lista de Usuários
    * @param pIdUsuario
    * return listamodelUsuario
    */
    public ArrayList<ModelUsuario> getListaUsuarioController(){
        return this.daoUsuario.getListaUsuarioDAO();
    }

    /**
    * Atualiza os dados do Usuario
    * @param pModelUsuario
    * return boolean
    */
    public boolean atualizarUsuarioController(ModelUsuario pModelUsuario){
        return this.daoUsuario.atualizarUsuarioDAO(pModelUsuario);
    }

    /**
    * Exclui Usuario
    * @param pIdUsuario
    * return boolean
    */
    public boolean excluirUsuarioController(int pIdUsuario){
        return this.daoUsuario.excluirUsuarioDAO(pIdUsuario);
    }

    /**
     * Valida o usuário para acesso
     * @param pmodelUsuario
     * @return 
     */
    public boolean getValidarUsuarioController(ModelUsuario pmodelUsuario) {
        return this.daoUsuario.getValidarUsuarioDAO(pmodelUsuario);
    }
}