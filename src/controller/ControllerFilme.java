package controller;

import model.ModelFilme;
import DAO.DAOFilme;
import java.util.ArrayList;

/**
*
* @author Rodrigo
*/
public class ControllerFilme {

    private DAOFilme daoFilme = new DAOFilme();

    /**
    * Salva dados do filme
    * @param pModelFilme
    * return int
    */
    public int salvarFilmeController(ModelFilme pModelFilme){
        return this.daoFilme.salvarFilmeDAO(pModelFilme);
    }

    /**
    * Recupera um Filme
    * @param pIdFilme
    * return ModelFilme
    */
    public ModelFilme getFilmeController(int pIdFilme){
        return this.daoFilme.getFilmeDAO(pIdFilme);
    }
    
    public ModelFilme getFilmeController(String pNomeFilme){
        return this.daoFilme.getFilmeDAO(pNomeFilme);
    }

    /**
    * Recupera uma lista de Filmes
    * @param pIdFilme
    * return listamodelFilme
    */
    public ArrayList<ModelFilme> getListaFilmeController(){
        return this.daoFilme.getListaFilmeDAO();
    }

    /**
    * Atualiza dados de um Filme
    * @param pModelFilme
    * return boolean
    */
    public boolean atualizarFilmeController(ModelFilme pModelFilme){
        return this.daoFilme.atualizarFilmeDAO(pModelFilme);
    }

    /**
    * Exclui um Filme
    * @param pIdFilme
    * return boolean
    */
    public boolean excluirFilmeController(int pIdFilme){
        return this.daoFilme.excluirFilmeDAO(pIdFilme);
    }
}