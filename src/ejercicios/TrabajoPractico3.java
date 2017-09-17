package ejercicios;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import modelos.DetallePedido;
import modelos.Cliente;

/**
 * Listas con Entidades
 * @author arielp
 */
public class TrabajoPractico3 {
    
    /**
     * Ejemplos de listas y objetos.
     */
    public void ejemplo_1() {
        DetallePedido detalle1 = new DetallePedido();
        detalle1.setCantidad(7);
        DetallePedido detalle2 = new DetallePedido();
        detalle2.setCantidad(8);
        DetallePedido detalle3 = new DetallePedido();
        detalle3.setCantidad(9);
        
        List<DetallePedido> detalles = new ArrayList();        
        detalles.add(detalle1);
        detalles.add(detalle2);
        detalles.add(detalle3);
        
        for (int i = 0; i < detalles.size(); i++) {
            DetallePedido detalle = detalles.get(i);
            System.out.println(detalle.getCantidad());
        }
        
        for(DetallePedido detalle : detalles) {
            System.out.println(detalle.getCantidad());
        }
        
        Iterator<DetallePedido> iterator = detalles.listIterator();
        while(iterator.hasNext()) {
            DetallePedido detalle = iterator.next();
            System.out.println(detalle.getCantidad());
        }
    }
    
    /**
     * 1. Crear n clientes y agregarlos a una lista.
     * 2. Recorrer la lista y mostrar un mensaje para cada cliente de la forma:
     *  Cliente Numero: {id}
     *  Nombre: Nombre_{id}
     *  Email: email_{id}@gmail.com
     * @param cantidadClientes 
     * @return  
     */
    public List<Cliente> crearClientes(int cantidadClientes) {
        List<Cliente> clientes = new ArrayList();
        
        for (int i = 1; i <= cantidadClientes; i++) {
            Cliente cliente = new Cliente();
            cliente.setId(i);
            cliente.setNombre("nombre_" + i);
            cliente.setEmail("email_" + i + "gmail.com");
            
            clientes.add(cliente);
        }
        
        this.imprimirLista(clientes);
        
        return clientes;        
    }
    
    private void imprimirLista(List<Cliente> clientes) {
        for(Cliente cliente : clientes) {
            this.imprimirCliente(cliente);
        }
    }
    
    private void imprimirCliente(Cliente cliente) {
        System.out.println("Cliente: " + cliente.getId());
        System.out.println("Nombre: " + cliente.getNombre());
        System.out.println("Email: " + cliente.getEmail());
        System.out.println("");
    }
    
    /**
     * Mostrar todos los clientes
     * @param clientes 
     */
    public void ejercicio_2(List<Cliente> clientes) {        
        this.imprimirLista(clientes);
    }
       
    /**
     * Mostrar solo los clientes impares
     * @param clientes 
     */
    public void ejercicio_3
        (List<Cliente> clientes) {
        
    }
}
