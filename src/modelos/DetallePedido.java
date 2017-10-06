package modelos;

public class DetallePedido {
    
    private int cantidad;
    private Mercaderia mercaderia;

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * @return the mercaderia
     */
    public Mercaderia getMercaderia() {
        return mercaderia;
    }

    /**
     * @param mercaderia the mercaderia to set
     */
    public void setMercaderia(Mercaderia mercaderia) {
        this.mercaderia = mercaderia;
    }
    
    
}
