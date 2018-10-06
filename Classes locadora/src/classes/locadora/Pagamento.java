package classes.locadora;
import java.util.Date;

public class Pagamento extends Locacao{
    int id_Pagamento;
    Locacao Locacao;

    public int getId_Pagamento() {
        return id_Pagamento;
    }

    public void setId_Pagamento(int id_Pagamento) {
        this.id_Pagamento = id_Pagamento;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
    Date data;
    
    public Pagamento(int id_Locacao, classes.locadora.Cliente Cliente, classes.locadora.Filme Filme, float valor, Date Data_loc, Date Data_dev) {
        super(id_Locacao, Cliente, Filme, valor, Data_loc, Data_dev);
    }   
}