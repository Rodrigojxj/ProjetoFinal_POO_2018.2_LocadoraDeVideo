package locadora;
import java.util.Date;

public class Pagamento extends Locacao{
    private int id_Pagamento;
    public Locacao Locacao;

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
    
    public Pagamento(int id_Locacao, locadora.Cliente Cliente, locadora.Filme Filme, float valor, Date Data_loc, Date Data_dev) {
        super(id_Locacao, Cliente, Filme, valor, Data_loc, Data_dev);
    }   
}
