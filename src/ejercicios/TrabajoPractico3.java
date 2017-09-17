package ejercicios;

import modelos.Cliente;

/**
 * Modelos
 * @author arielp
 */
public class TrabajoPractico3 {
    
    public void ejercicio1() {
        Cliente cliente1 = new Cliente();
        cliente1.setNombre("Leonel Messi");
        cliente1.setCuit("20-30059658-5");
        cliente1.setEmail("leonel@gmail.com");
        cliente1.setTipo("Delantero");
        
        // Mostrar el Nombre y el Email
        System.out.println("Nombre: " + cliente1.getNombre());
        System.out.println("Email: " + cliente1.getEmail());
    }
}
