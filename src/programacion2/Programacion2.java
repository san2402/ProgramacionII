package programacion2;

import java.util.List;
import modelos.Cliente;
import modelos.Mercaderia;
import servicios.ConexionesBaseDeDatos;

public class Programacion2 {

    public static void main(String[] args) throws Exception {
        ConexionesBaseDeDatos conexiones = new ConexionesBaseDeDatos();

        List<Cliente> clientes = conexiones.buscarTodosLosClientes();

        for (Cliente cliente : clientes) {
//            System.out.println("========\n");
//            System.out.println("id " + cliente.getId());
//            System.out.println("nombre " + cliente.getNombre());
//            System.out.println("email " + cliente.getEmail());
//            System.out.println("cuit " + cliente.getCuit());
//            System.out.println("========\n");
        }
        
        List<Mercaderia> mercaderias = conexiones.buscarTodasLasMercaderias();
        
        for (int i = 0; i < mercaderias.size(); i++) {
            Mercaderia mercaderia = mercaderias.get(i);
//            System.out.println("codigo: " + mercaderia.getCodigo());
//            System.out.println("nombre " + mercaderia.getNombre());
        }

        
        Mercaderia mercaderia = conexiones.buscarMercaderiaPorCodigo("AA01");
        
        System.out.println("Nombre: " + mercaderia.getNombre());
        System.out.println("Peso: " + mercaderia.getPeso());
        System.out.println("Valor: " + mercaderia.getValor());
    }

}
