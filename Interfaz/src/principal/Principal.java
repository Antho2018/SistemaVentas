package principal;

import javax.swing.JOptionPane;
import javax.swing.UIManager;
import modelo.ModeloEmpleado;
import controlador.Controlador;
import vista.*;


public class Principal {
    
    public static void main(String[] args) {
        
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }            
        
        ModeloEmpleado m = new ModeloEmpleado();
        VEmpleados v = new VEmpleados();
        Controlador c = new Controlador(m, v);
        c.iniciar();
        
    }
    
}
