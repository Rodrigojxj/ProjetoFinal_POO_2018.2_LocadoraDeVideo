package locadora;
import java.util.Date;

public class Reserva {
    private int id_Reserva;
    private Filme Filme;
    private Cliente Cliente;
    private Date dataLoc;
    private Date dataDev;

    public Reserva(int id_Reserva, Filme Filme, Cliente Cliente, Date dataLoc, Date dataDev) {
        this.id_Reserva = id_Reserva;
        this.Filme = Filme;
        this.Cliente = Cliente;
        this.dataLoc = dataLoc;
        this.dataDev = dataDev;
    }

    public int getId_Reserva() {
        return id_Reserva;
    }

    public void setId_Reserva(int id_Reserva) {
        this.id_Reserva = id_Reserva;
    }

    public Date getDataLoc() {
        return dataLoc;
    }

    public void setDataLoc(Date dataLoc) {
        this.dataLoc = dataLoc;
    }

    public Date getDataDev() {
        return dataDev;
    }

    public void setDataDev(Date dataDev) {
        this.dataDev = dataDev;
    }

    public Filme getFilme() {
        return Filme;
    }

    public Cliente getCliente() {
        return Cliente;
    }


}
