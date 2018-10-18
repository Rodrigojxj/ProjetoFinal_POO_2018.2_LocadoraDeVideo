package locadora;
import java.util.Date;

public class Locacao {
    private int id_Locacao;
    private Cliente Cliente;
    private Filme Filme;
    private float valor;
    private Date Data_loc;
    private Date Data_dev;

    public Locacao(int id_Locacao, Cliente Cliente, Filme Filme, float valor, Date Data_loc, Date Data_dev) {
        this.id_Locacao = id_Locacao;
        this.Cliente = Cliente;
        this.Filme = Filme;
        this.valor = valor;
        this.Data_loc = Data_loc;
        this.Data_dev = Data_dev;
    }

    public int getId_Locacao() {
        return id_Locacao;
    }

    public void setId_Locacao(int id_Locacao) {
        this.id_Locacao = id_Locacao;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public Date getData_loc() {
        return Data_loc;
    }

    public void setData_loc(Date Data_loc) {
        this.Data_loc = Data_loc;
    }

    public Date getData_dev() {
        return Data_dev;
    }

    public void setData_dev(Date Data_dev) {
        this.Data_dev = Data_dev;
    }

    public Cliente getCliente() {
        return Cliente;
    }

    public Filme getFilme() {
        return Filme;
    }
    
    
    //CRIAR MÉTODO DE CRIAR RECEITA
}
