package ejercicios;

/**
 *
 * @author arielp
 */
public class TrabajoPractico1 {
    
    public void ejercicio1() {
        String[] palabras = new String[4];
        palabras[0] = "Esto";
        palabras[1] = "es";
        palabras[2] = "una";
        palabras[3] = "frase";
        
        System.out.println("Forma de Iterar 1");
        for (int i = 0; i < palabras.length; i++) {
            System.out.println(palabras[i]);
        }
        System.out.println("\n");
        
        System.out.println("Forma de Iterar 2");
        for (String palabra : palabras) {
            System.out.println(palabra);
        }
    }
}
