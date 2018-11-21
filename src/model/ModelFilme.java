package model;
/**
*
* @author Rodrigo
*/
public class ModelFilme {

    private int idFilme;
    private String filTitulo;
    private String filDiretor;
    private String filAno;
    private String filGenero;
    private double filValorReserva;

    /**
    * Construtor
    */
    public ModelFilme(){}

    /**
    * seta o valor de idFilme
    * @param pIdFilme
    */
    public void setIdFilme(int pIdFilme){
        this.idFilme = pIdFilme;
    }
    /**
    * return pk_idFilme
    */
    public int getIdFilme(){
        return this.idFilme;
    }

    /**
    * seta o valor de filTitulo
    * @param pFilTitulo
    */
    public void setFilTitulo(String pFilTitulo){
        this.filTitulo = pFilTitulo;
    }
    /**
    * return filTitulo
    */
    public String getFilTitulo(){
        return this.filTitulo;
    }

    /**
    * seta o valor de filDiretor
    * @param pFilDiretor
    */
    public void setFilDiretor(String pFilDiretor){
        this.filDiretor = pFilDiretor;
    }
    /**
    * return filDiretor
    */
    public String getFilDiretor(){
        return this.filDiretor;
    }

    /**
    * seta o valor de filAno
    * @param pFilAno
    */
    public void setFilAno(String pFilAno){
        this.filAno = pFilAno;
    }
    /**
    * return filAno
    */
    public String getFilAno(){
        return this.filAno;
    }

    /**
    * seta o valor de filGenero
    * @param pFilGenero
    */
    public void setFilGenero(String pFilGenero){
        this.filGenero = pFilGenero;
    }
    /**
    * return filGenero
    */
    public String getFilGenero(){
        return this.filGenero;
    }

    /**
    * seta o valor de filValorReserva
    * @param pFilValorReserva
    */
    public void setFilValorReserva(double pFilValorReserva){
        this.filValorReserva = pFilValorReserva;
    }
    /**
    * return filValorReserva
    */
    public double getFilValorReserva(){
        return this.filValorReserva;
    }

    /**
     * Devolve todos os dados do filme
     * @return 
     */
    @Override
    public String toString(){
        return "ModelFilme {" + "::idFilme = " + this.idFilme + "::filTitulo = " + this.filTitulo + "::filDiretor = " + this.filDiretor + "::filAno = " + this.filAno + "::filGenero = " + this.filGenero + "::filValorReserva = " + this.filValorReserva +  "}";
    }
}