package ejercicios;

import javax.swing.JFrame;
import javax.swing.JInternalFrame;

/**
 * Interfaces Swing
 * @author arielp
 */
public class TrabajoPractico5 {
    
    public void ejercicio1() {
        JFrame frame = new JFrame();
        frame.setBounds(20, 20, 600, 800);
        frame.setTitle("Trabajo Practico 5");
        frame.setVisible(true);
    }
    
    public void ejercicio2() {
        JFrame frame = new JFrame();
        frame.setBounds(20, 20, 500, 700);
        frame.setTitle("Trabajo Practico 5");
        frame.setVisible(true);
        
        JInternalFrame internalFrame = new JInternalFrame();
        internalFrame.setTitle("Internal Frame");
        internalFrame.setSize(400, 400);
        internalFrame.setVisible(true);
        
        frame.add(internalFrame);
    }
}
