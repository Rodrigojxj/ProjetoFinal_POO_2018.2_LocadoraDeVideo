package DAO;

import model.ModelFilme;
import conexoes.ConexaoMySql;
import java.util.ArrayList;
/**
*
* @author Rodrigo
*/
public class DAOFilme extends ConexaoMySql {

    /**
    * Grava Filme
    * @param pModelFilme
    * return int
    */
    public int salvarFilmeDAO(ModelFilme pModelFilme){
        try {
            this.conectar();
            return this.insertSQL(
                "INSERT INTO tbl_filmes ("
                    + "pk_id_filme,"
                    + "fil_titulo,"
                    + "fil_diretor,"
                    + "fil_ano,"
                    + "fil_genero,"
                    + "fil_valorReserva"
                + ") VALUES ("
                    + "'" + pModelFilme.getIdFilme() + "',"
                    + "'" + pModelFilme.getFilTitulo() + "',"
                    + "'" + pModelFilme.getFilDiretor() + "',"
                    + "'" + pModelFilme.getFilAno() + "',"
                    + "'" + pModelFilme.getFilGenero() + "',"
                    + "'" + pModelFilme.getFilValorReserva() + "'"
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
    * Recupera Filme
    * @param pIdFilme
    * return ModelFilme
    */
    public ModelFilme getFilmeDAO(int pIdFilme){
        ModelFilme modelFilme = new ModelFilme();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "pk_id_filme,"
                    + "fil_titulo,"
                    + "fil_diretor,"
                    + "fil_ano,"
                    + "fil_genero,"
                    + "fil_valorReserva"
                 + " FROM"
                     + " tbl_filmes"
                 + " WHERE"
                     + " pk_id_filme = '" + pIdFilme + "'"
                + ";"
            );

            while(this.getResultSet().next()){
                modelFilme.setIdFilme(this.getResultSet().getInt(1));
                modelFilme.setFilTitulo(this.getResultSet().getString(2));
                modelFilme.setFilDiretor(this.getResultSet().getString(3));
                modelFilme.setFilAno(this.getResultSet().getString(4));
                modelFilme.setFilGenero(this.getResultSet().getString(5));
                modelFilme.setFilValorReserva(this.getResultSet().getDouble(6));
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return modelFilme;
    }

    /**
    * Recupera uma lista de Filmes
    * 
    * return listamodelFilme
    */
    public ArrayList<ModelFilme> getListaFilmeDAO(){
        ArrayList<ModelFilme> listamodelFilme = new ArrayList();
        ModelFilme modelFilme = new ModelFilme();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "pk_id_filme,"
                    + "fil_titulo,"
                    + "fil_diretor,"
                    + "fil_ano,"
                    + "fil_genero,"
                    + "fil_valorReserva"
                 + " FROM"
                     + " tbl_filmes"
                + ";"
            );

            while(this.getResultSet().next()){
                modelFilme = new ModelFilme();
                modelFilme.setIdFilme(this.getResultSet().getInt(1));
                modelFilme.setFilTitulo(this.getResultSet().getString(2));
                modelFilme.setFilDiretor(this.getResultSet().getString(3));
                modelFilme.setFilAno(this.getResultSet().getString(4));
                modelFilme.setFilGenero(this.getResultSet().getString(5));
                modelFilme.setFilValorReserva(this.getResultSet().getDouble(6));
                listamodelFilme.add(modelFilme);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return listamodelFilme;
    }

    /**
    * Atualiza Filme
    * @param pModelFilme
    * return boolean
    */
    public boolean atualizarFilmeDAO(ModelFilme pModelFilme){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "UPDATE tbl_filmes SET "
                    + "pk_id_filme = '" + pModelFilme.getIdFilme() + "',"
                    + "fil_titulo = '" + pModelFilme.getFilTitulo() + "',"
                    + "fil_diretor = '" + pModelFilme.getFilDiretor() + "',"
                    + "fil_ano = '" + pModelFilme.getFilAno() + "',"
                    + "fil_genero = '" + pModelFilme.getFilGenero() + "',"
                    + "fil_valorReserva = '" + pModelFilme.getFilValorReserva() + "'"
                + " WHERE "
                    + "pk_id_filme = '" + pModelFilme.getIdFilme() + "'"
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
    * Exclui Filme
    * @param pIdFilme
    * return boolean
    */
    public boolean excluirFilmeDAO(int pIdFilme){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "DELETE FROM tbl_filmes "
                + " WHERE "
                    + "pk_id_filme = '" + pIdFilme + "'"
                + ";"
            );
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }finally{
            this.fecharConexao();
        }
    }

    public ModelFilme getFilmeDAO(String pNomeFilme) {
        ModelFilme modelFilme = new ModelFilme();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "pk_id_filme,"
                    + "fil_titulo,"
                    + "fil_diretor,"
                    + "fil_ano,"
                    + "fil_genero,"
                    + "fil_valorReserva"
                 + " FROM"
                     + " tbl_filmes"
                 + " WHERE"
                     + " fil_titulo = '" + pNomeFilme + "'"
                + ";"
            );

            while(this.getResultSet().next()){
                modelFilme.setIdFilme(this.getResultSet().getInt(1));
                modelFilme.setFilTitulo(this.getResultSet().getString(2));
                modelFilme.setFilDiretor(this.getResultSet().getString(3));
                modelFilme.setFilAno(this.getResultSet().getString(4));
                modelFilme.setFilGenero(this.getResultSet().getString(5));
                modelFilme.setFilValorReserva(this.getResultSet().getDouble(6));
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return modelFilme;
    }

}