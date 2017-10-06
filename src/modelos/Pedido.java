package modelos;

import java.util.Date;
import java.util.List;

public class Pedido {
    
    private int numeroPedido;
    private Cliente cliente;
    private Date fecha;
    private List<DetallePedido> detalles;

    /**
     * @return the numeroPedido
     */
    public int getNumeroPedido() {
        return numeroPedido;
    }

    /**
     * @return the cliente
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * @param cliente the cliente to set
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    /**
     * @return the fecha
     */
    public Date getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    /**
     * @return the detalles
     */
    public List<DetallePedido> getDetalles() {
        return detalles;
    }

    /**
     * @param detalles the detalles to set
     */
    public void setDetalles(List<DetallePedido> detalles) {
        this.detalles = detalles;
    }
}
