package ejercicios;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;

/**
 * Interfaces Swing
 * @author arielp
 */
public class TrabajoPractico5 {
    
    public void ejercicio1() {
        JFrame frame = new JFrame();
        frame.setLayout(null);
        frame.setBounds(20, 20, 600, 800);
        frame.setTitle("Trabajo Practico 5");
        frame.setVisible(true);
    }
    
    public void ejercicio2() {
        JFrame frame = new JFrame();
        frame.setLayout(null);
        frame.setBounds(20, 20, 600, 800);
        frame.setTitle("Trabajo Practico 5");
        frame.setVisible(true);
        
        JInternalFrame internalFrame = new JInternalFrame();
        internalFrame.setTitle("Internal Frame");
        internalFrame.setBackground(Color.red);
        internalFrame.setBounds(10, 20, 400, 400);
        
        frame.add(internalFrame);
        internalFrame.setVisible(true);
    }
    
    /**
     * Construir un Frame con titulo "Ejercicio 3", e incluir un internal frame
     * con titulo "Interno".
     * El internal frame tiene que ser un cuadrado, y tener fondo azul.
     */
    public void ejercicio3() {
        
    }
}
